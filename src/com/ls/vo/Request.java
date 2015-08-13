package com.ls.vo;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

public class Request {

	private int rid;
	private int nid;

	@Range(min = 1, max = 10, message = "blood units must be in range 1 to 10")
	private int units;
	private int nlocationx;
	private int nlocationy;

	@NotEmpty(message = "Blood Group is mandatory")
	@Size(max = 3, message = "Group must be maximum 3 chars")
	private String nbloodgroup;

	private String status;

	private String description;

	public Request() {

	}

	public Request(int rid, int nid, int units, int nlocationx, int nlocationy, String nbloodgroup, String status,
			String description) {
		super();
		this.rid = rid;
		this.nid = nid;
		this.units = units;
		this.nlocationx = nlocationx;
		this.nlocationy = nlocationy;
		this.nbloodgroup = nbloodgroup;
		this.status = status;
		this.description = description;
	}

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
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}

	public int getNlocationx() {
		return nlocationx;
	}

	public void setNlocationx(int nlocationx) {
		this.nlocationx = nlocationx;
	}

	public int getNlocationy() {
		return nlocationy;
	}

	public void setNlocationy(int nlocationy) {
		this.nlocationy = nlocationy;
	}

	public String getNbloodgroup() {
		return nbloodgroup;
	}

	public void setNbloodgroup(String nbloodgroup) {
		this.nbloodgroup = nbloodgroup;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


}
