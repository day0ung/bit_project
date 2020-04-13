package com.palette.model;

public class GroupParams {
	private int interBigSeq;

	
	public GroupParams() {
		
	}
	
	public GroupParams(int interBigSeq) {
		super();
		this.interBigSeq = interBigSeq;
	}

	
	@Override
	public String toString() {
		return "GroupParams [interBigSeq=" + interBigSeq + "]";
	}

	public int getInterBigSeq() {
		return interBigSeq;
	}

	public void setInterBigSeq(int interBigSeq) {
		this.interBigSeq = interBigSeq;
	}
	
}
