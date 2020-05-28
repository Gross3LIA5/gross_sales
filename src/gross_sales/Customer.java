package gross_sales;
public class Customer 
{
	private int customerID;
	private String firstName;
	private double credit;	
	public Customer(int customerID, String firstName)
	{
		setCustomerID(customerID);
		setFirstName(firstName);
	}
	public int getCustomerID() 
	{
		return customerID;
	}
	public String getFirstName() 
	{
		return firstName;
	}
	public double getCredit() 
	{
		return credit;
	}
	public void setCredit(double credit) 
	{
		this.credit = credit;
	}
	public void setCustomerID(int customerID) 
	{
		this.customerID = customerID;
	}
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}	
}
