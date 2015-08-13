package com.ls.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.ls.dao.mapper.DonorRowMapper;
import com.ls.vo.Donor;
import com.ls.vo.Location;

public interface DonorDaoInterface {
	
	//Donor
	public List<Donor> getDonors(String bloodGroup);
	public Donor getDonor(int did);
	public List<Donor> getAllDonors();
	public int updateLocation(int did, double x, double y);
	public Location getLocation(int did);
	public int addDonor(Donor d);
}