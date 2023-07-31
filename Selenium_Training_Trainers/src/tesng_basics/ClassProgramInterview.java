package tesng_basics;

public class ClassProgramInterview {
	
	int age=20;
	String name="Yogita";
	String EmpID="TYC0921258";
	int sal=5000;
	
	public void employeeName(String name) {
		this.name=name;
	}
	
	public void employeeID(String empID) {
		this.EmpID=empID;
	}
	public void employeeAge(int Age) {
		this.age=Age;
	}
	public void employeeSalary(int salary) {
		this.sal=salary;
	}
	
	public static void main(String[] args) {
		ClassProgramInterview sc=new ClassProgramInterview();
		sc.employeeAge(30);
		System.out.println(sc.age);
	}
}
