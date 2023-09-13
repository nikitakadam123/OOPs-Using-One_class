import java.util.Scanner;
public class BookInfo {

	public Book[] create()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many books you want? ");
		int n=sc.nextInt();
		
		Book barr[]=new Book[n];
		for(int i=0;i<barr.length;i++) {
			System.out.println("Enter Book Title: ");
			String tital=sc.next();
			System.out.println("Enter Book Price: ");
			int price=sc.nextInt();
			
			Book bobj=new Book(tital,price);
			barr[i]=bobj;
			
			
		}
		return barr;
	}
	
	public void display(Book barr[])
	{
		for(int i=0;i<barr.length;i++)
		{
			
			System.out.println("\t\tBook Title is:"+barr[i].getTital()+"\t\t Price= "+barr[i].getPrice());
		}
	}
}
