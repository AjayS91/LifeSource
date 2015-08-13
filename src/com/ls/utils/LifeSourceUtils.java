package com.ls.utils;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ls.dao.AppointmentDao;
import com.ls.dao.BloodBankDao;
import com.ls.dao.BloodStockDao;
import com.ls.dao.DonorDao;
import com.ls.dao.NeedyDao;
import com.ls.dao.RequestDao;
import com.ls.vo.BloodBank;
import com.ls.vo.BloodStock;
import com.ls.vo.Requestjksf;

public class LifeSourceUtils {

	private static DonorDao daoDonor = null;
	private static RequestDao daoRequest = null;
	private static AppointmentDao daoApp = null;
	private static BloodStockDao daoBS = null;
	private static NeedyDao ndao = null;
	private static BloodBankDao daobloodbank = null;
	// NOTE 2
	private static AbstractApplicationContext fac; // cuz lifeCycle
													// methods(destroy)are
													// present her
	static {
		fac = new ClassPathXmlApplicationContext("beans-dao.xml");
	}

	public static DonorDao getDonorDaoInstance() {
		if (daoDonor == null) {
			daoDonor = fac.getBean("donordao", DonorDao.class);
		}
		return daoDonor;
	}

	public static RequestDao getRequestDaoInstance() {
		if (daoRequest == null) {
			daoRequest = fac.getBean("requestdao", RequestDao.class);
		}
		return daoRequest;
	}

	public static AppointmentDao getAppointmentDaoInstance() {
		if (daoApp == null) {
			daoApp = fac.getBean("appdao", AppointmentDao.class);
		}
		return daoApp;
	}

	public static BloodStockDao getBloodStockDaoInstance() {
		if (daoBS == null) {
			daoBS = fac.getBean("bsdao", BloodStockDao.class);
		}
		return daoBS;
	}

	public static NeedyDao getNeedyDaoInstance() {
		if (ndao == null) {
			ndao = fac.getBean("needydao", NeedyDao.class);
		}
		return ndao;
	}
	
	public static BloodBankDao getBloodBankDaoInstance() {
		if (daobloodbank == null) {
			daobloodbank = fac.getBean("bbdao", BloodBankDao.class);
		}
		return daobloodbank;
	}
}
