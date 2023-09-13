import java.util.Scanner;

public class EmployeeInfo {
	
	public Employee[] create()
	{
Scanner sc=new Scanner(System.in);
		
		System.out.println("How many Employee Details do u want? ");
		int n=sc.nextInt();
		
		Employee emparr[]=new Employee[n];
		for(int i=0;i<emparr.length;i++)
		{
			System.out.print("Enter Employe Id: ");
			int empId=sc.nextInt();
			System.out.print("Enter Employee Name: ");
			String empName=sc.next();
			System.out.print("Enter Employe Salary: ");
			double empSalary=sc.nextDouble();
			
			Employee eobj=new Employee(empId,empName,empSalary);
			
			emparr[i]=eobj;
		}
		return emparr;

	}

	public void display(Employee emparr[])
	{
		for(int i=0;i<emparr.length;i++)
		{
			System.out.println("\t\t_________________________________________________\t\t");
			System.out.println("\t\tEmployee Id is: \t|\t\t"+emparr[i].getEmpId());
			System.out.println("\t\tEmploye Name is: \t|\t\t"+emparr[i].getEmpName());
			System.out.println("\t\tEmployee Salary is: \t|\t\t"+emparr[i].getEmpSalary());
			System.out.println("\t\t__________________________________________________\t\t");
		}
	}

}
