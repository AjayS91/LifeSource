package com.ls.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.ls.vo.BloodBank;


public class BloodBankRowMapper implements RowMapper<BloodBank> {

	public BloodBank mapRow(ResultSet rs, int i) throws SQLException {
		return new BloodBankResultSetExtractor().extractData(rs);
	}
}
