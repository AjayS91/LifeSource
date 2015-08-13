package com.ls.dao;

import java.util.List;

import com.ls.vo.Appointment;

public interface AppointmentDaoInterface {

	public void addAppointment(Appointment app);
	public void confirmAppointment(Appointment app);
	public List<Appointment> getAppointmentsDonor(int adid);
	public List<Appointment> getAppointmentsBank(int abid);
}
