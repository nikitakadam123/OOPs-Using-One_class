import java.util.Scanner;
public class Area {

	public void calArea(float r)
	{
		Scanner sc=new Scanner(System.in);
		float ca;
		ca=3.14f*r*r;
		System.out.println("Enter radious of circle: ");
		float r1=sc.nextFloat();
		System.out.println("Area of circle is "+ca);

	}
	
}
