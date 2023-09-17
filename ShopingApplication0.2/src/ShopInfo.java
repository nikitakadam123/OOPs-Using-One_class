import java.util.Scanner;
public class ShopInfo {
	
	public Customer create()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer Id: ");
		int custId=sc.nextInt();
		System.out.println("Enter Customer Name: ");
		String custName=sc.next();
		System.out.println("Enter Customer Mobile Number: ");
		String custMobilno=sc.next();
		
		System.out.println("Enter Customer City: ");
		String city=sc.next();
		System.out.println("Enter Customer State: ");
		String state=sc.next();
		System.out.println("Enter Customer Pincode: ");
		int pincode=sc.nextInt();
		
		System.out.println("How mant product do u want? ");
		int n=sc.nextInt();
		Product prodarr[]=new Product[n];
		
		for(int i=0;i<prodarr.length;i++)
		{
		System.out.println("Enter Product Id: ");
		int prodId=sc.nextInt();
		System.out.println("Enter Product Name: ");
		String prodName=sc.next();
		System.out.println("Enter Product Price: ");
		double prodPrice=sc.nextDouble();
		System.out.println("Enter Product Qty: ");
		int prodQty=sc.nextInt();
		
		Product prod=new Product(prodId, prodName, prodPrice,prodQty);
		prodarr[i]=prod;
		}
		Address addr=new Address(city, state, pincode);
		Customer cust=new Customer(custId,custName,custMobilno, prodarr, addr);
		return cust;
	}
	public void display(Customer cust)
	{
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("\t\t Customer Id is: "+cust.getCustId());
		System.out.println("\t\t Customer Name is: "+cust.getCustName());
		System.out.println("\t\t Customer Mobile Number is: "+cust.getCustMobilno());
		System.out.println("----------------------------------------------------------------------------");
		
		System.out.println("\t\t Customer City: "+cust.getAddr().getCity());
		System.out.println("\t\t Customer State: "+cust.getAddr().getState());
		System.out.println("\t\t Customer Pincode: "+cust.getAddr().getPincode());
		System.out.println("-----------------------------------------------------------------------------");
	
		Product prod[]=cust.getProd();
		for(int i=0;i<prod.length;i++)
		{
		System.out.println("\t\t Product Id is: "+prod[i].getProdId());
		System.out.println("\t\t Product Name is: "+prod[i].getProdName());
		System.out.println("\t\t Product Price is: "+prod[i].getProdPrice());
		System.out.println("\t\t Product Qty is: "+prod[i].getProdQty());
		System.out.println("-----------------------------------------------------------------------------");

		}
		

	}

}
