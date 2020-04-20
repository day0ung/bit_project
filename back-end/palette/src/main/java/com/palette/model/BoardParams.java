package com.palette.model;

public class BoardParams {
	
	private int page;		// 1	2
	private int limit;	// 5
	private int start;			// 0	5
	
	private int groupSeq;
	
	public BoardParams() {
	
	}

	public BoardParams(int page, int limit, int start, int groupSeq) {
		super();
		this.page = page;
		this.limit = limit;
		this.start = start;
		this.groupSeq = groupSeq;
	}

	@Override
	public String toString() {
		return "BoardParams [page=" + page + ", limit=" + limit + ", start=" + start + ", groupSeq=" + groupSeq + "]";
	}


	public int getGroupSeq() {
		return groupSeq;
	}

	public void setGroupSeq(int groupSeq) {
		this.groupSeq = groupSeq;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	
	
	
	
	
}
