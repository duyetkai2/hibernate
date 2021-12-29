package edu.phuxuan.k17.spring.hibernate2.service;

import java.util.List;

import edu.phuxuan.k17.spring.hibernate2.entity.Customer;

public interface CustomerService {
	 public List <Customer> getCustomers();

	 public void saveCustomer(Customer theCustomer);

	 public Customer getCustomer(int theId);

	 public void deleteCustomer(int theId);
}
