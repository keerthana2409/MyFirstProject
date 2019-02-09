package com.niit.Model;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Customer {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int customerid;
private String  firstname;
private String lastname;
private String phonenumber;

public int getCustomerId()
{
	return customerid;
}
public void setCustomerId(int customerId)
{
	this.customerid = customerId;
}
public String getFirstname() 
{
	return firstname;
}
public void setFirstname(String firstname)
{
	this.firstname = firstname;
}
public String getLastname()
{
	return lastname;
}
public void setLastname(String lastname)
{
	this.lastname = lastname;
}
public String getPhonenumber()
{
	return phonenumber;
}
public void setPhonenumber(String phonenumber)
{
	this.phonenumber = phonenumber;

}


}
