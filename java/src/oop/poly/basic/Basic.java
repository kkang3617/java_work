package oop.poly.basic;

/*
 - 자바에서는 하나의 클래스 파일에 여러개의 클래스를 선언할 수 있다.
   밀접한 연관이 있는 클래스를 모아놓기 위해 사용한다.
 - 단 ,파일명과 동일한 클래스가 반드시 존재해야하고,
   해당 클래스만 public으로 선언할 수 있다.
 */

class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}


public class Basic {

	A a = new A();
	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
	
	/*
	 - 다형성이란? 자식 객체가 모든 부모의 타입을 가질 수 있다는 것을
	   의미한다. 
	 - 즉, 부모타입 변수에 자식 객체의 주소값을 얼마든지 저장할 수 있다는
	   것을 의미한다.
	 - 타입의 규격화
	 */
	
	A v1 = new B(); //클래스 타입 B -> A타입으로 자동 형변환(promotion)
	A v2 = new C();
	A v3 = new D();
	A v4 = new E();
	A v5 = b;
	
	B v6 = new D();
	C v7 = new E();
	
	//상속관계가 없다면 다형성 적용이 불가능하다.
	//즉, 다형성은 무조건 상속관계 하에서만 발생한다.
//	B v8 = new E(); (x)
//	C v9 = new D(); (x)
//	B v10 = new C(); (x)
//	D v11 = new E(); (x)
	
	//Object는 자바의 최상위 클래스이다.
	//모든 클래스는 결국 Object의 자식이다.
	//Object 타입의 변수에는 어떠한 객체도 들어올 수 있다.
	
	Object o1 = new A();
	Object o2 = new A();
	Object o3 = new C();
	Object o4 = new D();
	Object o5 = new E();
	Object o6 = new String("안녕하세요!");
	Object o7 = new Basic();
	
	
}
