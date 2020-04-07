package com.palette.model;

public class GroupMemberDto {
	
	private int groupInfoSeq;
	private int memberSeq;
	private int del;
	
	private MemberDto memberDto;
	
	public GroupMemberDto() {
	
	}

	public GroupMemberDto(int groupInfoSeq, int memberSeq, int del, MemberDto memberDto) {
		super();
		this.groupInfoSeq = groupInfoSeq;
		this.memberSeq = memberSeq;
		this.del = del;
		this.memberDto = memberDto;
	}

	@Override
	public String toString() {
		return "GroupMemberDto [groupInfoSeq=" + groupInfoSeq + ", memberSeq=" + memberSeq + ", del=" + del
				+ ", memberDto=" + memberDto + "]";
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

	public MemberDto getMemberDto() {
		return memberDto;
	}

	public void setMemberDto(MemberDto memberDto) {
		this.memberDto = memberDto;
	}

	
	
}
