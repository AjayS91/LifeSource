package com.ls.dao;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import com.ls.dao.mapper.AppointmentRowMapper;
import com.ls.vo.Appointment;

public class AppointmentDao implements AppointmentDaoInterface{
	
	private JdbcTemplate jtemp;

	public JdbcTemplate getJtemp() {
		return jtemp;
	}

	public void setJtemp(JdbcTemplate jtemp) {
		this.jtemp = jtemp;
	}

	public void addAppointment(Appointment app) {
		
		String sql = "insert into appointment values (?,?,?,?,?)";
		jtemp.update(sql, new Object[] {app.getAbid() , app.getAdid(), app.getDbloodgroup(), app.getDate(), app.getStatus()});
	}

	public void confirmAppointment(Appointment app) {
			String sql = "update appointment set status = 1 where abid = ? and adid = ?";
			jtemp.update(sql, new Object[] { app.getAbid(), app.getAdid()});
	}

	public List<Appointment> getAppointmentsDonor(int adid) {
		String sql = "Select * from appointment where adid = "+adid;
		List<Appointment> lst = jtemp.query(sql, new AppointmentRowMapper());
		return lst;
		
	}

	public List<Appointment> getAppointmentsBank(int abid) {
		
		return null;
	}

	

}
