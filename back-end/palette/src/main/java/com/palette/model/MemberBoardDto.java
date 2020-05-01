package com.palette.model;

public class MemberBoardDto {
	private int rownum;
	private int boardSeq;
	private int memberSeq;
	private String title;
	private String content;
	private String writeDate;
	private int del;
	
	public MemberBoardDto() {
		// TODO Auto-generated constructor stub
	}

	public MemberBoardDto(int boardSeq, int memberSeq, String title, String content, String writeDate, int del,
			int rownum) {
		super();
		this.boardSeq = boardSeq;
		this.memberSeq = memberSeq;
		this.title = title;
		this.content = content;
		this.writeDate = writeDate;
		this.del = del;
		this.rownum = rownum;
	}

	public int getBoardSeq() {
		return boardSeq;
	}

	public void setBoardSeq(int boardSeq) {
		this.boardSeq = boardSeq;
	}

	public int getMemberSeq() {
		return memberSeq;
	}

	public void setMemberSeq(int memberSeq) {
		this.memberSeq = memberSeq;
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

	public String getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}

	public int getDel() {
		return del;
	}

	public void setDel(int del) {
		this.del = del;
	}

	public int getRownum() {
		return rownum;
	}

	public void setRownum(int rownum) {
		this.rownum = rownum;
	}

	@Override
	public String toString() {
		return "MemberBoardDto [boardSeq=" + boardSeq + ", memberSeq=" + memberSeq + ", title=" + title + ", content="
				+ content + ", writeDate=" + writeDate + ", del=" + del + ", rownum=" + rownum + "]";
	}
	
	
	
	
}	
