package com.example.controller;

import com.example.authenticate.UserData;
import com.example.mode.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author TonyC
 * @date 2017/8/22 17:05
 * @version 1.0.0  HomeController
 * @email cpy2013@sina.com
 **/
@Controller
public class HomeController
{

	// 添加日志
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);



	@RequestMapping(value = "/loginHome")
	public String person(Model model)
	{
		logger.debug("login.........");
		return "login";
	}

	@RequestMapping(value = "/home")
	public String home(Model model)
	{
		logger.debug("========== home");

		String date = new SimpleDateFormat("yyyy-MM-dd HH24:mm:ss").format(new Date());
		model.addAttribute("serverTime", date);
		return "userList";
	}


	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(HttpServletRequest request ,Model model)
	{
		logger.debug("login============");
		String name = request.getParameter("name");
		String password = request.getParameter("password");


		if (name == null || "".equals(name))
		{
			model.addAttribute("errorName", "用户名不能为空");
			return "login";
		}
		if(password == null || "".equals(password))
		{
			model.addAttribute("errorPassword", "密码不能为空");
			return "login";
		}

		User user = UserData.getUd().userGet(name);
		if(user==null||!user.getPassword().equals(password))
		{
			model.addAttribute("errorResult", "用户不存在或密码不正确");
			return "login";
		}

		request.getSession().setAttribute(request.getSession().getId(), user);

		List<User> list = UserData.getUd().getList();
		model.addAttribute("userList", list);
		return "userList";
	}

	@RequestMapping(value = "/userAddPage")
	public String userAddPage(Model model)
	{
		logger.debug("userAddPage=====================");
		return "userAdd";
	}

	@RequestMapping(value = "/userAdd", method = RequestMethod.POST)
	public String userAdd(HttpServletRequest request ,Model model)
	{
		logger.debug("userAdd============");
		String name = request.getParameter("name");
		String password = request.getParameter("password");


		if (name == null || "".equals(name))
		{
			model.addAttribute("errorName", "用户名不能为空");
			return "userAdd";
		}
		if(password == null || "".equals(password))
		{
			model.addAttribute("errorPassword", "密码不能为空");
			return "userAdd";
		}
		User user = new User();
		user.setId(UUID.randomUUID().toString());
		user.setName(name);
		user.setPassword(password);
		UserData.getUd().userAdd(user);


		return "login";
	}


}