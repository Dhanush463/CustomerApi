package com.example.CustomerApi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CustomerApi.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	Optional<Customer> findByCustomername(String customername);
}
