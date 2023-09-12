import java.util.Scanner;
public class BookInfo {
	
	public Book create()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Book Id: ");
		int bookId=sc.nextInt();
		System.out.println("Enter Book Name: ");
		String bookName=sc.next();
		System.out.println("Enter Book price: ");
		float bookPrice=sc.nextFloat();
		
		Book bobj=new Book(bookId,bookName,bookPrice);
		
		return bobj;
		
	}
	public void display(Book bobj) {
		System.out.println("Book Id: "+bobj.getBookId());
		System.out.println("Book Name: "+bobj.getBookName());
		System.out.println("Book Price: "+bobj.getBookPrice());
		
	}

}
