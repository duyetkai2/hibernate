package edu.phuxuan.k17.spring.hibernate2.dao;

import java.util.List;

import edu.phuxuan.k17.spring.hibernate2.entity.Customer;

public interface CustomerDAO {
	 public List < Customer > getCustomers();

	    public void saveCustomer(Customer theCustomer);

	    public Customer getCustomer(int theId);

	    public void deleteCustomer(int theId);

}
