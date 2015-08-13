package com.ls.dao;

import java.util.List;

import com.ls.vo.BloodBank;
import com.ls.vo.Location;

public interface BloodBankDao{
	
	public int addBloodBank(int bid, String bname, String dpwd, double blocationx, double blocationy,String dcontact);
	
	public BloodBank getBloodBank(int bid);
	
	public BloodBank getBloodBank(String sname);
	
	public int setLocation(int bid, double x, double y);
	
	public List<BloodBank> getAllBloodBanks();
	
	public Location getLocation(int bid);

}
