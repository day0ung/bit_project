package com.palette.model;

public class GroupBoardDto {
	
	private int finalnum;
	
    private int boardSeq;
    private int groupInfoSeq;
    private int memberSeq;
    private int category;
    private String title;
    private String content;

    private String writeDate;
    private int readCount;

    private String image;
    private String fileName;
    private String dbFileName;
    
    private int boardAuth;

    private int del;
    
    private MemberDto memberDto;
    
    // none data//
    private String cvStartDate;
    private String cvEndDate;


    public GroupBoardDto() {
    }

    


	public GroupBoardDto(int finalnum, int boardSeq, int groupInfoSeq, int memberSeq, int category, String title,
			String content, String writeDate, int readCount, String image, String fileName, String dbFileName,
			int boardAuth, int del, MemberDto memberDto, String cvStartDate, String cvEndDate) {
		super();
		this.finalnum = finalnum;
		this.boardSeq = boardSeq;
		this.groupInfoSeq = groupInfoSeq;
		this.memberSeq = memberSeq;
		this.category = category;
		this.title = title;
		this.content = content;
		this.writeDate = writeDate;
		this.readCount = readCount;
		this.image = image;
		this.fileName = fileName;
		this.dbFileName = dbFileName;
		this.boardAuth = boardAuth;
		this.del = del;
		this.memberDto = memberDto;
		this.cvStartDate = cvStartDate;
		this.cvEndDate = cvEndDate;
	}

	public MemberDto getMemberdto() {
		return memberDto;
	}

	public void setMemberdto(MemberDto memberdto) {
		this.memberDto = memberdto;
	}

	public int getFinalnum() {
		return finalnum;
	}

	public void setFinalnum(int finalnum) {
		this.finalnum = finalnum;
	}

	public int getGroupInfoSeq() {
		return groupInfoSeq;
	}

	public void setGroupInfoSeq(int groupInfoSeq) {
		this.groupInfoSeq = groupInfoSeq;
	}

	public int getBoardSeq() {
        return this.boardSeq;
    }

    public void setBoardSeq(int boardSeq) {
        this.boardSeq = boardSeq;
    }
    public int getMemberSeq() {
        return this.memberSeq;
    }

    public void setMemberSeq(int memberSeq) {
        this.memberSeq = memberSeq;
    }

    public int getCategory() {
        return this.category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriteDate() {
        return this.writeDate;
    }

    public void setWriteDate(String writeDate) {
        this.writeDate = writeDate;
    }

    public int getReadCount() {
        return this.readCount;
    }

    public void setReadCount(int readCount) {
        this.readCount = readCount;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getDbFileName() {
        return this.dbFileName;
    }

    public void setDbFileName(String dbFileName) {
        this.dbFileName = dbFileName;
    }

    public int getBoardAuth() {
        return this.boardAuth;
    }

    public void setBoardAuth(int boardAuth) {
        this.boardAuth = boardAuth;
    }

    public int getDel() {
        return this.del;
    }

    public void setDel(int del) {
        this.del = del;
    }

    public String getCvStartDate() {
        return this.cvStartDate;
    }

    public void setCvStartDate(String cvStartDate) {
        this.cvStartDate = cvStartDate;
    }

    public String getCvEndSate() {
        return this.cvEndDate;
    }

    public void setCvEndSate(String cvEndSate) {
        this.cvEndDate = cvEndSate;
    }

    public GroupBoardDto boardSeq(int boardSeq) {
        this.boardSeq = boardSeq;
        return this;
    }

    public GroupBoardDto groupInfeSeq(int groupInfeSeq) {
        this.groupInfoSeq = groupInfeSeq;
        return this;
    }

    public GroupBoardDto memberSeq(int memberSeq) {
        this.memberSeq = memberSeq;
        return this;
    }

    public GroupBoardDto category(int category) {
        this.category = category;
        return this;
    }

    public GroupBoardDto title(String title) {
        this.title = title;
        return this;
    }

    public GroupBoardDto content(String content) {
        this.content = content;
        return this;
    }

    public GroupBoardDto writeDate(String writeDate) {
        this.writeDate = writeDate;
        return this;
    }

    public GroupBoardDto readCount(int readCount) {
        this.readCount = readCount;
        return this;
    }

    public GroupBoardDto image(String image) {
        this.image = image;
        return this;
    }

    public GroupBoardDto fileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    public GroupBoardDto dbFileName(String dbFileName) {
        this.dbFileName = dbFileName;
        return this;
    }

    public GroupBoardDto boardAuth(int boardAuth) {
        this.boardAuth = boardAuth;
        return this;
    }

    public GroupBoardDto del(int del) {
        this.del = del;
        return this;
    }

    public GroupBoardDto cvStartDate(String cvStartDate) {
        this.cvStartDate = cvStartDate;
        return this;
    }

    public GroupBoardDto cvEndSate(String cvEndSate) {
        this.cvEndDate = cvEndDate;
        return this;
    }

	@Override
	public String toString() {
		return "GroupBoardDto [finalnum=" + finalnum + ", boardSeq=" + boardSeq + ", groupInfoSeq=" + groupInfoSeq
				+ ", memberSeq=" + memberSeq + ", category=" + category + ", title=" + title + ", content=" + content
				+ ", writeDate=" + writeDate + ", readCount=" + readCount + ", image=" + image + ", fileName="
				+ fileName + ", dbFileName=" + dbFileName + ", boardAuth=" + boardAuth + ", del=" + del + ", memberDto="
				+ memberDto + ", cvStartDate=" + cvStartDate + ", cvEndSate=" + cvEndDate + "]";
	}

 

}