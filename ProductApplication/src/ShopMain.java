
public class ShopMain {
public static void main(String[] args) {
	
	Product prod=new Product(101,"Laptop",20000,2);
	Address addr=new Address("Pune","Mh",411005);
	Customer cust=new Customer(1,"Nikita","12345",prod,addr);
	display(cust);
}
 public static void display(Customer cust) {
	 
	 System.out.println("Customer Id: "+cust.getCustId());
	 System.out.println("Customer Name: "+cust.getCustName());
	 System.out.println("Customer MobNo: "+cust.getCustMobNo());
	 System.out.println("----------------------------------------");
	 System.out.println("--------------Product Details--------------");
	 Product prod=cust.getProd();
	 System.out.println("Product Id: "+prod.getProdId());
	 System.out.println("Product Name: "+prod.getProdName());
	 System.out.println("Product Price: "+prod.getProdPrice());
	 System.out.println("Product Qty: "+prod.getProdQty());
	 System.out.println("------------------------------------------");
	 Address addr=cust.getAddr();
	 System.out.println("City: "+addr.getCity());
	 System.out.println("State: "+addr.getState());
	 System.out.println("Pincode: "+addr.getPincode());
 }
}
