package com.interview.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.interview.Repository.AddressRepository;
import com.interview.Repository.DeptRepository;
import com.interview.Repository.EmployeeRepository;
import com.interview.pojo.Address;
import com.interview.pojo.Department;
import com.interview.pojo.Employee;
import com.interview.pojo.ResponseType;

@Service
public class EmployeeService {

	@Autowired  
	EmployeeRepository empRepository;  
	
	@Autowired  
	AddressRepository addressRepository;
	
	@Autowired
	DeptRepository deptRepository;
	
	public List<Employee> getallEmployee() {
		// TODO Auto-generated method stub
		List<Employee> emplist = new ArrayList<Employee>();  
		emplist=(List<Employee>) empRepository.findAll();  
		return emplist; 
	}
	
	public List<Address> getAddress() {
		// TODO Auto-generated method stub
		List<Address> addrlist = new ArrayList<Address>();  
		addrlist=(List<Address>) addressRepository.findAll();
		return addrlist; 
	}

	public List<Department> getAllDept() {
		List<Department> deptList = new ArrayList<Department>();  
		deptList=(List<Department>) deptRepository.findAll();
		return deptList; 
	}

	public List<ResponseType> findByDept(String dept) {
		List<ResponseType> empList = new ArrayList<ResponseType>();
		empList=(List<ResponseType>) empRepository.fetchbyDept(dept);  
		return empList;
	}
	
	public List<ResponseType> findBystateanddept(String dept,String state) {
		List<ResponseType> empList = new ArrayList<ResponseType>();
		empList=(List<ResponseType>) empRepository.findBystateanddept(dept,state);  
		return empList;
	}

}
