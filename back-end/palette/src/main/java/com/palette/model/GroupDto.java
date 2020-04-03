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
	private String name;
	private String info;
	private int maxMember;
	private String image = "";
	private String startDate;
	private String endDate;
	private int del;
	
	// GROUP_MEMBER
	private int groupMemSeq;
	private int groupSeq;
	private int memberseq;
	
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
		return "GroupDto [groupInfoSeq=" + groupInfoSeq + ", memberSeq=" + memberSeq + ", interBigSeq=" + interBigSeq
				+ ", interSmallSeq=" + interSmallSeq + ", name=" + name + ", info=" + info + ", maxMember=" + maxMember
				+ ", image=" + image + ", startDate=" + startDate + ", endDate=" + endDate + ", del=" + del + "]";
	}
	public GroupDto() {
		
	}
	
	
	
	public GroupDto(int groupInfoSeq, int memberSeq, int interBigSeq, int interSmallSeq, String name, String info,
			int maxMember, String image, String startDate, String endDate, int del) {
		super();
		this.groupInfoSeq = groupInfoSeq;
		this.memberSeq = memberSeq;
		this.interBigSeq = interBigSeq;
		this.interSmallSeq = interSmallSeq;
		this.name = name;
		this.info = info;
		this.maxMember = maxMember;
		this.image = image;
		this.startDate = startDate;
		this.endDate = endDate;
		this.del = del;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public int getGroupSeq() {
		return groupSeq;
	}
	public void setGroupSeq(int groupSeq) {
		this.groupSeq = groupSeq;
	}
	public int getMemberseq() {
		return memberseq;
	}
	public void setMemberseq(int memberseq) {
		this.memberseq = memberseq;
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
