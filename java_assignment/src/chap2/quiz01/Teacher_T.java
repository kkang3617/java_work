package chap2.quiz01;

public class Teacher_T extends Person_T {

	private String subject;
	
	public Teacher_T(String name, int age) {
		super(name, age);
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Override
	public void info() {
		super.info();
		System.out.printf("담당 과목: %s\n", subject);
	}
	
	
}
