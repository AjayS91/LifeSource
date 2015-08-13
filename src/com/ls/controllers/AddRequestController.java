package com.ls.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ls.vo.Requestjksf;

@Controller
public class AddRequestController {

	@RequestMapping(value = "addrequest.html", method = RequestMethod.GET)
	public String displayAddEmp(HttpServletRequest req, Model model) {
		int nid = 0;
		nid = (Integer) req.getSession().getAttribute("nid");
		if (nid == 0) {
			Requestjksf frm = new Requestjksf();
			frm.setNid(nid);
			model.addAttribute("request", frm);
			return "AddRequestFrm";
		} else {
			return "redirect:index.htm";
		}
	}

	@RequestMapping(value = "addrequest.html", method = RequestMethod.POST)
	public String addEmp(@Valid @ModelAttribute("request") Requestjksf req, BindingResult err, Model model) {
		if (err.hasErrors()) {
			return "AddRequestFrm";
		}

		// Show Blood Banks

		return "redirect:showbanks.htm";
	}
}
