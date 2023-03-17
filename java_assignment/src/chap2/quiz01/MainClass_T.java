package chap2.quiz01;

public class MainClass_T {

	public static void main(String[] args) {
		
		Student_T stu = new Student_T("홍길동", 30);
		stu.setStudentId("a001");
		
		Teacher_T t = new Teacher_T("김철수", 50);
		t.setSubject("수학");
		
		Employee_T emp = new Employee_T("박영희", 25);
		emp.setDepartment("영업부");
		
		stu.info();
		t.info();
		emp.info();
		
		
		
	}
	
}
