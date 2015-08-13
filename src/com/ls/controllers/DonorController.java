package com.ls.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ls.dao.DonorDao;
import com.ls.utils.LifeSourceUtils;
import com.ls.vo.Donor;

@Controller
public class DonorController {
	DonorDao dao;

/*	@RequestMapping(value = "addDonor.html", method = RequestMethod.POST)
	public String addNewDonor(@ModelAttribute("newDonor")Donor dnr,Model model) throws ParseException {

		dao = LifeSourceUtils.getDonorDaoInstance();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date lastDonated = new java.sql.Date(format.parse("12/11/2015")
				.getTime());
		dao.addDonor(dnr.getDid(), dnr.getDname(), dnr.getDbloodgroup(), dnr.getDage(), dnr.getDgender(), lastDonated,dnr.getDpwd(),
				dnr.getDlocationx(), dnr.getDlocationy(), dnr.getDcontact());
		 
		model.addAttribute("registeredDonor", dnr);
		return "WEB-INF/jsp/hello.jsp";
	}*/
	@RequestMapping(value="ProcessDonorRegister.html",method = RequestMethod.GET)
    public String processRegistration(Model model) {
         
		Donor donor=new Donor();
		model.addAttribute("newdonor",donor);
        return "DonorRegistration";
    } 
    @RequestMapping(value="ProcessDonorRegister.html",method = RequestMethod.POST)
    public String processRegistration(@ModelAttribute("newdonor") Donor donor,
            Model model) {
         
       dao.addDonor(donor);
        return "DonorRegistrationSuccess";
    }
}
