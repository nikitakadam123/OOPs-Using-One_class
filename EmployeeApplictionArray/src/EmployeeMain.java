import java.util.Scanner;
public class EmployeeMain {

	public static void main(String[] args) {
		
		EmployeeInfo einfo=new EmployeeInfo();
		Employee emparr[]=einfo.create();
		einfo.display(emparr);
		
		

	}

}
