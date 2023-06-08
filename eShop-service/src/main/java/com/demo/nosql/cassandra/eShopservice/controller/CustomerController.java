package com.demo.nosql.cassandra.eShopservice.controller;
import com.demo.nosql.cassandra.eShopservice.entity.Customer;

import java.util.List;
import java.util.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.nosql.cassandra.eShopservice.repo.CustomerRepository;

@RestController
@RequestMapping("/shop")
public class CustomerController {

	private CustomerRepository repos;

	public CustomerController(CustomerRepository repos) {
		this.repos = repos;
	}
	@GetMapping(value = "/healthcheck", produces = "application/json; charset=utf-8")
	public String getHealthCheck()
	{
		return "{ \"isWorking\" : true }";
	}
	@GetMapping("/customers")
	public List<Customer> getCustomersAll()
	{
		Iterable<Customer> result = repos.findAll();
		List<Customer> customerList = new ArrayList<Customer>();
		result.forEach(customerList::add);
		return customerList;
	}
	@GetMapping("/customers/{name}")
	public List<Customer> findByCustomerName(@PathVariable String name)
	{
		Iterable<Customer> result = repos.findByCustomerName(name);
		List<Customer> customerList = new ArrayList<Customer>();
		result.forEach(customerList::add);
		return customerList;
	}
	
}
