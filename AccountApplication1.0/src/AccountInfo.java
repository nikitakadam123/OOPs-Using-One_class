import java.util.Scanner;
public class AccountInfo {
	
	Scanner sc=new Scanner(System.in);
	int SearchNo=0;
	public Account[] create()
	{
		System.out.println("How many Account do u want? ");
		int n=sc.nextInt();
		
		Account arr[]=new Account[n];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter Account number: ");
			int accNo=sc.nextInt();
			System.out.println("Enter Customer Name: ");
			String custname=sc.next();
			System.out.println("Enter Account Type: ");
			String accType=sc.next();
			System.out.println("Enter Account Balence: ");
			double accBal=sc.nextDouble();
			
			Account a=new Account(accNo, custname, accType, accBal);
			arr[i]=a;
		}
		return arr;
	}
	
	public void display(Account arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Account number is: "+arr[i].getAccNo());
			System.out.println("Customer Name is: "+arr[i].getCustname());
			System.out.println("Account Type is: "+arr[i].getAccType());
			System.out.println("Account Balence is: "+arr[i].getAccBal());
		}
	}
	
	public int search(Account arr[],int searchNo)
	{
		int loc=-1;
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i].getAccNo()==searchNo) 
			{
				loc=i;
				break;
			}
		}
		return loc;
	}

}
