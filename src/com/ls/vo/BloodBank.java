package com.ls.vo;

import java.util.List;

public class BloodBank {

	private int bid;
	private String bName;
	private double blocationx;
	private double blocationy;
	private String bpwd;
	private String bcontact;

	public BloodBank(int bid, String bName, double blocationx,
			double blocationy, String bpwd, String bcontact) {
		this.bid = bid;
		this.bName = bName;
		this.blocationx = blocationx;
		this.blocationy = blocationy;
		this.bpwd = bpwd;
		this.bcontact = bcontact;
	}

	public BloodBank() {
	}

	public List<BloodStock> bloodStocklist;

	public List<BloodStock> getBloodStocklist() {
		return bloodStocklist;
	}

	public void setBloodStocklist(List<BloodStock> bloodStocklist) {
		this.bloodStocklist = bloodStocklist;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public double getBlocationx() {
		return blocationx;
	}

	public void setBlocationx(double blocationx) {
		this.blocationx = blocationx;
	}

	public double getBlocationy() {
		return blocationy;
	}

	public void setBlocationy(double blocationy) {
		this.blocationy = blocationy;
	}

	public String getBpwd() {
		return bpwd;
	}

	public void setBpwd(String bpwd) {
		this.bpwd = bpwd;
	}

	public String getBcontact() {
		return bcontact;
	}

	public void setBcontact(String bcontact) {
		this.bcontact = bcontact;
	}

}
