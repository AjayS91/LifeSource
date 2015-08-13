package com.ls.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ls.vo.BloodBank;
import com.ls.vo.BloodStock;


public class BloodStockMapper implements RowMapper<BloodStock> {

	public BloodStock mapRow(ResultSet rs, int i) throws SQLException {
		return new BloodStockResultSetExtractor().extractData(rs);
	}
}
