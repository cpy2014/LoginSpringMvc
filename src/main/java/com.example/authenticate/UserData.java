package com.example.authenticate;

import com.example.mode.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author TonyC
 * @date 2017/9/1 14:07
 * @version 1.0.0  UserData
 * @email cpy2013@sina.com
 **/
public class UserData
{

	private Map<String,User> userMap = new HashMap<>();

	private static final UserData ud = new UserData();

	private UserData(){}

	public static UserData getUd()
	{
		return ud;
	}


	public List<User> getList()
	{
		List<User> list = new ArrayList<>();

		for (User user: userMap.values())
		{
			list.add(user);
			System.out.println(user);
		}
		return list;
	}


	public void userAdd(User user)
	{
		this.userMap.put(user.getName(), user);
	}
		
	public User userGet(String name)
	{
		User user = this.userMap.get(name);
		return user;
	}

	public void userDelete(String name)
	{
		this.userMap.remove(name);
	}
}
