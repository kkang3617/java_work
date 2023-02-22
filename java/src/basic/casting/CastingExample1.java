package basic.casting;

public class CastingExample1 {

	public static void main(String[] args) {

		/*
		 - 크기가 작은 데이터 타입의 자료를 큰 데이터 타입으로 변환할 때는
		  자바 가상 머신(JVM)이 자동으로 타입을 올려서 변환해 줍니다.
		  (promotion, Upcasting)
		 */
		
		byte b = 10;
		int i = b;
		System.out.println(i); // i가 b보다 타입이 크다.
		                       // b(byte)의 타입을 큰 i(int)타입으로 올려서 맞춰줌. 업캐스팅
		
		char c = 'A';
		int j = c;
		System.out.println("A의 문자 번호: " + j);
		
		int k = 500;   //int->double 로 업캐스팅.
		double d = k;
		System.out.println(d);
		

	}

}
