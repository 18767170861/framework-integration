package org.wmc.shiro;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.jdbc.JdbcRealm;
import org.apache.shiro.subject.Subject;
import org.junit.Test;

public class JdbcRealmTest {
  DruidDataSource dataSource = new DruidDataSource();
  {
    dataSource.setUrl("jdbc:mysql://localhost:3306/mp?serverTimezone=GMT%2B8&useSSL=false&characterEncoding=utf8");
    dataSource.setUsername("root");
    dataSource.setPassword("123456");
  }

  @Test
  public void testAuthentication(){
    JdbcRealm jdbcRealm = new JdbcRealm();
    jdbcRealm.setDataSource(dataSource);
    //开启查询权限的开关（默认是关闭的）否则Shiro是不会去查询权限数据的
    jdbcRealm.setPermissionsLookupEnabled(true);
    String sql = "select password from test_user where user_name = ?";
    jdbcRealm.setAuthenticationQuery(sql);

    String roleSql = "select role_name from test_user_role where user_name = ?";
    jdbcRealm.setUserRolesQuery(roleSql);

    //1.构建SecurityManager环境
    DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();
    defaultSecurityManager.setRealm(jdbcRealm);

    //2.主题提交认证
    SecurityUtils.setSecurityManager(defaultSecurityManager);

    Subject subject = SecurityUtils.getSubject();

    UsernamePasswordToken token = new UsernamePasswordToken("xiaoming", "654321");
    subject.login(token);

    System.out.println("isAuthenticated:" + subject.isAuthenticated());

    subject.checkRole("user");

    subject.checkPermission("user:select");
  }
}
