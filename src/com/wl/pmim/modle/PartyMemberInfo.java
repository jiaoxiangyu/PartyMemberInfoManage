package com.wl.pmim.modle;

import java.util.Date;

/*
 * 党员信息类
 * 属性：id、姓名、年龄、籍贯、出生日期、籍贯、身份证号、身份附件、入党日期、职务、介绍人、所在党支部、注册时间、手机号
 */
public class PartyMemberInfo extends UserInfo{
	private int ptm_Id;
	private String name;
	private int age;
	private String nation;
	private Date birthdate;
	private String nativePlace;
	private String idCard;
	private String idAccessory;
	private Date joinPartyDate;
	private String duties;
	private String introducer;
	private String partyBranch;
	private Date loginDate;
	private String phoneNo;
	public int getPtm_Id() {
		return ptm_Id;
	}
	public void setPtm_Id(int ptm_Id) {
		this.ptm_Id = ptm_Id;
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
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public String getNativePlace() {
		return nativePlace;
	}
	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getIdAccessory() {
		return idAccessory;
	}
	public void setIdAccessory(String idAccessory) {
		this.idAccessory = idAccessory;
	}
	public Date getJoinPartyDate() {
		return joinPartyDate;
	}
	public void setJoinPartyDate(Date joinPartyDate) {
		this.joinPartyDate = joinPartyDate;
	}
	public String getDuties() {
		return duties;
	}
	public void setDuties(String duties) {
		this.duties = duties;
	}
	public String getIntroducer() {
		return introducer;
	}
	public void setIntroducer(String introducer) {
		this.introducer = introducer;
	}
	public String getPartyBranch() {
		return partyBranch;
	}
	public void setPartyBranch(String partyBranch) {
		this.partyBranch = partyBranch;
	}
	public Date getLoginDate() {
		return loginDate;
	}
	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String toString() {
		return "PartyMemberInfo [ptm_Id=" + ptm_Id + ", name=" + name + ", age=" + age + ", nation=" + nation
				+ ", birthdate=" + birthdate + ", nativePlace=" + nativePlace + ", idCard=" + idCard + ", idAccessory="
				+ idAccessory + ", joinPartyDate=" + joinPartyDate + ", duties=" + duties + ", introducer=" + introducer
				+ ", partyBranch=" + partyBranch + ", loginDate=" + loginDate + ", phoneNo=" + phoneNo + "]";
	}	    
}
