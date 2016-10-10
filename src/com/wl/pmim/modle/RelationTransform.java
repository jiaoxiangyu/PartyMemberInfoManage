package com.wl.pmim.modle;
/*
 * 关系转接类
 * 属性：id、原党支部，新党支部、转接时间、党员id、转接证明附件
 */
public class RelationTransform {
	private int rtf_Id;
	private String oldPartyBranch;
	private String newPartyBranch;
	private String transformDate;
	private int partyMemberId;
	private String proveAccessory;
	public int getRtf_Id() {
		return rtf_Id;
	}
	public void setRtf_Id(int rtf_Id) {
		this.rtf_Id = rtf_Id;
	}
	public String getOldPartyBranch() {
		return oldPartyBranch;
	}
	public void setOldPartyBranch(String oldPartyBranch) {
		this.oldPartyBranch = oldPartyBranch;
	}
	public String getNewPartyBranch() {
		return newPartyBranch;
	}
	public void setNewPartyBranch(String newPartyBranch) {
		this.newPartyBranch = newPartyBranch;
	}
	public String getTransformDate() {
		return transformDate;
	}
	public void setTransformDate(String transformDate) {
		this.transformDate = transformDate;
	}
	public int getPartyMemberId() {
		return partyMemberId;
	}
	public void setPartyMemberId(int partyMemberId) {
		this.partyMemberId = partyMemberId;
	}
	public String getProveAccessory() {
		return proveAccessory;
	}
	public void setProveAccessory(String proveAccessory) {
		this.proveAccessory = proveAccessory;
	}
	public String toString() {
		return "RelationTransform [rtf_Id=" + rtf_Id + ", oldPartyBranch=" + oldPartyBranch + ", newPartyBranch="
				+ newPartyBranch + ", transformDate=" + transformDate + ", partyMemberId=" + partyMemberId
				+ ", proveAccessory=" + proveAccessory + "]";
	}   
}
