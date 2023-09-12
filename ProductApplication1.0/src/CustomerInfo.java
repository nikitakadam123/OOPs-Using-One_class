import java.util.Scanner;
public class CustomerInfo {
	Scanner sc=new Scanner(System.in);
	public Customer create()
	{
		System.out.println("Enter Customer ID: ");
		int custId=sc.nextInt();
		
		System.out.println("Enter Customer Name: ");
		String custName=sc.next();
		
		System.out.println("Enter customer Mobile Number: ");
		String cusMobile=sc.next();
		
		Customer custobj=new Customer(custId,custName,cusMobile);
		return custobj;
		
	}
	
	public void display(Customer custobj)
	{
		System.out.println("Customer id is: "+custobj.getCustId());
		System.out.println("Customer name is : "+custobj.getCustName());
		System.out.println("Customer Mobile number is: "+custobj.getMobileNo());
	}

}
