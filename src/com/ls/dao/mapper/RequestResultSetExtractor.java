package com.ls.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.ls.vo.BloodBank;
import com.ls.vo.Donor;
import com.ls.vo.Requestjksf;

public class RequestResultSetExtractor implements ResultSetExtractor<Requestjksf> {

	public Requestjksf extractData(ResultSet rs) throws SQLException,DataAccessException {
		Requestjksf request = new Requestjksf();
		
		request.setRid(rs.getInt(1));
		request.setNid(rs.getInt(2));
		request.setNbloodgroup(rs.getString(3));
		request.setUnits(rs.getInt(rs.getInt(4)));
		request.setStatus(rs.getInt(5));
		request.setNlocationx(rs.getDouble(6));
		request.setNlocationy(rs.getDouble(7));
		request.setDescription(rs.getString(8));
		
		return request;
	}
}
