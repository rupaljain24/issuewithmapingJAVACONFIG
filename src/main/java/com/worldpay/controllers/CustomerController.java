package com.worldpay.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.worldpay.entities.Customer;
import com.worldpay.services.CustomerServices;


@Controller
@ComponentScan(basePackages="com.worldpay")
public class CustomerController {

	@Autowired
	private CustomerServices customerService;
	
	
	@RequestMapping("AddCustomers")
	public ModelAndView addCustomer(@ModelAttribute("customer") Customer customer )
	{
		customerService.addCustomer(customer);
		ModelAndView mv=new ModelAndView("CustomerMenu");
		return mv;
		
		
	}
	
	@RequestMapping("AddCustomer")
	public String opencustomerPage()
	{
		return "AddCustomer";
		
	}
	
/*	@RequestMapping("savestudent")
	public ModelAndView saveStudentInfo(@ModelAttribute("student") Student student){
		studentService.studentEntry(student);
		ModelAndView mv=new ModelAndView("saveconfirm.jsp");
		return mv;
	}
	*/
	
}
