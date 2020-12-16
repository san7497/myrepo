package com.interview.pojo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {
	private int emp_id;
	private String last_name;
	private String first_name;
	private int age;
	private int dept_id;
	
	@Column(name = "dept_id")
	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

	@Column(name = "lastname", nullable = false)
	public String getLast_name() {
		return last_name;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	@Column(name = "firstname", nullable = false)
	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	@Column(name = "age", nullable = false)
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	@OneToOne(targetEntity = Address.class, cascade = CascadeType.ALL)
	@JoinColumn(name="emp_id", referencedColumnName = "emp_id")
	List<Address>  addressModel;
	
	@ManyToOne(targetEntity = Department.class, cascade = CascadeType.ALL)
	@JoinColumn(name="dept_id", referencedColumnName = "dept_id")
	List<Department> deptModel;


}
