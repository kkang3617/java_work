package oop.test;
//작석중인 패키지와 다른 곳에 위치한 클래스를 사용하려면 import 선언이 필요함.
//import oop.fruits.Apple;
//import oop.fruits.Banana;
//import oop.fruits.Melon;
import oop.fruits.*; //fruits 패키지의 모든 클래스를 import 하겠다.

public class Test {

	public static void main(String[] args) {
	
		//다른 패키지 내의 같은 이름을 가진 클래스 객체를 생성할 때는
		//반드시 패키지 경로를 직접 표시해 주어야 한다.
		
		Apple a = new Apple();
		oop.juice.Apple a2 = new oop.juice.Apple();
		Banana b = new Banana();
		Melon m = new Melon();
		
//		java.util.Scanner sc = new java.util.Scanner(System.in);
	    //import안하고 이렇게 쓸 수도 있다.
	}
}
