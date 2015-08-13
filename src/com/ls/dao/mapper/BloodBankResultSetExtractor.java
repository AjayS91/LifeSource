package com.ls.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.ls.vo.BloodBank;
import com.ls.vo.Donor;

public class BloodBankResultSetExtractor implements ResultSetExtractor<BloodBank> {

	public BloodBank extractData(ResultSet rs) throws SQLException,DataAccessException {
		BloodBank bb = new BloodBank();
		bb.setBid(rs.getInt(1));
		bb.setbName(rs.getString(2));
		bb.setBpwd(rs.getString(3));
		bb.setBlocationx(rs.getDouble(4));
		bb.setBlocationy(rs.getDouble(5));
		bb.setBcontact(rs.getString(6));
		bb.setBloodStocklist(null);
		return bb;
	}
}
