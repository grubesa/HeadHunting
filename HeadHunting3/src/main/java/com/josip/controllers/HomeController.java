package com.josip.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.josip.business.PersonalInfoManager;

@Controller
public class HomeController {

	@Autowired PersonalInfoManager personInfo;
	
	@RequestMapping("/home")
	public String goHome(Model model){
		model.addAttribute("person", personInfo.getPersonalInfo("Grubesa"));
		return "home";
	}
}