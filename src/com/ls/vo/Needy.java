package com.ls.vo;

//package com.ls.vo;

public class Needy {

	private int nid;
	private String nname;
	private String npwd;
	private Double nlocationx;
	private Double nlocationy;
	private String nbloodgroup;
	private int nage;
	private String ncontact;
	private String ngender;

	public Needy() {
		super();
	}

	public Needy(int nid, String nname, String npwd, Double nlocationx, Double nlocationy, String nbloodgroup, int nage,
			String ncontact, String ngender) {
		super();
		this.nid = nid;
		this.nname = nname;
		this.npwd = npwd;
		this.nlocationx = nlocationx;
		this.nlocationy = nlocationy;
		this.nbloodgroup = nbloodgroup;
		this.nage = nage;
		this.ncontact = ncontact;
		this.ngender = ngender;
	}

	public int getNid() {
		return nid;
	}

	public void setNid(int nid) {
		this.nid = nid;
	}

	public String getNname() {
		return nname;
	}

	public void setNname(String nname) {
		this.nname = nname;
	}

	public String getNpwd() {
		return npwd;
	}

	public void setNpwd(String npwd) {
		this.npwd = npwd;
	}

	public Double getNlocationx() {
		return nlocationx;
	}

	public void setNlocationx(Double nlocationx) {
		this.nlocationx = nlocationx;
	}

	public Double getNlocationy() {
		return nlocationy;
	}

	public void setNlocationy(Double nlocationy) {
		this.nlocationy = nlocationy;
	}

	public String getNbloodgroup() {
		return nbloodgroup;
	}

	public void setNbloodgroup(String nbloodgroup) {
		this.nbloodgroup = nbloodgroup;
	}

	public int getNage() {
		return nage;
	}

	public void setNage(int nage) {
		this.nage = nage;
	}

	public String getNcontact() {
		return ncontact;
	}

	public void setNcontact(String ncontact) {
		this.ncontact = ncontact;
	}

	public String getNgender() {
		return ngender;
	}

	public void setNgender(String ngender) {
		this.ngender = ngender;
	}

}