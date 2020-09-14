package com.chinasoft.ssm.entity;

public class MyUser {

	//成员变量
	private String uname; //用户名
	private String pwd; //密码
	
	//成员方法getter/setter
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	//构造方法
	
	public MyUser(String uname, String pwd) {
		super();
		this.uname = uname;
		this.pwd = pwd;
	}
	public MyUser() {
		
	}
	
	
	
}
