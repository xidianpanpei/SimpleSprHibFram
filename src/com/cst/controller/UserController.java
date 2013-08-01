/** 
 * 文 件 名 : UserController.java
 * 版权：CopyRright (c) 2008-xxxx: 
 * 描述： 
 * 修改人： crazylion
 * 修改时间： 2013年7月14日
 * 跟踪单号： 
 * 修改单号： 
 * 修改内容： 
 */
package com.cst.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cst.dao.DaoImpl;
import com.cst.model.Users;
import com.cst.service.UsersService;

/**
 * @author crazylion
 * 
 */
@Controller
@RequestMapping("controller")
public class UserController
{
	@Resource
	private DaoImpl daoImpl;
	
	@Resource
	private UsersService usersService;

	public void setDaoImpl(DaoImpl daoImpl)
	{
		this.daoImpl = daoImpl;
	}

	public DaoImpl getdaoImpl()
	{
		return daoImpl;
	}
	
	public UsersService getUsersService()
	{
		return usersService;
	}
	
	public void setUsersService(UsersService usersService)
	{
		this.usersService = usersService;
	}

	@RequestMapping(value = "/addUser.do", method = RequestMethod.POST)
	public void addUsers(HttpServletRequest request,
			HttpServletResponse response)
	{
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Users u = new Users();
		u.setUsername(username);
		u.setPassword(password);
		usersService.addUser(u);
	}
}
