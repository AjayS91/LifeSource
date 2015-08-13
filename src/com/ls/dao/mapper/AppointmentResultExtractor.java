package com.ls.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import com.ls.vo.Appointment;

public class AppointmentResultExtractor implements ResultSetExtractor<Appointment>{
	
	public Appointment extractData(ResultSet rs) throws SQLException,DataAccessException {
		Appointment app = new Appointment();
		app.setAbid(rs.getInt(1));
		app.setAdid(rs.getInt(2));
		app.setDbloodgroup(rs.getString(3));
		app.setDate(rs.getDate(4));
		app.setStatus(rs.getShort(5));
		return app;
	}

}
