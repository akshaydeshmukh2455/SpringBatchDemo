package com.app.yash.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.yash.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
