package com.wl.pmim.modle;
/*
 * 考试记录类
 * 属性：id、所属党员Id、考试成绩、考试时间
 */
public class ExamLog {
	private int el_Id;
	private int partyMemberId;
	private int socre;
	private String examTime;
	public int getEl_Id() {
		return el_Id;
	}
	public void setEl_Id(int el_Id) {
		this.el_Id = el_Id;
	}
	public int getPartyMemberId() {
		return partyMemberId;
	}
	public void setPartyMemberId(int partyMemberId) {
		this.partyMemberId = partyMemberId;
	}
	public int getSocre() {
		return socre;
	}
	public void setSocre(int socre) {
		this.socre = socre;
	}
	public String getExamTime() {
		return examTime;
	}
	public void setExamTime(String examTime) {
		this.examTime = examTime;
	}
	public String toString() {
		return "ExamLog [el_Id=" + el_Id + ", partyMemberId=" + partyMemberId + ", socre=" + socre + ", examTime="
				+ examTime + "]";
	}    
}
