package com.edifixio.amine.ajax;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.edifixio.amine.beans.Employee;



@Controller
public class EmployeeController {
	
	@RequestMapping(value="/m",method=RequestMethod.GET)
	public String init() {
		return"index";
		
	}

	@RequestMapping(value = "/employee/add.htm", method = RequestMethod.POST)
	public @ResponseBody Employee add(HttpServletRequest request, HttpServletResponse response) throws Exception {

		Employee employee = new Employee();

		String firstName = request.getParameter("firstName");
		//String lastName = request.getParameter("lastName");
		//String email = request.getParameter("email");
		System.out.println(firstName);
		//employee.setEmail(email);
		employee.setFirstName(firstName);
		//employee.setLastName(lastName);

		return employee;
	}
}