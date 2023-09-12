
import java.util.Scanner;
public class AddressInfo {
	Scanner sc=new Scanner(System.in);
	public Address create()
	{
		System.out.println("Enter City name: ");
		String addName=sc.next();
		
		System.out.println("Enter Pincode: ");
		int addPinCode=sc.nextInt();
		
		
		Address addobj=new Address(addName,addPinCode);
		return addobj;
		
	}
	
	public void display(Address addobj)
	{
		System.out.println("City is "+addobj.getCity());
		System.out.println("PinCode Number is : "+addobj.getPinCode());
	}

}
