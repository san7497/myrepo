package com.interview.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.interview.pojo.Employee;
import com.interview.pojo.ResponseType;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>, JpaRepository<Employee,Integer>{
	
	@Query("SELECT new com.interview.pojo.ResponseType(e.emp_id,e.first_name,e.last_name,e.age,d.dept_name) FROM Employee e, Department d WHERE e.dept_id = d.dept_id AND d.dept_name=?1")
	List<ResponseType> fetchbyDept(String dept);
	
	@Query("SELECT new com.interview.pojo.ResponseType(e.emp_id,e.first_name,e.last_name,e.age,d.dept_name,a.state) FROM Employee e, Department d, Address a WHERE e.dept_id = d.dept_id AND e.emp_id=a.emp_id AND d.dept_name=?1 AND a.state=?2")
	List<ResponseType> findBystateanddept(String dept,String state);
	
	
}
