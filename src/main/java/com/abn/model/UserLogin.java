package com.abn.model;

public class UserLogin {

	public String userName;
	public String pwd;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	@Override
	public String toString() {
		return userName +"---"+ pwd;
	}
	
}
