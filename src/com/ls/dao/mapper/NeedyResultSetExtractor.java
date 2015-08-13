package com.ls.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.ls.vo.Donor;
import com.ls.vo.Needy;

public class NeedyResultSetExtractor implements ResultSetExtractor<Needy> {

	public Needy extractData(ResultSet rs) throws SQLException,DataAccessException {
		Needy needy = new Needy();
		
		needy.setNid(rs.getInt(1));
		needy.setNname(rs.getString(2));
		needy.setNpwd(rs.getString(3));
		needy.setNlocationx(rs.getDouble(4));
		needy.setNlocationy(rs.getDouble(5));
		needy.setNbloodgroup(rs.getString(6));
		needy.setNage(rs.getInt(7));
		needy.setNcontact(rs.getString(8));
		needy.setNgender(rs.getString(9));
		
		return needy;
	}

}
