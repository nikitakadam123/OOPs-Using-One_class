
public class Employee {
       private int empId;
       private String empName;
       private int empMobile;
       private int empSalary;
	public Employee(int empId, String empName, int empMobile, int empSalary) {
		
		this.empId = empId;
		this.empName = empName;
		this.empMobile = empMobile;
		this.empSalary = empSalary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpMobile() {
		return empMobile;
	}
	public void setEmpMobile(int empMobile) {
		this.empMobile = empMobile;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
       
}
