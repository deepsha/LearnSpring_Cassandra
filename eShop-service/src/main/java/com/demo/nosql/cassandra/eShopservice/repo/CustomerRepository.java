package com.demo.nosql.cassandra.eShopservice.repo;

import java.util.List;

import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.demo.nosql.cassandra.eShopservice.entity.Customer;
@Repository
public interface CustomerRepository extends CassandraRepository<Customer, Integer>{

	@AllowFiltering
	List<Customer> findByCustomerName(String name);
}
