package com.ls.vo;

import java.util.Date;

public class Donor {

	// VARS
	private int did;
	private String dname;
	private String dbloodgroup;
	private int dage;
	private String dgender;
	private Date lastdonate;
	private String dpwd;
	private double dlocationx;
	private double dlocationy;
	private String dcontact;

	// CONSTRUCTORS
	public Donor(int did, String dname, String dbloodgroup, int dage,
			String dgender, Date lastdonate, String dpwd, double dlocationx,
			double dlocationy, String dcontact) {
		super();
		this.did = did;
		this.dname = dname;
		this.dbloodgroup = dbloodgroup;
		this.dage = dage;
		this.dgender = dgender;
		this.lastdonate = lastdonate;
		this.dpwd = dpwd;
		this.dlocationx = dlocationx;
		this.dlocationy = dlocationy;
		this.dcontact = dcontact;
	}

	// Setters and Getters

	public Donor() {
		// TODO Auto-generated constructor stub
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDbloodgroup() {
		return dbloodgroup;
	}

	public void setDbloodgroup(String dbloodgroup) {
		this.dbloodgroup = dbloodgroup;
	}

	public int getDage() {
		return dage;
	}

	public void setDage(int dage) {
		this.dage = dage;
	}

	public String getDgender() {
		return dgender;
	}

	public void setDgender(String dgender) {
		this.dgender = dgender;
	}

	public Date getLastdonate() {
		return lastdonate;
	}

	public void setLastdonate(Date lastdonate) {
		this.lastdonate = lastdonate;
	}

	public String getDpwd() {
		return dpwd;
	}

	public void setDpwd(String dpwd) {
		this.dpwd = dpwd;
	}

	public double getDlocationx() {
		return dlocationx;
	}

	public void setDlocationx(double dlocationx) {
		this.dlocationx = dlocationx;
	}

	public double getDlocationy() {
		return dlocationy;
	}

	public void setDlocationy(double dlocationy) {
		this.dlocationy = dlocationy;
	}

	public String getDcontact() {
		return dcontact;
	}

	public void setDcontact(String dcontact) {
		this.dcontact = dcontact;
	}

}
