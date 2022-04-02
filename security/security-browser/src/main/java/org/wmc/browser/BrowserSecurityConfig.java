package org.wmc.browser;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 浏览器环境下安全配置主类
 * 
 */
@EnableWebSecurity
@Configuration
public class BrowserSecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.formLogin()
				.and()
				.authorizeRequests()//表示下面是认证的配置
				.anyRequest()//任何请求
				.authenticated();//都需要身份认证
	}
}