package com.moolahgo.codechallenge;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//You will create a MOBILE RESPONSIVE web form for user to key in a referral code. This input is required and the referral code should be 6 characters, only contain alphanumeric, all in upper case.

//There will be a submit button that is automatically enable/disable based on whether the mandatory fields are populated and valid.

//When user submit the form, display a wait icon, submit using ajax to the microservice, and then display the result.

@Controller
public class WebClientController {
	

		
		
	
	//1. view form for user to key in referral code 
	@RequestMapping(value = "/")
	public String ViewForm() {
		
		//any logic needed to view the form? 
		
		return "index.html";
	}
	
	
	

}
