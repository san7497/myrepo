package com.interview.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseType {
	private int emp_id;
	private String first_name;
	private String last_name;
	private int age;
	private String state;
	private String dept_name;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public ResponseType(int emp_id, String first_name, String last_name, int age, String dept_name) {
		this.emp_id = emp_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.age = age;
		this.dept_name = dept_name;
	}
	public ResponseType(int emp_id, String first_name, String last_name, int age, String dept_name,String state) {
		this.emp_id = emp_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.age = age;
		this.dept_name = dept_name;
		this.state=state;
	}
	
}
