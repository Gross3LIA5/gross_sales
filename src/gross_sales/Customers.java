package gross_sales;

import java.util.ArrayList;

public class Customers 
{
	private ArrayList<Customer> customers;
	public Customers()
	{
		customers = new ArrayList<Customer>();
	}
	public ArrayList<Customer> getCustomers() 
	{
		return customers;
	}
	public void setCustomers(ArrayList<Customer> customers) 
	{
		this.customers = customers;
	}
}
