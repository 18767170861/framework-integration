package org.wmc.mall;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.wmc.mall.consts.MallConst;
import org.wmc.mall.exception.UserLoginException;
import org.wmc.mall.pojo.User;

@Slf4j
public class UserLoginInterceptor implements HandlerInterceptor {

	/**
	 * true 表示继续流程，false表示中断
	 * @param request
	 * @param response
	 * @param handler
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		log.info("preHandle...");
		User user = (User) request.getSession().getAttribute(MallConst.CURRENT_USER);
		if (user == null) {
			log.info("user=null");
			throw new UserLoginException();
//			response.getWriter().print("error");
//			return false;
//			return ResponseVo.error(ResponseEnum.NEED_LOGIN);
		}
		return true;
	}
}
