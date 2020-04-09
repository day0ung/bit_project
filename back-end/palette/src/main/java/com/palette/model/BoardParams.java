package com.palette.model;

public class BoardParams {
	
	private int itemsPerPage;
	private int currPage;
	private int start;
	private int end;
	
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
	
	
	
	
}
