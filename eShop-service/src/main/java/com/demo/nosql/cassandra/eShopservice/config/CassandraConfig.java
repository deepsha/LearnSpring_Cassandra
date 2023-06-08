package com.demo.nosql.cassandra.eShopservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;

@Configuration
public class CassandraConfig extends AbstractCassandraConfiguration{
	@Value("${spring.data.cassandra.keyspace-name}")
    private String keySpace;

    @Value("${spring.data.cassandra.contact-points}")
    private String contactPoints;

    @Value("${spring.data.cassandra.port}")
    private int port;
	@Override
	protected String getKeyspaceName() {
		return keySpace;
	}
	 @Override
     public String getContactPoints() {
         return contactPoints;
     }

     @Override
     public int getPort() {
         return port;
     }
}
