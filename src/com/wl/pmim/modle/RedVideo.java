package com.wl.pmim.modle;
/*
 * 红色视频类
 * 属性：id、描述、路径、观看次数、是否开启
 */
public class RedVideo {
	private int rv_Id;
	private String description;
	private String videoUrl;
	private int watchNum;
	private Boolean open;
	public int getRv_Id() {
		return rv_Id;
	}
	public void setRv_Id(int rv_Id) {
		this.rv_Id = rv_Id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getVideoUrl() {
		return videoUrl;
	}
	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}
	public int getWatchNum() {
		return watchNum;
	}
	public void setWatchNum(int watchNum) {
		this.watchNum = watchNum;
	}
	public Boolean getOpen() {
		return open;
	}
	public void setOpen(Boolean open) {
		this.open = open;
	}
	public String toString() {
		return "RedVideo [rv_Id=" + rv_Id + ", description=" + description + ", videoUrl=" + videoUrl + ", watchNum="
				+ watchNum + ", open=" + open + "]";
	}	  
}
