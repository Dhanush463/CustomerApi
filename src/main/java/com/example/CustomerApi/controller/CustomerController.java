package com.example.CustomerApi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CustomerApi.entity.Customer;
import com.example.CustomerApi.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerSer;
	
	@GetMapping
	public List<Customer> getAllDetails() {
		return customerSer.getAllService();
	}
	
	@GetMapping("/{customername}")
	public Optional<Customer> getServiceByName(@PathVariable String customername) {
		return customerSer.getServiceByName(customername);
	}
	
	@PostMapping("/save")
	public Customer addNewService(@RequestBody Customer customer) {
		return customerSer.addNewService(customer);
	}
}
