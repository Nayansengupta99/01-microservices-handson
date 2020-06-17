package com.cognizant.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("loans")
public class LoanController 
{
	
	@GetMapping("/{number}")
	public String getLoanDetails(@PathVariable String number)
	{
		String str = "Number: "+number+", type: car, loan: 400000, emi: 3258, tenure: 18";
		return str;
		
	}

}