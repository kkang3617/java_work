package chap2.quiz01;

public class Person_T {

	private String name;
	private int age;
	
	public Person_T(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void info() {
		System.out.printf("이름: %s, 나이: %d세, ", name, age);
	}
	
}
/*클래스명: Person, Student, Teacher, Employee, MainClass

문제:
	- 학생(Student), 선생(Teacher), 종업원(Employee)
	클래스를 생성하려고 합니다.

	- 세 클래스는 공통적으로 이름과 나이를 가지고 있습니다.

	- 세 클래스는 공통적으로 info() 메서드를 가지고 있습니다.
	(리턴 타입: String, 이름: XXX, 나이: XXX )

	- 학생은 학번(studentId)을 가지고 있고,
	선생은 담당 과목(subject)를 가지고 있고,
	종업원은 부서 (departments)를 가지고 있습니다.

	- 부모 클래스의 이름은 Person으로 하겠습니다.
	Person 클래스 생성 후 각각의 자식 클래스를 생성 하시고
	MainClass에서 정보를 출력해 보세요.
	
입력: 
	입력은 따로 받지 않습니다. 값을 직접 주시면 됩니다.
	
출력:
	ex) 
		이름: 홍길동, 나이: 30세, 학번: a001
		이름: 김철수, 나이: 50세, 과목: 수학
		이름: 박영희, 나이: 25세, 부서: 영업부 */