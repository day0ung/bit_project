package com.palette.model;

public class GroupMemberDto {
	
	private int groupInfoSeq;
	private int memberSeq;
	private int del;
	
	public GroupMemberDto() {
	
	}

	public GroupMemberDto(int groupInfoSeq, int memberSeq, int del) {
		super();
		this.groupInfoSeq = groupInfoSeq;
		this.memberSeq = memberSeq;
		this.del = del;
	}

	@Override
	public String toString() {
		return "GroupMemberDto [groupInfoSeq=" + groupInfoSeq + ", memberSeq=" + memberSeq + ", del=" + del + "]";
	}

	public int getGroupInfoSeq() {
		return groupInfoSeq;
	}

	public void setGroupInfoSeq(int groupInfoSeq) {
		this.groupInfoSeq = groupInfoSeq;
	}

	public int getMemberSeq() {
		return memberSeq;
	}

	public void setMemberSeq(int memberSeq) {
		this.memberSeq = memberSeq;
	}

	public int getDel() {
		return del;
	}

	public void setDel(int del) {
		this.del = del;
	}
	
	
}
