package com.ls.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ls.vo.Donor;

public class DonorRowMapper implements RowMapper<Donor> {

	public Donor mapRow(ResultSet rs, int i) throws SQLException {
		return new DonorResultSetExtractor().extractData(rs);
	}
}
