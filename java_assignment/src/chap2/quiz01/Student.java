package chap2.quiz01;

public class Student extends Person {

	String studentId;

	@Override
	void info() {
		super.info();
		System.out.printf(" 학번: %s\n", studentId);
	}
	
}
