package com.chinasoft.ssm.po;

public class MyUserTable {

	private Integer id;
	private String uname;
	private String upwd;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public MyUserTable(Integer id, String uname, String upwd) {
		super();
		this.id = id;
		this.uname = uname;
		this.upwd = upwd;
	}
	public MyUserTable() {
		super();
		
	}
	
}
