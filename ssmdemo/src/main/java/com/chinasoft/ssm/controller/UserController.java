package com.chinasoft.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chinasoft.ssm.dao.IUserDao;
import com.chinasoft.ssm.entity.MyUser;
import com.chinasoft.ssm.service.UserServiceImpl;

@Controller
public class UserController {

	@Autowired
	IUserDao  dao;
	
	@Autowired
	UserServiceImpl us;
	
	@RequestMapping("/")
	public String hello()
	{
		return "index";
	}
	
	@RequestMapping("/toLogin")
	public String loginuser()
	{
		return "login";
	}
	@RequestMapping("/toRegister")
	public String Register()
	{
		return "register";
	}
	@RequestMapping("/find")
	public String findUser(HttpServletRequest request,HttpSession session,Model model)
	{
		List<MyUser> list = dao.findAllUser();
		request.setAttribute("list", list);
		session.setAttribute("list1", list);
		
		return "index";
	}
	
	@RequestMapping("/selectAllUserByPage")
	public  String selectAllUserByPage(Model model,int currentPage)
	{
		return us.selectAllUserByPage(model, currentPage);
	}
	
	@RequestMapping("/login")
	public String login(MyUser user,Model model,HttpSession session)
	{
		System.out.println(user);
		return us.login(user, model, session);
	}
	@RequestMapping("/register")
	public String registerUser(MyUser user)
	{
		    return us.register(user);
	}
	
	
}
