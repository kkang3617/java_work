package oop.constructor;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
	/*
	 Scanner를 이용해서 사용자에게
	 이름, 나이, 키를 입력받아서
	 해당 정보를 저장하는 객체를 디자인 하세요.
	 객체 내에는 해당 사람의 정보를 보두 출력해주는
	 info() 메서드가 존재한다.
	 */
	Scanner sc = new Scanner(System.in);
	System.out.print("이름입력: ");
	String n = sc.next();
	System.out.print("나이: ");
	int a = sc.nextInt();
	System.out.print("키: ");
	int h = sc.nextInt();
		
	Person p = new Person(n, a, h);
	p.info();       //↑생성자(Person 클래스에 있는)
	sc.close();
	
	
	
	
	}
}
