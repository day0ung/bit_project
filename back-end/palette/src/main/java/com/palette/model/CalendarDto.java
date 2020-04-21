package com.palette.model;

public class CalendarDto {
	private int calendarSeq;
	private int memberSeq;
	private int groupInfoSeq;
	private String title;
	private String content;
	private String startDate;
	private String endDate;
	private int auth;
	
	public CalendarDto() {
		
	}

	public CalendarDto(int calendarSeq, int memberSeq, int groupInfoSeq, String title, String content, String startDate,
			String endDate, int auth) {
		super();
		this.calendarSeq = calendarSeq;
		this.memberSeq = memberSeq;
		this.groupInfoSeq = groupInfoSeq;
		this.title = title;
		this.content = content;
		this.startDate = startDate;
		this.endDate = endDate;
		this.auth = auth;
	}

	@Override
	public String toString() {
		return "CalendarDto [calendarSeq=" + calendarSeq + ", memberSeq=" + memberSeq + ", groupInfoSeq=" + groupInfoSeq
				+ ", title=" + title + ", content=" + content + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", auth=" + auth + "]";
	}

	public int getCalendarSeq() {
		return calendarSeq;
	}

	public void setCalendarSeq(int calendarSeq) {
		this.calendarSeq = calendarSeq;
	}

	public int getMemberSeq() {
		return memberSeq;
	}

	public void setMemberSeq(int memberSeq) {
		this.memberSeq = memberSeq;
	}

	public int getGroupInfoSeq() {
		return groupInfoSeq;
	}

	public void setGroupInfoSeq(int groupInfoSeq) {
		this.groupInfoSeq = groupInfoSeq;
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

	public int getAuth() {
		return auth;
	}

	public void setAuth(int auth) {
		this.auth = auth;
	}
	
	
	
}
