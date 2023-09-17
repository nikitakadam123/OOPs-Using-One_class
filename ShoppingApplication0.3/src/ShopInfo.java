import java.util.Scanner;
public class ShopInfo {
	
	public Customer[] accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many Customer data u want? ");
		int n=sc.nextInt();
		Customer custarr[]=new Customer[n];
		for(int i=0;i<custarr.length;i++)
		{
			System.out.println("Enter Customer id:");
			int custId=sc.nextInt();
			System.out.println("Enter Customer Name: ");
			String custName=sc.next();
			System.out.println("Enter Customer mobile Number: ");
			String custMobilno=sc.next();
			
		
			//Customer cust=new Customer(custId, custName, custMobilno);
			//custarr[i]=cust;
			
			custarr[i]=new Customer(custId,custName,custMobilno);
			
			
		}
		return custarr;
	
		
		System.out.println("Enter Customer City: ");
		String city=sc.next();
		System.out.println("Enter Customer State: ");
		String state=sc.next();
		System.out.println("Enter Customer Pincode: ");
		int pincode=sc.nextInt();
		
		System.out.println("How mant product do u want? ");
		int n1=sc.nextInt();
		Product prodarr[]=new Product[n1];
		
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
		//Customer cust=new Customer(custId,custName,custMobilno, prodarr, addr);
		//return cust;
	}
	public void display(Customer custarr[])
	{
		for(int i=0;i<custarr.length;i++)
		{
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("\t\t Customer Id is: "+custarr[i].getCustId());
		System.out.println("\t\t Customer Name is: "+custarr[i].getCustName());
		System.out.println("\t\t Customer Mobile Number is: "+custarr[i].getCustMobilno());
		System.out.println("----------------------------------------------------------------------------");
		
		System.out.println("\t\t Customer City: "+custarr[i].getAddr().getCity());
		System.out.println("\t\t Customer State: "+custarr[i].getAddr().getState());
		System.out.println("\t\t Customer Pincode: "+custarr[i].getAddr().getPincode());
		System.out.println("-----------------------------------------------------------------------------");
		}
	}
		//Product prod[]=custarr[].getProd();
		public void display(Product prodarr[])
		{
		for(int i=0;i<prodarr.length;i++)
		{
		System.out.println("\t\t Product Id is: "+prodarr[i].getProdId());
		System.out.println("\t\t Product Name is: "+prodarr[i].getProdName());
		System.out.println("\t\t Product Price is: "+prodarr[i].getProdPrice());
		System.out.println("\t\t Product Qty is: "+prodarr[i].getProdQty());
		System.out.println("-----------------------------------------------------------------------------");

		}
		

	
	}
}
