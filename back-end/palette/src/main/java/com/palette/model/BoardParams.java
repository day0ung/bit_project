package com.palette.model;

public class BoardParams {
	
	private int itemsPerPage;	// 5
	private int currPage;		// 1	2
	private int start;			// 0	5
		
	public BoardParams() {
	
	}

	public BoardParams(int itemsPerPage, int currPage) {
		super();
		this.itemsPerPage = itemsPerPage;
		this.currPage = currPage;
	}

	
	@Override
	public String toString() {
		return "BoardParams [itemsPerPage=" + itemsPerPage + ", currPage=" + currPage + "]";
	}

	public int getItemsPerPage() {
		return itemsPerPage;
	}

	public void setItemsPerPage(int itemsPerPage) {
		this.itemsPerPage = itemsPerPage;
	}

	public int getCurrPage() {
		return currPage;
	}

	public void setCurrPage(int currPage) {
		this.currPage = currPage;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int currPage, int itemsPerPage) {	
		this.start = (currPage-1)*itemsPerPage;
	}
	
	
	
	
}
