import java.util.Scanner;
public class AccountMain {

	public static void main(String[] args) {
		int n=0;
		int c=0,loc=-1;
		int search=0;
		Scanner sc=new Scanner(System.in);
		Account arr[]=null;
		AccountInfo ainfo=new AccountInfo();
		int ch=0;
		do {
			System.out.println("1- Create \n2- Display \n3-Search");
			System.out.println("Enter Your Choice: ");
		    ch=sc.nextInt();
		    switch(ch)
		    {
		    case 1:
		    	arr=ainfo.create();
		    	break;
		    case 2:
		    	ainfo.display(arr);
		    	break;

		    case 3:
		    	loc=-1;
		    	System.out.println("Enter Account number do you want to Search? ");
		    	search =sc.nextInt();
		    	loc=ainfo.search(arr, search);
		    	if(loc>=0)
		    	{
		    		System.out.println("Element Found");
		    	}
		    	else {
		    		System.out.println("Element Not Found");
		    	}
		    	break;
		    	
		    }
			System.out.println("Do you want to continue? then press 1= ");
			c=sc.nextInt();
		}while(c==1);
	}
}
