package com.chinasoft.ssm.service;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;

import com.chinasoft.ssm.entity.MyUser;

public interface IUserService {

	public String register(MyUser user);
	
	public String login(MyUser user,Model model,HttpSession session);
	
	public String selectAllUserByPage(Model model,int currentPage);
	
}
