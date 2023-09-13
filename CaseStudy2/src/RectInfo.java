import java.util.Scanner;
public class RectInfo {
	public Rectangle[] create()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many Rectangle data u want? ");
		int n=sc.nextInt();
		Rectangle rectarr[]=new Rectangle[n]; 
		for(int i=0;i<rectarr.length;i++)
		{
			System.out.println("Enter Rectangle Length: ");
			float rectLength=sc.nextFloat();
			System.out.println("Enter Rectangle Width: ");
			float rectWidth=sc.nextFloat();
			System.out.println("Enter Rectangle Breadth: ");
			float rectBreadth=sc.nextFloat();
			
			float rectArea;
			rectArea=rectLength*rectBreadth;
			
			float rectPerimeter;
			rectPerimeter=(rectLength+rectWidth)*2;
			
			
			Rectangle rectobj=new Rectangle(rectLength,rectWidth,rectArea,rectPerimeter,rectBreadth);
			rectarr[i]=rectobj;

			
		}
		return rectarr;
	}
	
	public void display(Rectangle rectarr[])
	{
		
		for(int i=0;i<rectarr.length;i++)	
		{
			System.out.println("Length of rectangle is: "+rectarr[i].getRectLength());
			System.out.println("Breadth of rectangle is: "+rectarr[i].getRectBreadth());
			System.out.println("Area is= "+rectarr[i].getRectArea());
			System.out.println("_______________________________________________________");
			System.out.println("Length of rectangle is: "+rectarr[i].getRectLength());
			System.out.println("Width of rectangle: "+rectarr[i].getRectWidth());
			System.out.println("Perimeter is= "+rectarr[i].getRectPerimeter());
			System.out.println("_______________________________________________________");
		}
	}

}
