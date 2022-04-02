package org.wmc.mall.service;

import org.wmc.mall.pojo.User;
import org.wmc.mall.vo.ResponseVo;

public interface IUserService {

	/**
	 * 注册
	 */
	ResponseVo<User> register(User user);

	/**
	 * 登录
	 */
	ResponseVo<User> login(String username, String password);
}
