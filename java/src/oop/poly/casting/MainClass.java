package oop.poly.casting;

public class MainClass {

	public static void main(String[] args) {

		Parent p = new Parent();
		p.n1 = 1;
//		p.n2 = 2; (x) 자식이가지고 있는 것은 부모 클래스에서는 모름.
		
		p.method1();
		p.method2();
//		p.method3(); (x) 자식이가지고 있는 것은 부모 클래스에서는 모름.

		System.out.println("-----------------------------");
		
		Child c = new Child();
		c.n1 = 1; // 부모에게 물려받은 속성
		c.n2 = 2;
		
		c.method1();
		c.method2();  //부모 속성
		c.method3();
		
		System.out.println("------------------------------");
		
		//다형성 적용(promotion)
		Parent p2 = new Child();
		p2.n1 = 1;
//		p2.n2 = 2; (x)
		
		p2.method1();
		p2.method2();
//		p2.method3(); (x)
		
		/*
		 - 다형성이 적용되면 자식 클래스의 본래의 맴버(필드, 메서드)를 
		   참조하지 못하는 문제가 발생.
		   
		 - 이를 해결하기 위해 강제 타입 변환을 사용한다.
		 */
		Child c2 = (Child) p2; // 부모타입을 자식타입으로 강제 변환
		                                    //Downcasting
		c2.n2 = 2;
		c2.method1();
		c2.method2();
		c2.method3();
		System.out.println("p2의 주소값: " + p2);
		System.out.println("p2의 주소값: " + c2);
		
		Object o = new Parent();
//		o.n1 = 1; (x)
//		o.method1(); (x)
		
		//다형성이 한 번도 발생하지 않은 경우에는
		//강제 형 변환을 사용할 수 없다.
		Parent ppp = new Parent();
//		Child c3 = (Child) ppp; (x)
		
	}

}
