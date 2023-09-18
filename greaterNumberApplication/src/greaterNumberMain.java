
public class greaterNumberMain {

	public static void main(String[] args) {
		greaterNumber gn=new greaterNumber();
		System.out.println("In given two integer second number is greater!");
		gn.greaterNumber(10, 20);
		System.out.println("-----------------------------------------------------");
		
		System.out.println("In given two float number first number is greater!");
		gn.greaterNumber(3.14f, 2.2f);
		System.out.println("----------------------------------------------------");
     
		gn.greaterNumber('a', 'A');
		System.out.println("In given two integer a is greater ");

		

	}

}
