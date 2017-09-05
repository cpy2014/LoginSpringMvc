package com.example.authenticate;

import com.example.controller.HomeController;
import com.example.mode.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author TonyC
 * @version 1.0.0  HandlerInterceptor
 * @date 2017/9/4 14:40
 * @email cpy2013@sina.com
 */
public class HandlerInterceptor extends HandlerInterceptorAdapter
{
	private List<String> excludedUrls;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * 在业务处理器处理请求之前被调用
	 * 如果返回false 则退出本拦截器，本拦截器后面的postHandle与afterCompletion不再执行
	 * @param request
	 * @param response
	 * @param handler
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception
	{
		logger.debug("HandlerInterceptor ========= preHandle");
		// TODO

		String requestUri = request.getRequestURI();
		for (String url : excludedUrls)
		{
			if (requestUri.contains(url))
			{
				return true;
			}
		}

		HttpSession session = request.getSession();

		String sessionId = session.getId();
		User login = (User) session.getAttribute(sessionId);
		System.out.println(login);
		if (login == null )
		{
			response.sendRedirect(request.getContextPath() + "/loginHome");
		}




		return true;
	}

	/**
	 * 在业务处理器处理请求执行完成后,生成视图之前执行的动作
	 * @param request
	 * @param response
	 * @param handler
	 * @param modelAndView
	 * @throws Exception
	 */
	@Override
	public void postHandle(
			HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
			throws Exception
	{
		logger.debug("HandlerInterceptor ========= postHandle");
	}

	/**
	 * 在DispatcherServlet完全处理完请求后被调用
	 * 当拦截器抛出异常时,依然会从当前拦截器往回执行所的拦截器的afterCompletion()
	 * @param request
	 * @param response
	 * @param handler
	 * @param ex
	 * @throws Exception
	 */
	@Override
	public void afterCompletion(
			HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception
	{
		logger.debug("HandlerInterceptor ========= afterCompletion");
	}

	@Override
	public void afterConcurrentHandlingStarted(
			HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception
	{
		logger.debug("HandlerInterceptor ========= afterConcurrentHandlingStarted");
	}

	public List<String> getExcludedUrls()
	{
		return excludedUrls;
	}

	public void setExcludedUrls(List<String> excludedUrls)
	{
		this.excludedUrls = excludedUrls;
	}
}
