package oop.static_.singleton;

public class MainClass {

	public static void main(String[] args) {
		
//		Singleton s1 = new Singleton();
//		s1.method1();
//		s1.method2();
		
//		Singleton s1 = Singleton.s;
//		Singleton.s = null;
		
		Singleton s1 = Singleton.GetInstace();
		s1.method1();
		s1.method2();
		
		Singleton s2  = Singleton.GetInstace();
		Singleton s3  = Singleton.GetInstace();
		Singleton s4  = Singleton.GetInstace();
		Singleton s5  = Singleton.GetInstace();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
	}
	
}
