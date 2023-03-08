package chap2.quiz01;

public class MainClass {

	public static void main(String[] args) {
		
		Student stu = new Student();
		stu.name = "홍길동";
		stu.age = 30;
		stu.studentId = "a001";
		stu.info();
		
		Teacher tea = new Teacher();
		tea.name = "김철수";
		tea.age = 50;
		tea.subject = "수학";
		tea.info();
		
		Employee emp = new Employee();
		emp.name = "박영희";
		emp.age = 25;
		emp.departments = "영업부";
		emp.info();
	}
	
}
