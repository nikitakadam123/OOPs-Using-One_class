
public class Customer {
	
	private int custId;
	private String custName;
	private String custMobNo;
	
	private Product prod[];//101 laptop 20000
	private Address addr;
	
	public Customer(int custId, String custName, String custMobNo, Product prod[], Address addr) {
		this.custId = custId;
		this.custName = custName;
		this.custMobNo = custMobNo;
		this.prod = prod;
		this.addr = addr;
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
	public String getCustMobNo() {
		return custMobNo;
	}
	public void setCustMobNo(String custMobNo) {
		this.custMobNo = custMobNo;
	}
	public Product[] getProd() {
		return prod;//pid pnm price qty
	}
	public void setProd(Product prod[]) {
		this.prod = prod;
	}
	public Address getAddr() {
		return addr;//city state pincode
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
}
