package com.edifixio.amine.ajax;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.edifixio.amine.beans.Users;

@Controller 
public class AjaxController {
	
	@RequestMapping(value = "/ds", method = RequestMethod.GET)
	public String initial() throws Exception {

		return "testAjax";
	}
	 
	  
	 @RequestMapping("/home")  
	 public @ResponseBody  
	 String hello(@RequestParam(value = "name") String name,  
	   @RequestParam(value = "gender") String gender,  
	   @RequestParam(value = "email") String email,  
	   @RequestParam(value = "phone") String phone,  
	   @RequestParam(value = "city") String city) {  
	  System.out.println(name);  
	  System.out.println(gender);  
	  System.out.println(email);  
	  System.out.println(phone);  
	  System.out.println(city);  
	  
	  String str = "{\"user\": { \"name\": \"" + name + "\",\"gender\": \""  
	    + gender + "\",\"email\": \"" + email + "\",\"phone\": \""  
	    + phone + "\",\"city\": \"" + city + "\"}}";  
	  return str;  
	  
	 }  
	 
	 
		
		@RequestMapping(value = "/t", method = RequestMethod.GET)
		public ModelAndView printWelcome(@ModelAttribute("user") Users user) {

			ModelAndView mav = new ModelAndView("testAjax2");
			mav.addObject("message", "Hello World!!!");
			return mav;

		}

		@RequestMapping(value="/submitForm.web", method = RequestMethod.POST)
			public @ResponseBody Users  submittedFromData(@RequestBody Users user, HttpServletRequest request) {	
			
			System.out.println("cc");
			return user;
		}	
	}  


