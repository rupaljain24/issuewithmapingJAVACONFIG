package com.worldpay.controllers;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@ComponentScan("com.worldpay")
public class TransporterController {


	
	@RequestMapping("AddTransporter")
	public String openTranporterPage()
	{
		return "AddTransporter";
		
	}
	

	
	
	
	/*@RequestMapping("dataentry")
	public String showDataEntryForm(){
		return "dataentry";
	}*/
	
}
