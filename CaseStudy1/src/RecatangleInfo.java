import java.util.Scanner;
public class RecatangleInfo {
	public Reactangle[] create()
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("How many Rectangle area u want? ");
		int n=sc.nextInt();
		
		Reactangle ractarr[]=new Reactangle[n];
		for(int i=0;i<ractarr.length;i++)
		{
		System.out.println("Enter length of rectangle: ");
		int length=sc.nextInt();
		System.out.println("Enter Breadth of rectangle: ");
		int breadth=sc.nextInt();
		
		int area;
		area=length*breadth;

		Reactangle robj=new Reactangle(length,breadth,area);
		
		ractarr[i]=robj;
		}
		return ractarr;
		
	}
	public void display(Reactangle ractarr[])
	{
		for(int i=0;i<ractarr.length;i++)
		{
			System.out.println("Lenght is: "+ractarr[i].getLength());
			System.out.println("Breadth is: "+ractarr[i].getBreadth());
			System.out.println("Area is: "+ractarr[i].getArea());
		}
		
		
	}
}
