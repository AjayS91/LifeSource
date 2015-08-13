package com.ls.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ls.vo.Appointment;

public class AppointmentRowMapper implements RowMapper<Appointment>{

	public Appointment mapRow(ResultSet rs, int arg1) throws SQLException {
		return new AppointmentResultExtractor().extractData(rs);
	}

}
