
public class Customer {
	private int custId;
	private String custName;
	private String custMobilno;
	private Product prod[];
	private Address addr;
	public Customer(int custId, String custName, String custMobilno, Product[] prod, Address addr) {
		
		this.custId = custId;
		this.custName = custName;
		this.custMobilno = custMobilno;
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
	public String getCustMobilno() {
		return custMobilno;
	}
	public void setCustMobilno(String custMobilno) {
		this.custMobilno = custMobilno;
	}
	public Product[] getProd() {
		return prod;
	}
	public void setProd(Product prod[]) {
		this.prod = prod;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	

}
