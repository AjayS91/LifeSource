package com.ls.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.ls.vo.BloodBank;
import com.ls.vo.BloodStock;
import com.ls.vo.Donor;

public class BloodStockResultSetExtractor implements ResultSetExtractor<BloodStock> {

	public BloodStock extractData(ResultSet rs) throws SQLException,DataAccessException {
		BloodStock bs = new BloodStock();
		bs.setBloodgroup(rs.getString(1));
		bs.setUnits(rs.getInt(2));
		bs.setBid(rs.getInt(3));
		bs.setDid(rs.getInt(4));
		return bs;
	}
}
