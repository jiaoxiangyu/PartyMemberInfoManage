package com.wl.pmim.modle;
/***
 * 
 * 用户类
 * 属性：id、用户身份、用户名、登录密码
 *
 */

public class UserInfo {
	private int user_Id;
	private String sort;
	private String username;	
	private String password;
	public int getUser_Id() {
		return user_Id;
	}
	public void setUser_Id(int user_Id) {
		this.user_Id = user_Id;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String toString() {
		return "UserInfo [user_Id=" + user_Id + ", sort=" + sort + ", username=" + username + ", password=" + password
				+ "]";
	}		
}
