
public class greaterNumber {

	public void greaterNumber(int a,int b)
	{
		if(a<b)
		{
			System.out.println("Given number is "+a);
            System.out.println("Giver number is "+b);
			System.out.println("Second number is greater");
		}
		else
		{
			System.out.println("First number is greater");
		}
	}
	public void greaterNumber(float n,float m)
	{
		System.out.println("Given number is "+n);
        System.out.println("Giver number is "+m);
		if(n<m)
		{
			
			System.out.println("Second number is greater");
		}
		else
		{
			System.out.println("First number is greater");
		}
	}
	public char greaterNumber(char a,char b)
	{
		if(a<b)
		{
			return b;
		}
		else
		{
			return a;
		}
	}
}
