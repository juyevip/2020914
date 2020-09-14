package com.chinasoft.ssm.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.chinasoft.ssm.entity.MyUser;
import com.chinasoft.ssm.po.MyUserTable;

@Mapper
public interface IUserDao {

	/**
	 * A用户登录
	 * @param user
	 * @return
	 */
	public MyUser Login(MyUser user);
	/**
	 * A用户注册
	 * @param user
	 * @return
	 */
	public int register(MyUser user);
	/**
	 * A查询所有用户
	 * @return
	 */
	public List<MyUser> findAllUser();
	public  int deleteUser(MyUser user);
	public  int updateUser(MyUser user);
	//用户登录，返回集合
	public List<MyUserTable>  loginUser(MyUser user);
	//分页方法
	public List<Map<String,Object>> selectAllUserByPage(@Param("startIndex") 
	  int startindex,@Param("perPageSize") int perPageSize);
	//查询所有用户
	 public List<Map<String,Object>> selectAll();
	
	
	
}
