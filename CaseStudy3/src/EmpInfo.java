import java.util.Scanner;
public class EmpInfo {
	
	public Employee[] create()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\t\tHow many Employee Details you want --->");
        int n=sc.nextInt();
        
        Employee emparr[]=new Employee[n];
        for(int i=0;i<emparr.length;i++)
        {
		System.out.print("Enter Employee Id: ");
		int empId=sc.nextInt();
		System.out.print("Enter Employee Name: ");
		String empName=sc.next();
		System.out.print("Enter Employee Salary: ");
		float empSalary=sc.nextFloat();
		
		
		Employee empobj=new Employee(empId,empName,empSalary);
		emparr[i]=empobj;
		
		
	}
	return emparr;
	}
	
	public void display(Employee emparr[])
	{
		for(int i=0;i<emparr.length;i++)
		{
		     System.out.println("___________________________________________________________________________");

			System.out.println("\t\tEmployee id= "+emparr[i].getEmpId());
			System.out.println("\t\tEmployee Name= "+emparr[i].getEmpName());
			System.out.println("\t\tEmployee Salary= "+emparr[i].getEmpSalary());
		}
		
	}
}
