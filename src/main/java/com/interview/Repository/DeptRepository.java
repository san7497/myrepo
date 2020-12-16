package com.interview.Repository;

import org.springframework.data.repository.CrudRepository;

import com.interview.pojo.Department;

public interface DeptRepository extends CrudRepository<Department, Integer>{

}
