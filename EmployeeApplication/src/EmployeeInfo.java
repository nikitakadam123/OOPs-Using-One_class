import java.util.Scanner;
public class EmployeeInfo {
	Scanner sc=new Scanner(System.in);
	public Employee create()
	{
		System.out.println("Enter Employee Id: ");
		int empId=sc.nextInt();
		System.out.println("Enter Employee Name: ");
		String empName=sc.next();
		System.out.println("Enter Employee Mobile number: ");
		int empMobile=sc.nextInt();
		System.out.println("Enter Employee Salary: ");
		int empSalary=sc.nextInt();
		
		Employee empobj=new Employee(empId,empName,empMobile,empSalary);
		return empobj;
		
	}
	
	public void display(Employee empobj)
	{
		System.out.println("Employee Id is: "+empobj.getEmpId());
		System.out.println("Employee Name is :"+empobj.getEmpName());
		System.out.println("Employee Mobile Number is: "+empobj.getEmpMobile());
		System.out.println("Employe Salary is "+empobj.getEmpSalary());
		
	}

}
