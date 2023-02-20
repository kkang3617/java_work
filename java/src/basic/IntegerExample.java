package basic;   // 패키지를 생성해서 생긴 것. 항상 최상단에 위치함.

public class IntegerExample {

	public static void main(String[] args) {

		/*
		 # 리터럴 : 변수에 저장되기 전의 상수값.
		 자바의 정수 리터럴의 타입은 int 입니다.
		 int보다 더 큰 범위의 수를 표현하기 위해서는 뒤에 L을 붙여서
		 long타입으로 인식시켜야 합니다.
		 */
		
		byte a = 127;    // 1byte = 8bit
		                 // -2^7 ~ 2^7 - 1
		short b = 32767;   // -32768~
		int c = 2147483647; // -2147483648~
//		long d = 21247483648; 자바의 기본 정수타입은 int여서 숫자 밑에 빨간줄이 뜸.
		long d = 21247483648L; // 큰 수는 숫자끝에 L을 붙여줌으로써 'long' 인 것을 알려주어야 함.
		
		
		
		

	}

}
