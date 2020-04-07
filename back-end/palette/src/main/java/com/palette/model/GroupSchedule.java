package com.palette.model;

public class GroupSchedule {
	private int groupInfoSeq;
	private int sunday;
	private int monday;
	private int tuesday;
	private int wednesday;
	private int thursday;
	private int friday;
	private int saturday;
	
	public GroupSchedule() {
		
	}

	public GroupSchedule(int groupInfoSeq, int sunday, int monday, int tuesday, int wednesday, int thursday, int friday,
			int saturday) {
		super();
		this.groupInfoSeq = groupInfoSeq;
		this.sunday = sunday;
		this.monday = monday;
		this.tuesday = tuesday;
		this.wednesday = wednesday;
		this.thursday = thursday;
		this.friday = friday;
		this.saturday = saturday;
	}

	@Override
	public String toString() {
		return "GroupSchedule [groupInfoSeq=" + groupInfoSeq + ", sunday=" + sunday + ", monday=" + monday
				+ ", tuesday=" + tuesday + ", wednesday=" + wednesday + ", thursday=" + thursday + ", friday=" + friday
				+ ", saturday=" + saturday + "]";
	}

	public int getGroupInfoSeq() {
		return groupInfoSeq;
	}

	public void setGroupInfoSeq(int groupInfoSeq) {
		this.groupInfoSeq = groupInfoSeq;
	}

	public int getSunday() {
		return sunday;
	}

	public void setSunday(int sunday) {
		this.sunday = sunday;
	}

	public int getMonday() {
		return monday;
	}

	public void setMonday(int monday) {
		this.monday = monday;
	}

	public int getTuesday() {
		return tuesday;
	}

	public void setTuesday(int tuesday) {
		this.tuesday = tuesday;
	}

	public int getWednesday() {
		return wednesday;
	}

	public void setWednesday(int wednesday) {
		this.wednesday = wednesday;
	}

	public int getThursday() {
		return thursday;
	}

	public void setThursday(int thursday) {
		this.thursday = thursday;
	}

	public int getFriday() {
		return friday;
	}

	public void setFriday(int friday) {
		this.friday = friday;
	}

	public int getSaturday() {
		return saturday;
	}

	public void setSaturday(int saturday) {
		this.saturday = saturday;
	}
	
	
	
}
