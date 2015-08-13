package com.ls.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import com.ls.dao.mapper.DonorRowMapper;
import com.ls.dao.mapper.RequestRowMapper;
import com.ls.vo.Donor;
import com.ls.vo.Location;
import com.ls.vo.Requestjksf;

public class RequestDao implements RequestDaoInterface {

	private JdbcTemplate jtemp;

	public JdbcTemplate getJtemp() {
		return jtemp;
	}

	public void setJtemp(JdbcTemplate jtemp) {
		this.jtemp = jtemp;
	}
	
	public int registerRequest(Requestjksf r){
		String qy = "insert into request values(?,?,?,?,?,?,?,?)";
		Object[] param = { r.getRid(), r.getNid(), r.getNbloodgroup(), r.getUnits(),  r.getStatus(), r.getNlocationx(),r.getNlocationy(),r.getDescription()};
		jtemp.update(qy, param);
		return 1;
	}
	
	public List<Requestjksf> getAllRequests() {
		String qy = "select * from request";
		List<Requestjksf> lst = jtemp.query(qy, new RequestRowMapper());
		return lst;
	}
	
	public Requestjksf getRequest(int rid) {
		String qy = "select * from request where rid=?";
		Object[] param = { rid };
		Requestjksf r = jtemp.queryForObject(qy, param, new RequestRowMapper());
		return r;
	}
	
	public List<Requestjksf> getRequestsWithBloodGroup(String bloodGroup) {
		String qy = "select * from request where nbloodgroup = ?";
		Object[] param = { bloodGroup };
		List<Requestjksf> lst = jtemp.query(qy, param, new RequestRowMapper());
		return lst;
	}
	
	public int updateRequestStatus(int rid,int status) {
		String qy = "update request set status = ? where rid=?";
		Object[] param = {status, rid };
		jtemp.update(qy, param, new RequestRowMapper());
		return 1;
	}

}


