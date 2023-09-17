import java.util.Scanner;
public class CustomerInfo {
	
	
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
			
			custarr[i]=new Customer(custId,custName,custMobilno);
			
		}
		return custarr;
	}
	
	public void display(Customer custarr[])
	{
		for(int i=0;i<custarr.length;i++)
		{
			System.out.println("Customer Id: "+custarr[i].getCust_Id());
			System.out.println("Customer Name: "+custarr[i].getCust_Name());
            System.out.println("Customer Mobile Number: "+custarr[i].getCust_Mobileno());
		}
	}

}
