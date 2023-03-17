package chap2.quiz01;

public class Employee_T extends Person_T {

	private String department;
	
	public Employee_T(String name, int age) {
		super(name, age);
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	public void info() {
		super.info();
		System.out.printf("부서: %s\n", department);
	}
	
	
}
