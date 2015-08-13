package com.ls.dao;


import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.ls.dao.mapper.BloodBankRowMapper;
import com.ls.vo.BloodBank;
import com.ls.vo.Location;

public class BloodBankDaoImp implements BloodBankDao {

	private JdbcTemplate jtemp;

	public JdbcTemplate getJtemp() {
		return jtemp;
	}

	public void setJtemp(JdbcTemplate jtemp) {
		this.jtemp = jtemp;
	}
	
	public int addBloodBank(int bid, String bname, String dpwd, double blocationx, double blocationy,String dcontact) {
		String qy = "insert into bloodbank values(?,?,?,?,?,?)";
		Object[] param = { bid, bname, dpwd, blocationx,  blocationy, dcontact};
		jtemp.update(qy, param);
		return 1;
	}
	
	public BloodBank getBloodBank(int bid) {
		String qy = "select * from bloodbank where bid=?";
		Object[] param = { bid };
		BloodBank bloodbank = jtemp.queryForObject(qy, param, new BloodBankRowMapper());
		return bloodbank;
	}
	
	public BloodBank getBloodBank(String sname) {
		String qy = "select * from bloodbank where bName=?";
		Object[] param = { sname };
		BloodBank bloodbank = jtemp.queryForObject(qy, param, new BloodBankRowMapper());
		return bloodbank;
	}
	
	public int setLocation(int bid, double x, double y) {
		String qy = "update bloodbank set (dlocationx,dlocationy) = (?,?)  where bid=?";
		Object[] param = { x, y, bid };
		jtemp.update(qy, param);
		return 1;
	}
	
	public List<BloodBank> getAllBloodBanks() {
		String qy = "select * from bloodbank";
		List<BloodBank> lst = jtemp.query(qy, new BloodBankRowMapper());
		return lst;
	}
	
	public Location getLocation(int bid) {
		String qy = "select * from bloodbank where bid=?";
		Object[] param = { bid };
		BloodBank bloodbank = jtemp.queryForObject(qy, param, new BloodBankRowMapper());
		return new Location(bloodbank.getBlocationx(), bloodbank.getBlocationy());
	}
	
}
