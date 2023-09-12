import java.util.Scanner;

public class AccountInfo {
	public Account accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account number: ");
		int accNo=sc.nextInt();
		
		System.out.println("Enter Customer name: ");
		String cname=sc.next();
		
		System.out.println("Enter account balence: ");
		double accBqal=sc.nextDouble();
		
		Account aobj=new Account();
		aobj.setAccNo(accNo);
		aobj.setCustName(cname);
		aobj.setAccBal(accBqal);
		
		return aobj;
		
	}
	
	public void display(Account aobj)
	{
		System.out.println("Account NO.  "+aobj.getAccNo());
		System.out.println("Customer Name:  "+aobj.getCustName());
        System.out.println("Account Balence:  "+aobj.getAccBal());
	}

}
