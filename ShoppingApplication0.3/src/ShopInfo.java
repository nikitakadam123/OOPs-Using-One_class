import java.util.Date;
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
			
			System.out.println("Enter Customer City: ");
			String city=sc.next();
			System.out.println("Enter Customer State: ");
			String state=sc.next();
			System.out.println("Enter Customer Pincode: ");
			int pincode=sc.nextInt();
			
			Address addr=new Address(city, state, pincode);
			
			System.out.println("How mant product do u want? ");
			int n1=sc.nextInt();
			Product prodarr[]=new Product[n1];
			
			for(int j=0;j<prodarr.length;j++)
			{
			System.out.println("Enter Product Id: ");
			int prodId=sc.nextInt();
			System.out.println("Enter Product Name: ");
			String prodName=sc.next();
			System.out.println("Enter Product Price: ");
			double prodPrice=sc.nextDouble();
			System.out.println("Enter Product Qty: ");
			int prodQty=sc.nextInt();
			
			prodarr[i]=new Product(prodId, prodName, prodPrice,prodQty);
		   }
			custarr[i]=new Customer(custId, custName, custMobilno, prodarr, addr);
		}
		return custarr;
   }
		
	public void display(Customer custarr[])
	{
		for(int i=0;i<custarr.length;i++)
		{
		System.out.println("---------------------------Customer -------------------------------------------------");
		System.out.println("\t\t Customer Id is: "+custarr[i].getCustId());
		System.out.println("\t\t Customer Name is: "+custarr[i].getCustName());
		System.out.println("\t\t Customer Mobile Number is: "+custarr[i].getCustMobilno());
		System.out.println("------------------------------Address----------------------------------------------");
		
		System.out.println("\t\t Customer City: "+custarr[i].getAddr().getCity());
		System.out.println("\t\t Customer State: "+custarr[i].getAddr().getState());
		System.out.println("\t\t Customer Pincode: "+custarr[i].getAddr().getPincode());
		System.out.println("-----------------------------------------------------------------------------");
		
	
		Product prod[]=custarr[i].getProd();
	
		
		for(int j=0;j<prod.length;j++)
		{
			System.out.println("-----------------------Product--------------------");
		System.out.println("\t\t Product Id is: "+prod[i].getProdId());
		System.out.println("\t\t Product Name is: "+prod[i].getProdName());
		System.out.println("\t\t Product Price is: "+prod[i].getProdPrice());
		System.out.println("\t\t Product Qty is: "+prod[i].getProdQty());
		}
		
		System.out.println("-----------------------BILL-------------------------------------");
		
		for(int k=0;k<prod.length;k++)
		{
			System.out.println("Total bill: "+custarr[i].getBill().getTotalBill());
			System.out.println("Cgst: "+custarr[i].getBill().getCgst());
			System.out.println("Sgst: "+custarr[i].getBill().getSgst());
			

		}
		}
		}
		

	

	public void Billing(Customer custarr[],int year,Date billDate)
	{
		Bill billarr[]=new Bill[custarr.length];
		for(int i=0;i<custarr.length;i++)
		{
			double totalBill=0;
			for(int j=0;j<custarr.length;j++) {
 totalBill=totalBill+(custarr[i].getProd()[i].getProdPrice()*custarr[i].getProd()[i].getProdQty());
 
		}
			
		int billNo=101;
		//double totalBill=0;

		double cgst=totalBill*0.06;
		double sgst=totalBill*0.06;
		double payAmt=totalBill+cgst+sgst;
		int month=0;
		int date=0;
		//int year=0;
		
		Date d= new Date(year,month,date);
		
		
		//Date billDate = null;
		//int i = 0;
		billarr[i]=new Bill(totalBill, cgst, sgst);
		custarr[i].setBill(billarr[i]);
	}
	}

}


