package com.wl.pmim.modle;
/*
 * 红色文章类
 * 属性：id、标题、内容路径、阅读次数、是否开启（仅供团委书记点读）
 */
public class RedPaper {
	private int rp_Id;
	private String title;
	private String contentUrl;
	private int readNum;
	private Boolean open;
	public int getRp_Id() {
		return rp_Id;
	}
	public void setRp_Id(int rp_Id) {
		this.rp_Id = rp_Id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContentUrl() {
		return contentUrl;
	}
	public void setContentUrl(String contentUrl) {
		this.contentUrl = contentUrl;
	}
	public int getReadNum() {
		return readNum;
	}
	public void setReadNum(int readNum) {
		this.readNum = readNum;
	}
	public Boolean getOpen() {
		return open;
	}
	public void setOpen(Boolean open) {
		this.open = open;
	}
	public String toString() {
		return "RedPaper [rp_Id=" + rp_Id + ", title=" + title + ", contentUrl=" + contentUrl + ", readNum=" + readNum
				+ ", open=" + open + "]";
	}
    
}
