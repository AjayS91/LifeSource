package com.ls.vo;

public class Requestjksf {
	
	private int rid;
	private int nid;
	private String nbloodgroup;
	private int units;
	private int status;
	private double nlocationx;
	private double nlocationy;
	private String description;
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public int getNid() {
		return nid;
	}
	public void setNid(int nid) {
		this.nid = nid;
	}
	public String getNbloodgroup() {
		return nbloodgroup;
	}
	public void setNbloodgroup(String nbloodgroup) {
		this.nbloodgroup = nbloodgroup;
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public double getNlocationx() {
		return nlocationx;
	}
	public void setNlocationx(double nlocationx) {
		this.nlocationx = nlocationx;
	}
	public double getNlocationy() {
		return nlocationy;
	}
	public void setNlocationy(double nlocationy) {
		this.nlocationy = nlocationy;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Requestjksf(int rid, int nid, String nbloodgroup, int units, int status,
			double nlocationx, double nlocationy, String description) {
		super();
		this.rid = rid;
		this.nid = nid;
		this.nbloodgroup = nbloodgroup;
		this.units = units;
		this.status = status;
		this.nlocationx = nlocationx;
		this.nlocationy = nlocationy;
		this.description = description;
	}
	
	public Requestjksf() {
		// TODO Auto-generated constructor stub
	}
}
