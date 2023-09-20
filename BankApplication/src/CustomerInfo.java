import java.util.Scanner;
public class CustomerInfo {
	
	public Customer[] create()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many Customer Details u want? ");
		int n=sc.nextInt();
		Customer custarr[]=new Customer[n];

		for(int i=0;i<custarr.length;i++)
		{
			System.out.println("Enter Customer Id: ");
			int custId=sc.nextInt();
			System.out.println("Enter Customer Name: ");
			String custName=sc.next();
			System.out.println("Enter Customer Adhar Number: ");
			String adharNo=sc.next();
			
			custarr[i]=new Customer(custId, custName, adharNo);
		}
		
	
    return custarr;
	}
	


public void display(Customer custarr[])
{
	for(int i=0;i<custarr.length;i++)
	{
		System.out.println("---------------- Customer Details ---------------------");
		System.out.println("Customer Id is: "+custarr[i].getCustId());
		System.out.println("Customer Name is: "+custarr[i].getCustName());
		System.out.println("Customer Adhar Number is: "+custarr[i].getAdharNo());
		
	}
	
}
}
