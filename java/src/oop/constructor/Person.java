package oop.constructor;

public class Person {

	String name;
	int age;
	int height;
	Person() {  // 기본생성자 
	}
	
	Person(String pName, int pAge, int pHeight) {
		name = pName;
		age = pAge;
		height = pHeight;
	}
	
	void info() {
		System.out.println("****등록된 정보****");
		System.out.println("이름 :" + name);
		System.out.println("나이 :" + age + "세");
		System.out.println("키 :" + height + "cm");
	}
	
	
}
