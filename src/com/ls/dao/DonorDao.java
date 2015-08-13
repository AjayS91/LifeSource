package com.ls.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import com.ls.dao.mapper.DonorRowMapper;
import com.ls.vo.Donor;
import com.ls.vo.Location;

public class DonorDao implements DonorDaoInterface {

	private JdbcTemplate jtemp;

	public JdbcTemplate getJtemp() {
		return jtemp;
	}

	public void setJtemp(JdbcTemplate jtemp) {
		this.jtemp = jtemp;
	}
	
	public int addDonor(Donor d) {
		String qy = "insert into donor values(?,?,?,?,?,?,?,?,?,?)";
		Object[] param = { d.getDid(), d.getDname(), d.getDpwd(), d.getDlocationx(),  d.getDlocationy(), d.getDbloodgroup(), d.getDage(), d.getDgender(), d.getDcontact(), d.getLastdonate()};
		jtemp.update(qy, param);
		return 1;
	}
	
	public List<Donor> getAllDonors() {
		String qy = "select * from donor";
		List<Donor> lst = jtemp.query(qy, new DonorRowMapper());
		return lst;
	}

	public List<Donor> getDonors(String bloodGroup) {
		String qy = "select * from donor where dbloodgroup = ?";
		Object[] param = { bloodGroup };
		List<Donor> lst = jtemp.query(qy, param, new DonorRowMapper());
		return lst;
	}

	public Donor getDonor(int did) {
		String qy = "select * from donor where did=?";
		Object[] param = { did };
		Donor donor = jtemp.queryForObject(qy, param, new DonorRowMapper());
		return donor;
	}

	public int updateLocation(int did, double x, double y) {
		String qy = "update donor set (dlocationx,dlocationy) = (?,?)  where did=?";
		Object[] param = { x, y, did };
		jtemp.update(qy, param);
		return 1;
	}

	public Location getLocation(int did) {
		String qy = "select * from donor where eid=?";
		Object[] param = { did };
		Donor donor = jtemp.queryForObject(qy, param, new DonorRowMapper());
		return new Location(donor.getDlocationx(), donor.getDlocationy());
	}
}


