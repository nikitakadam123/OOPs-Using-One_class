import java.util.Scanner;
public class AccountInfo {
	
	public Account[] accsept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many Account Details Do u want? ");
		int n1=sc.nextInt();
		
		Account accarr[]=new Account[n1];
		
		for(int j=0;j<accarr.length;j++)
		{
			System.out.println("Enter Account Number: ");
			int accountNo=sc.nextInt();
			System.out.println("Enter Account Holder Name: ");
			String accountHolderName=sc.next();
			System.out.println("Enter Account type:");
			String accountType=sc.next();
			
			accarr[j]=new Account(accountNo,accountHolderName,accountType);
		}
		
	
    return accarr;
	}
public void show(Account accarr[])
{
	for(int j=0;j<accarr.length;j++)
	{
		System.out.println("-----------------Account Details---------------------------");
		System.out.println("Accoumt Number is: "+accarr[j].getAccountNo());
		System.out.println("Account Holter Name: "+accarr[j].getAccountHolderName());
		System.out.println("Account Type: "+accarr[j].getAccountType());
		
	}
}
}
