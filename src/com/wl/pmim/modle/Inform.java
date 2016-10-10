package com.wl.pmim.modle;

import java.util.Date;

/*
 * 通知类
 * 属性：id、标题、内容、发件人、日期
 */
public class Inform {
	private int info_Id;
	private String title;
	private String content;
	private String addresser;
	private Date sendDate;
	public int getInfo_Id() {
		return info_Id;
	}
	public void setInfo_Id(int info_Id) {
		this.info_Id = info_Id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAddresser() {
		return addresser;
	}
	public void setAddresser(String addresser) {
		this.addresser = addresser;
	}
	public Date getSendDate() {
		return sendDate;
	}
	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}
	public String toString() {
		return "Inform [info_Id=" + info_Id + ", title=" + title + ", content=" + content + ", addresser=" + addresser
				+ ", sendDate=" + sendDate + "]";
	}    
}
