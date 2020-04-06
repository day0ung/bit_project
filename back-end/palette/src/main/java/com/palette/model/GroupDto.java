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
		private String memberId;
	private int interBigSeq;
		private String bigName;
	private int interSmallSeq;
		private String smallName;
	private String groupName;
	private String info;
	private int maxMember;
	private String image = "";
	private String startDate;
	private String endDate;
	private int del;
	
	// GROUP_MEMBER
	private int groupMemSeq;
	
	private int memberSeq1;
		private String memberId1;
	private int memberSeq2;
		private String memberId2;
	private int memberSeq3;
		private String memberId3;
	private int memberSeq4;
		private String memberId4;
	private int memberSeq5;
		private String memberId5;
	private int memberSeq6;
		private String memberId6;
	private int memberSeq7;
		private String memberId7;
	private int memberSeq8;
		private String memberId8;
	private int memberSeq9;
		private String memberId9;
	
	// GROUP_SCHEDULE
	private int scheduleSeq;
	private int sunday;
	private int monday;
	private int tuesday;
	private int wednesday;
	private int thursday;
	private int friday;
	private int saturday;
	
	@Override
	public String toString() {
		return "GroupDto [groupInfoSeq=" + groupInfoSeq + ", memberSeq=" + memberSeq + ", memberId=" + memberId
				+ ", interBigSeq=" + interBigSeq + ", bigName=" + bigName + ", interSmallSeq=" + interSmallSeq
				+ ", smallName=" + smallName + ", groupName=" + groupName + ", info=" + info + ", maxMember="
				+ maxMember + ", image=" + image + ", startDate=" + startDate + ", endDate=" + endDate + ", del=" + del
				+ ", groupMemSeq=" + groupMemSeq + ", memberSeq1=" + memberSeq1 + ", memberId1=" + memberId1
				+ ", memberSeq2=" + memberSeq2 + ", memberId2=" + memberId2 + ", memberSeq3=" + memberSeq3
				+ ", memberId3=" + memberId3 + ", memberSeq4=" + memberSeq4 + ", memberId4=" + memberId4
				+ ", memberSeq5=" + memberSeq5 + ", memberId5=" + memberId5 + ", memberSeq6=" + memberSeq6
				+ ", memberId6=" + memberId6 + ", memberSeq7=" + memberSeq7 + ", memberId7=" + memberId7
				+ ", memberSeq8=" + memberSeq8 + ", memberId8=" + memberId8 + ", memberSeq9=" + memberSeq9
				+ ", memberId9=" + memberId9 + ", scheduleSeq=" + scheduleSeq + ", sunday=" + sunday + ", monday="
				+ monday + ", tuesday=" + tuesday + ", wednesday=" + wednesday + ", thursday=" + thursday + ", friday="
				+ friday + ", saturday=" + saturday + "]";
	}
	public GroupDto() {
		
	}
	public GroupDto(int groupInfoSeq, int memberSeq, String memberId, int interBigSeq, String bigName,
			int interSmallSeq, String smallName, String groupName, String info, int maxMember, String image,
			String startDate, String endDate, int del, int groupMemSeq, int memberSeq1, String memberId1,
			int memberSeq2, String memberId2, int memberSeq3, String memberId3, int memberSeq4, String memberId4,
			int memberSeq5, String memberId5, int memberSeq6, String memberId6, int memberSeq7, String memberId7,
			int memberSeq8, String memberId8, int memberSeq9, String memberId9, int scheduleSeq, int sunday, int monday,
			int tuesday, int wednesday, int thursday, int friday, int saturday) {
		super();
		this.groupInfoSeq = groupInfoSeq;
		this.memberSeq = memberSeq;
		this.memberId = memberId;
		this.interBigSeq = interBigSeq;
		this.bigName = bigName;
		this.interSmallSeq = interSmallSeq;
		this.smallName = smallName;
		this.groupName = groupName;
		this.info = info;
		this.maxMember = maxMember;
		this.image = image;
		this.startDate = startDate;
		this.endDate = endDate;
		this.del = del;
		this.groupMemSeq = groupMemSeq;
		this.memberSeq1 = memberSeq1;
		this.memberId1 = memberId1;
		this.memberSeq2 = memberSeq2;
		this.memberId2 = memberId2;
		this.memberSeq3 = memberSeq3;
		this.memberId3 = memberId3;
		this.memberSeq4 = memberSeq4;
		this.memberId4 = memberId4;
		this.memberSeq5 = memberSeq5;
		this.memberId5 = memberId5;
		this.memberSeq6 = memberSeq6;
		this.memberId6 = memberId6;
		this.memberSeq7 = memberSeq7;
		this.memberId7 = memberId7;
		this.memberSeq8 = memberSeq8;
		this.memberId8 = memberId8;
		this.memberSeq9 = memberSeq9;
		this.memberId9 = memberId9;
		this.scheduleSeq = scheduleSeq;
		this.sunday = sunday;
		this.monday = monday;
		this.tuesday = tuesday;
		this.wednesday = wednesday;
		this.thursday = thursday;
		this.friday = friday;
		this.saturday = saturday;
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
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public int getInterBigSeq() {
		return interBigSeq;
	}
	public void setInterBigSeq(int interBigSeq) {
		this.interBigSeq = interBigSeq;
	}
	public String getBigName() {
		return bigName;
	}
	public void setBigName(String bigName) {
		this.bigName = bigName;
	}
	public int getInterSmallSeq() {
		return interSmallSeq;
	}
	public void setInterSmallSeq(int interSmallSeq) {
		this.interSmallSeq = interSmallSeq;
	}
	public String getSmallName() {
		return smallName;
	}
	public void setSmallName(String smallName) {
		this.smallName = smallName;
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
	public int getGroupMemSeq() {
		return groupMemSeq;
	}
	public void setGroupMemSeq(int groupMemSeq) {
		this.groupMemSeq = groupMemSeq;
	}
	public int getMemberSeq1() {
		return memberSeq1;
	}
	public void setMemberSeq1(int memberSeq1) {
		this.memberSeq1 = memberSeq1;
	}
	public String getMemberId1() {
		return memberId1;
	}
	public void setMemberId1(String memberId1) {
		this.memberId1 = memberId1;
	}
	public int getMemberSeq2() {
		return memberSeq2;
	}
	public void setMemberSeq2(int memberSeq2) {
		this.memberSeq2 = memberSeq2;
	}
	public String getMemberId2() {
		return memberId2;
	}
	public void setMemberId2(String memberId2) {
		this.memberId2 = memberId2;
	}
	public int getMemberSeq3() {
		return memberSeq3;
	}
	public void setMemberSeq3(int memberSeq3) {
		this.memberSeq3 = memberSeq3;
	}
	public String getMemberId3() {
		return memberId3;
	}
	public void setMemberId3(String memberId3) {
		this.memberId3 = memberId3;
	}
	public int getMemberSeq4() {
		return memberSeq4;
	}
	public void setMemberSeq4(int memberSeq4) {
		this.memberSeq4 = memberSeq4;
	}
	public String getMemberId4() {
		return memberId4;
	}
	public void setMemberId4(String memberId4) {
		this.memberId4 = memberId4;
	}
	public int getMemberSeq5() {
		return memberSeq5;
	}
	public void setMemberSeq5(int memberSeq5) {
		this.memberSeq5 = memberSeq5;
	}
	public String getMemberId5() {
		return memberId5;
	}
	public void setMemberId5(String memberId5) {
		this.memberId5 = memberId5;
	}
	public int getMemberSeq6() {
		return memberSeq6;
	}
	public void setMemberSeq6(int memberSeq6) {
		this.memberSeq6 = memberSeq6;
	}
	public String getMemberId6() {
		return memberId6;
	}
	public void setMemberId6(String memberId6) {
		this.memberId6 = memberId6;
	}
	public int getMemberSeq7() {
		return memberSeq7;
	}
	public void setMemberSeq7(int memberSeq7) {
		this.memberSeq7 = memberSeq7;
	}
	public String getMemberId7() {
		return memberId7;
	}
	public void setMemberId7(String memberId7) {
		this.memberId7 = memberId7;
	}
	public int getMemberSeq8() {
		return memberSeq8;
	}
	public void setMemberSeq8(int memberSeq8) {
		this.memberSeq8 = memberSeq8;
	}
	public String getMemberId8() {
		return memberId8;
	}
	public void setMemberId8(String memberId8) {
		this.memberId8 = memberId8;
	}
	public int getMemberSeq9() {
		return memberSeq9;
	}
	public void setMemberSeq9(int memberSeq9) {
		this.memberSeq9 = memberSeq9;
	}
	public String getMemberId9() {
		return memberId9;
	}
	public void setMemberId9(String memberId9) {
		this.memberId9 = memberId9;
	}
	public int getScheduleSeq() {
		return scheduleSeq;
	}
	public void setScheduleSeq(int scheduleSeq) {
		this.scheduleSeq = scheduleSeq;
	}
	public int getSunday() {
		return sunday;
	}
	public void setSunday(int sunday) {
		this.sunday = sunday;
	}
	public int getMonday() {
		return monday;
	}
	public void setMonday(int monday) {
		this.monday = monday;
	}
	public int getTuesday() {
		return tuesday;
	}
	public void setTuesday(int tuesday) {
		this.tuesday = tuesday;
	}
	public int getWednesday() {
		return wednesday;
	}
	public void setWednesday(int wednesday) {
		this.wednesday = wednesday;
	}
	public int getThursday() {
		return thursday;
	}
	public void setThursday(int thursday) {
		this.thursday = thursday;
	}
	public int getFriday() {
		return friday;
	}
	public void setFriday(int friday) {
		this.friday = friday;
	}
	public int getSaturday() {
		return saturday;
	}
	public void setSaturday(int saturday) {
		this.saturday = saturday;
	}


	
	
	
	
}
