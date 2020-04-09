package com.palette.model;

public class BoardParams {
	
	private int page;		// 1	2
	private int limit;	// 5
	private int start;			// 0	5
		
	public BoardParams() {
	
	}

	public BoardParams(int page, int limit, int start) {
		super();
		this.page = page;
		this.limit = limit;
		this.start = start;
	}

	@Override
	public String toString() {
		return "BoardParams [page=" + page + ", limit=" + limit + ", start=" + start + "]";
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
