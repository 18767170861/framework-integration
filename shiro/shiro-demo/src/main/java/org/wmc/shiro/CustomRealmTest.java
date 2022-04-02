package org.wmc.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.subject.Subject;
import org.junit.Test;

public class CustomRealmTest {
  @Test
  public void testAuthentication(){
    CustomRealm myRealm = new CustomRealm();

    //1.构建SecurityManager环境
    DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();
    defaultSecurityManager.setRealm(myRealm);

    HashedCredentialsMatcher matcher = new HashedCredentialsMatcher();
    matcher.setHashAlgorithmName("MD5");
    matcher.setHashIterations(1);

    myRealm.setCredentialsMatcher(matcher);

    //2.主题提交认证
    SecurityUtils.setSecurityManager(defaultSecurityManager);

    Subject subject = SecurityUtils.getSubject();

    UsernamePasswordToken token = new UsernamePasswordToken("Mark", "1234567");
    subject.login(token);

    System.out.println("isAuthenticated:" + subject.isAuthenticated());

        /*subject.checkRole("admin");

        subject.checkPermission("user:delete");*/
  }
}