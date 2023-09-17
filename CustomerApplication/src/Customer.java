
public class Customer {
	
	private int cust_Id;
	private String cust_Name;
	private String cust_Mobileno;
	public Customer(int cust_Id, String cust_Name, String cust_Mobileno) {
		
		this.cust_Id = cust_Id;
		this.cust_Name = cust_Name;
		this.cust_Mobileno = cust_Mobileno;
	}
	public int getCust_Id() {
		return cust_Id;
	}
	public void setCust_Id(int cust_Id) {
		this.cust_Id = cust_Id;
	}
	public String getCust_Name() {
		return cust_Name;
	}
	public void setCust_Name(String cust_Name) {
		this.cust_Name = cust_Name;
	}
	public String getCust_Mobileno() {
		return cust_Mobileno;
	}
	public void setCust_Mobileno(String cust_Mobileno) {
		this.cust_Mobileno = cust_Mobileno;
	}
	
	
	
	

}
