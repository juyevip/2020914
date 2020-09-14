package com.chinasoft.ssm.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.chinasoft.ssm.dao.IUserDao;
import com.chinasoft.ssm.entity.MyUser;
@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao  userDao;
	
	@Override
	public String register(MyUser user) {
		//业务处理
		 if(userDao.register(user) >0)
		 {
			 return "login";
		 }
		 else
		 {
			 return "register";
		 }
		 
	}

	@Override
	public String login(MyUser user, Model model, HttpSession session) {
		  if(userDao.loginUser(user).size() > 0)
		  {
			  session.setAttribute("myuser", user);
			  return "redirect:/selectAllUserByPage?currentPage=1";
		  }
		  model.addAttribute("errorMessage", "用户名和密码有误!!");
		  return "login";
		  
	}

	@Override
	public String selectAllUserByPage(Model model, int currentPage) {
	List<Map<String,Object>> allUser = userDao.selectAll();
	
	//求出共多少个用户
	 int totalCount = allUser.size();
	 //计算多少页
	 int pageSize = 3;
	 int totalPage = (int) Math.ceil(totalCount*1.0/pageSize);
	 List<Map<String,Object>> userByPage = userDao.selectAllUserByPage((currentPage-1)*pageSize, pageSize);
	 model.addAttribute("allUser", userByPage);
	 model.addAttribute("totalPage", totalPage);
	 model.addAttribute("currentPage", currentPage);
	 
		return "main";
	}

}
