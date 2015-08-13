package com.ls.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ls.vo.Donor;
import com.ls.vo.Needy;

public class NeedyRowMapper implements RowMapper<Needy> {

	public Needy mapRow(ResultSet rs, int i) throws SQLException {
		return new NeedyResultSetExtractor().extractData(rs);
	}
}
