package com.palette.model;

public class MemberCVDto {
	private int cvSeq; // CV_SEQ
	private int memberSeq; // MEMBER_SEQ
	private String title; // TITLE
	private String writeDate; // WRITE_DATE
	private int readCount; // READ_COUNT
	private String fileName; // FILE_NAME
	private String dbFileName; // DB_FILE_NAME
	private int del; // DEL
	
	public MemberCVDto() {
	}

	public MemberCVDto(int cvSeq, int memberSeq, String title, String writeDate, int readCount, String fileName,
			String dbFileName, int del) {
		super();
		this.cvSeq = cvSeq;
		this.memberSeq = memberSeq;
		this.title = title;
		this.writeDate = writeDate;
		this.readCount = readCount;
		this.fileName = fileName;
		this.dbFileName = dbFileName;
		this.del = del;
	}

	public int getCvSeq() {
		return cvSeq;
	}

	public void setCvSeq(int cvSeq) {
		this.cvSeq = cvSeq;
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

	public String getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}

	public int getReadCount() {
		return readCount;
	}

	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getDbFileName() {
		return dbFileName;
	}

	public void setDbFileName(String dbFileName) {
		this.dbFileName = dbFileName;
	}

	public int getDel() {
		return del;
	}

	public void setDel(int del) {
		this.del = del;
	}

	@Override
	public String toString() {
		return "MemberCVDto [cvSeq=" + cvSeq + ", memberSeq=" + memberSeq + ", title=" + title + ", writeDate="
				+ writeDate + ", readCount=" + readCount + ", fileName=" + fileName + ", dbFileName=" + dbFileName
				+ ", del=" + del + "]";
	}
	
	
	
}
