package com.palette.model;

public class CalendarDto {
	private int calendarSeq;
	private int memberSeq;
	private int groupInfoSeq;
	private String title;
	private String content;
	private String start;
	private String end;
	private int auth;
	
	public CalendarDto() {
		
	}

	public CalendarDto(int calendarSeq, int memberSeq, int groupInfoSeq, String title, String content, String start,
			String end, int auth) {
		super();
		this.calendarSeq = calendarSeq;
		this.memberSeq = memberSeq;
		this.groupInfoSeq = groupInfoSeq;
		this.title = title;
		this.content = content;
		this.start = start;
		this.end = end;
		this.auth = auth;
	}

	@Override
	public String toString() {
		return "CalendarDto [calendarSeq=" + calendarSeq + ", memberSeq=" + memberSeq + ", groupInfoSeq=" + groupInfoSeq
				+ ", title=" + title + ", content=" + content + ", start=" + start + ", end=" + end
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

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public int getAuth() {
		return auth;
	}

	public void setAuth(int auth) {
		this.auth = auth;
	}
	
	
	
}
