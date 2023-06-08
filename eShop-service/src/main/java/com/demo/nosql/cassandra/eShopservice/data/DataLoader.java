package com.demo.nosql.cassandra.eShopservice.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.demo.nosql.cassandra.eShopservice.entity.Customer;
import com.demo.nosql.cassandra.eShopservice.repo.CustomerRepository;

@Component
public class DataLoader implements CommandLineRunner{

	@Autowired
	private CustomerRepository repo;
	@Override
	public void run(String... args) throws Exception {
		  repo.saveAll(List.of(
                  new Customer(1,"Bob","mg road",30), 
                  new Customer(2,"Robin","London",27),
                  new Customer(3,"Mary","Meblourne",34),
                  new Customer(4,"Peter","London",46),
                  new Customer(5,"Smith","Sydney",28),
                  new Customer(6,"John","Meblourne",25)
                  )
        );

		
	}

}
