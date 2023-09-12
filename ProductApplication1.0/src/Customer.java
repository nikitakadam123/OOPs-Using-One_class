
public class Customer {
	private int custId;
	private String custName;
	private String mobileNo;
	public Customer(int custId, String custName, String mobileNo) {
		
		this.custId = custId;
		this.custName = custName;
		this.mobileNo = mobileNo;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	

}
