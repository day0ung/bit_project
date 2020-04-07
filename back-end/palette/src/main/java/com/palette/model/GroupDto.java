package com.palette.model;

import java.io.Serializable;

/*

CREATE TABLE `GROUP_INFO` (
  `GROUP_INFO_SEQ` int(8) NOT NULL AUTO_INCREMENT,
  `MEMBER_SEQ` int(8) DEFAULT NULL,
  `INTER_BIG_SEQ` int(8) DEFAULT NULL,
  `INTER_SMALL_SEQ` int(8) DEFAULT NULL,
  `NAME` varchar(200) DEFAULT NULL,
  `INFO` varchar(2000) DEFAULT NULL,
  `MAX_MEMBER` int(2) DEFAULT NULL,
  `IMAGE` varchar(500) DEFAULT NULL,
  `START_DATE` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `END_DATE` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `DEL` int(1) DEFAULT NULL,
  PRIMARY KEY (`GROUP_INFO_SEQ`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

*/
public class GroupDto implements Serializable {

	private int groupInfoSeq;	// group_info_seq;
	private int memberSeq;
	
	private int interBigSeq;
	
	private int interSmallSeq;
	
	private String groupName;
	private String info;
	private int maxMember;
	private String image = "";
	private String startDate;
	private String endDate;
	private int del;

	private GroupSchedule groupSchedule;
	
	
	private InterBigDto interBigDto;
	private InterSmallDto interSmallDto;
	private MemberDto memberDto;
	private GroupMemberDto groupMemberDto;
	
	private int currMember;
	
	public GroupDto() {
	
	}

	public GroupDto(int groupInfoSeq, int memberSeq, int interBigSeq, int interSmallSeq, String groupName, String info,
			int maxMember, String image, String startDate, String endDate, int del, GroupSchedule groupSchedule,
			InterBigDto interBigDto, InterSmallDto interSmallDto, MemberDto memberDto, GroupMemberDto groupMemberDto,
			int currMember) {
		super();
		this.groupInfoSeq = groupInfoSeq;
		this.memberSeq = memberSeq;
		this.interBigSeq = interBigSeq;
		this.interSmallSeq = interSmallSeq;
		this.groupName = groupName;
		this.info = info;
		this.maxMember = maxMember;
		this.image = image;
		this.startDate = startDate;
		this.endDate = endDate;
		this.del = del;
		this.groupSchedule = groupSchedule;
		this.interBigDto = interBigDto;
		this.interSmallDto = interSmallDto;
		this.memberDto = memberDto;
		this.groupMemberDto = groupMemberDto;
		this.currMember = currMember;
	}

	@Override
	public String toString() {
		return "GroupDto [groupInfoSeq=" + groupInfoSeq + ", memberSeq=" + memberSeq + ", interBigSeq=" + interBigSeq
				+ ", interSmallSeq=" + interSmallSeq + ", groupName=" + groupName + ", info=" + info + ", maxMember="
				+ maxMember + ", image=" + image + ", startDate=" + startDate + ", endDate=" + endDate + ", del=" + del
				+ ", groupSchedule=" + groupSchedule + ", interBigDto=" + interBigDto + ", interSmallDto="
				+ interSmallDto + ", memberDto=" + memberDto + ", groupMemberDto=" + groupMemberDto + ", currMember="
				+ currMember + "]";
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

	public int getInterBigSeq() {
		return interBigSeq;
	}

	public void setInterBigSeq(int interBigSeq) {
		this.interBigSeq = interBigSeq;
	}

	public int getInterSmallSeq() {
		return interSmallSeq;
	}

	public void setInterSmallSeq(int interSmallSeq) {
		this.interSmallSeq = interSmallSeq;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public int getMaxMember() {
		return maxMember;
	}

	public void setMaxMember(int maxMember) {
		this.maxMember = maxMember;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public int getDel() {
		return del;
	}

	public void setDel(int del) {
		this.del = del;
	}

	public GroupSchedule getGroupSchedule() {
		return groupSchedule;
	}

	public void setGroupSchedule(GroupSchedule groupSchedule) {
		this.groupSchedule = groupSchedule;
	}

	public InterBigDto getInterBigDto() {
		return interBigDto;
	}

	public void setInterBigDto(InterBigDto interBigDto) {
		this.interBigDto = interBigDto;
	}

	public InterSmallDto getInterSmallDto() {
		return interSmallDto;
	}

	public void setInterSmallDto(InterSmallDto interSmallDto) {
		this.interSmallDto = interSmallDto;
	}

	public MemberDto getMemberDto() {
		return memberDto;
	}

	public void setMemberDto(MemberDto memberDto) {
		this.memberDto = memberDto;
	}

	public GroupMemberDto getGroupMemberDto() {
		return groupMemberDto;
	}

	public void setGroupMemberDto(GroupMemberDto groupMemberDto) {
		this.groupMemberDto = groupMemberDto;
	}

	public int getCurrMember() {
		return currMember;
	}

	public void setCurrMember(int currMember) {
		this.currMember = currMember;
	}
	
	
}
