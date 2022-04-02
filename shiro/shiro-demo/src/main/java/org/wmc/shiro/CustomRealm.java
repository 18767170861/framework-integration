package org.wmc.shiro;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

public class CustomRealm extends AuthorizingRealm {
  Map<String,String> userMap = new HashMap<String,String>();
  {
    userMap.put("Mark","d40fdd323f5322ff34a41f026f35cf20");
  }

  //授权方法
  @Override
  protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
    String username = (String) principalCollection.getPrimaryPrincipal();
    //从数据库或者缓存中获取角色数据/
    Set<String> roles = getRolesByUsername(username);

    Set<String>  permissions = getPermissionsByUsername(username);

    SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
    simpleAuthorizationInfo.setRoles(roles);
    simpleAuthorizationInfo.setStringPermissions(permissions);
    return simpleAuthorizationInfo;
  }

  private Set<String> getPermissionsByUsername(String username) {
    Set<String> sets = new HashSet<>();
    sets.add("user:delete");
    sets.add("user:add");
    return sets;
  }

  private Set<String> getRolesByUsername(String username) {
    Set<String> sets = new HashSet<>();
    sets.add("admin");
    sets.add("user");
    return sets;
  }

  //认证方法 AuthenticationToken authenticationToken就是主体传过来的认证信息
  @Override
  protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
    //1.从主体传过来的认证信息中，获取用户名
    String username = (String) authenticationToken.getPrincipal();

    //2.通过用户名到数据库中获取凭证
    String password= getPasswordByUsername(username);
    if (password == null){
      return null;
    }
    SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo
        ("Mark", password,"customRealm");
    simpleAuthenticationInfo.setCredentialsSalt(ByteSource.Util.bytes("Mark"));
    return simpleAuthenticationInfo;
  }

  //模拟数据库查询凭证
  private String getPasswordByUsername(String username) {
    return userMap.get(username);
  }

  public static void main(String[] args) {
    String salt = "Mark";//UUID.randomUUID().toString();
    Md5Hash md5Hash = new Md5Hash("1234567",salt);
    System.out.println(md5Hash.toString());
  }

}