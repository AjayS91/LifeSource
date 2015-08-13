package com.ls.vo;

import java.util.Date;

public class Appointment {
	private int abid;
	private int adid;
	private String dbloodgroup;
	private Date date;
	private short status;
	public Appointment(int abid, int adid, String dbloodgroup, Date date,
			short status) {
		super();
		this.abid = abid;
		this.adid = adid;
		this.dbloodgroup = dbloodgroup;
		this.date = date;
		this.status = status;
	}
	public Appointment() {
		super();
	}
	public int getAbid() {
		return abid;
	}
	public void setAbid(int abid) {
		this.abid = abid;
	}
	public int getAdid() {
		return adid;
	}
	public void setAdid(int adid) {
		this.adid = adid;
	}
	public String getDbloodgroup() {
		return dbloodgroup;
	}
	public void setDbloodgroup(String dbloodgroup) {
		this.dbloodgroup = dbloodgroup;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public short getStatus() {
		return status;
	}
	public void setStatus(short status) {
		this.status = status;
	}
	
}
