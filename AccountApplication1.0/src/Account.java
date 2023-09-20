
public class Account {
	private int accNo;
	private String custname;
	private String accType;
	private double accBal;
	public Account(int accNo, String custname, String accType, double accBal) {
		
		this.accNo = accNo;
		this.custname = custname;
		this.accType = accType;
		this.accBal = accBal;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public double getAccBal() {
		return accBal;
	}
	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}
	
	
	

}
