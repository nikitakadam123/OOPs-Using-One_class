
public class Address {
	
	private String customerCity;
	private String custState;
	private int custPinCode;
	public Address(String customerCity, String custState, int custPinCode) {
		
		this.customerCity = customerCity;
		this.custState = custState;
		this.custPinCode = custPinCode;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	public String getCustState() {
		return custState;
	}
	public void setCustState(String custState) {
		this.custState = custState;
	}
	public int getCustPinCode() {
		return custPinCode;
	}
	public void setCustPinCode(int custPinCode) {
		this.custPinCode = custPinCode;
	}
	

}
