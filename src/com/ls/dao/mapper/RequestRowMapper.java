package com.ls.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ls.vo.Donor;
import com.ls.vo.Needy;
import com.ls.vo.Requestjksf;

public class RequestRowMapper implements RowMapper<Requestjksf> {

	public Requestjksf mapRow(ResultSet rs, int i) throws SQLException {
		return new RequestResultSetExtractor().extractData(rs);
	}
}
