package chap2.quiz01;

public class Teacher extends Person {

	String subject;

	@Override
	void info() {
		super.info();
		System.out.printf(" 과목: %s\n", subject);
	}
	
	
}
