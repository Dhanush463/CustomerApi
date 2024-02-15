package com.example.CustomerApi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CustomerApi.entity.Customer;
import com.example.CustomerApi.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepo;
	
	public List<Customer> getAllService() {
		return customerRepo.findAll();
	}
	
	public Optional<Customer> getServiceByName(String customername) {
		return customerRepo.findByCustomername(customername);
	}
	
	public Customer addNewService(Customer customer) {
		return customerRepo.save(customer);
	}
}
