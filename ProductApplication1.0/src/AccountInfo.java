import java.util.Scanner;
public class AccountInfo {

	Scanner sc=new Scanner(System.in);
	public Account create()
	{
		System.out.println("Enter Account Number: ");
		int accNo=sc.nextInt();
		
		System.out.println("Enter Account Type: ");
		String accType=sc.next();
		
		System.out.println("Enter Account Balence: ");
		int accBal=sc.nextInt();
		
		Account accobj=new Account(accNo,accType,accBal);
		return accobj;
		
	}
	
	public void display(Account accobj)
	{
		System.out.println("Account Number is "+accobj.getAccNo());
		System.out.println("Account Type is : "+accobj.getAccType());
		System.out.println("Account Balence is "+accobj.getAccBal());
		
	}
			
}
