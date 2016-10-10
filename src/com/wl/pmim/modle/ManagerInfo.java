package com.wl.pmim.modle;
/*
 * 管理员信息
 * 属性：id、姓名、年龄、手机号
 */

public class ManagerInfo extends UserInfo{
	private int manager_Id;
	private String name;
	private int age;
	private String phoneNo;
	public int getManager_Id() {
		return manager_Id;
	}
	public void setManager_Id(int manager_Id) {
		this.manager_Id = manager_Id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String toString() {
		return "ManagerInfo [manager_Id=" + manager_Id + ", name=" + name + ", age=" + age + ", phoneNo=" + phoneNo
				+ "]";
	}	
}
