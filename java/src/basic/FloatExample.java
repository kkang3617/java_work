package basic;

public class FloatExample {

	public static void main(String[] args) {
		
		//실수 리터럴의 기본 데이터 타입은 double 입니다.
		float f1 = 7.12345F; //자바에서 실수의 기본타입은 double이다. 그래서 빨간줄. F붙여주기.
		double d1 = 7.12345;
		
		////////////////////////////////////////////////////////////////////
		
		float f2 = 1.234567891234F;
		double d2 = 1.234567891234;
		
		System.out.println(f2); //반올림됨.
		System.out.println(d2);

	}

}
