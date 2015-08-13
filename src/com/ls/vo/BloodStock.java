package com.ls.vo;

public class BloodStock {
	private String bloodgroup;
	private int units;
	private int bid;
	private int did;
	
	public BloodStock(String bloodgroup, int units, int bid, int did) {
		this.bloodgroup = bloodgroup;
		this.units = units;
		this.bid = bid;
		this.did = did;
	}
	public BloodStock() {
		// TODO Auto-generated constructor stub
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
}
