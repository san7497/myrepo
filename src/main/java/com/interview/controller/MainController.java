package com.interview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.interview.pojo.Address;
import com.interview.pojo.Department;
import com.interview.pojo.Employee;
import com.interview.pojo.ResponseType;
import com.interview.service.EmployeeService;

@RestController
@RequestMapping(value="/employee")
public class MainController {
	
	@Autowired  
	 EmployeeService employeeservice; 
	
	 @RequestMapping(value = "/getAllEmployee", method = RequestMethod.GET,produces = "application/json; charset=UTF-8")
	   public List <Employee> hello() {
		 return employeeservice.getallEmployee();   
	   }
//	 @RequestMapping(value = "/getAddress", method = RequestMethod.GET,produces = "application/json; charset=UTF-8")
//	   public List <Address> getAddress() {
//		 return employeeservice.getAddress();   
//	   }
//	 @RequestMapping(value = "/getDept", method = RequestMethod.GET,produces = "application/json; charset=UTF-8")
//	   public List <Department> getDept() {
//		 return employeeservice.getAllDept();   
//	   }
	 @RequestMapping(value = "/findByDept", method = RequestMethod.GET,produces = "application/json; charset=UTF-8")
	   public List<ResponseType> findByDept(@RequestParam String dept) {
		 return employeeservice.findByDept(dept);   
	   }
	 @RequestMapping(value = "/findBystateanddept", method = RequestMethod.GET,produces = "application/json; charset=UTF-8")
	   public List<ResponseType> findBystateanddept(@RequestParam String dept,@RequestParam String state) {
		 return employeeservice.findBystateanddept(dept,state);   
	   }
}
