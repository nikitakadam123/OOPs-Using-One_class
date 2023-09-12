
public class Customer {
 private int custId;
 private String custName;
 private String custMobNo;
 private Product prod;
 private Address addr;
public Customer(int custId, String custName, String custMobNo, Product prod, Address addr) {
	super();
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
public Product getProd() {
	return prod;
}
public void setProd(Product prod) {
	this.prod = prod;
}
public Address getAddr() {
	return addr;
}
public void setAddr(Address addr) {
	this.addr = addr;
}
 
 
 
}