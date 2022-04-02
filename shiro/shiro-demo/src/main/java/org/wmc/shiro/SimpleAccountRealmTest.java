package org.wmc.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.SimpleAccountRealm;
import org.apache.shiro.subject.Subject;
import org.junit.Before;
import org.junit.Test;

public class SimpleAccountRealmTest {
  SimpleAccountRealm simpleAccountRealm = new SimpleAccountRealm();

  //参数依次为 用户名 密码 授权角色
  @Before
  public void addUser(){
    simpleAccountRealm.addAccount("Mark","123456","admin");
  }

  @Test
  public void testAuthentication(){
    //1.构建SecurityManager环境
    DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();
    defaultSecurityManager.setRealm(simpleAccountRealm);

    //2.主题提交认证 shiro提供的SecurityUtils
    SecurityUtils.setSecurityManager(defaultSecurityManager);

    Subject subject = SecurityUtils.getSubject();

    UsernamePasswordToken token = new UsernamePasswordToken("Mark", "123456");
    subject.login(token);

    System.out.println("isAuthenticated:" + subject.isAuthenticated());

    //检查当前主体是否含有admin角色
    subject.checkRole("admin");
    //退出
    subject.logout();

  }
}
