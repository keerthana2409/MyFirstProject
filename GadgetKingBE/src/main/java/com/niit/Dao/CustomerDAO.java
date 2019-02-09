package com.niit.Dao;



public interface CustomerDAO {
	void registerCustomer(CustomerDAO customer);
	boolean isEmailUnique(String email);

}
