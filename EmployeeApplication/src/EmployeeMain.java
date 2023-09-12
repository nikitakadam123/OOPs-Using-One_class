
public class EmployeeMain {

	public static void main(String[] args) {
		
		EmployeeInfo empinfo=new EmployeeInfo();
		Employee empobj=empinfo.create();
		empinfo.display(empobj);
	}

}
