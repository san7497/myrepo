package com.interview.Repository;

import org.springframework.data.repository.CrudRepository;

import com.interview.pojo.Address;



public interface AddressRepository extends CrudRepository<Address, Integer>{

}
