import java.util.Scanner;
public class AddressInfo {
	
	public Address create(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer City: ");
		String customerCity=sc.next();
		System.out.println("Enter Customer State: ");
		String custState=sc.next();
		System.out.println("Enter Customer Pincode: ");
		int custPinCode=sc.nextInt();
		
		Address addr=new Address(customerCity, custState, custPinCode);
		
		return addr;
	}
	public void display(Address addr)
	{
		System.out.println("Customer City: "+addr.getCustomerCity());
		System.out.println("Customer State: "+addr.getCustState());
		System.out.println("Customer Pincode: "+addr.getCustPinCode());
	}

	
	

}
