package basic;

public class CastingExample2 {

	public static void main(String[] args) {

		/*
		 - 크기가 큰 데이터 타입의 값을 작은 데이터 타입으로 변환하려면
		  반드시 형 변환 연산자: (type)를 사용하여 명시적으로
		  형 변환을 진행해 주셔야 합니다. (DownCasting)
		  
		 - 명시적으로 형 변환을 해야하는 이유는, DownCasting의 경우
		  저장 공간이 줄어들어 데이터 손실의 가능성이 항상 존재하기 때문입니다.
		  (overflow, underflow 의 가능성이 존재한다.)
		 */
		
		int i = 72;         // int > char
		char c = (char) i; // int -> char 다운캐스팅
		System.out.println("72의 문자값: " + c);
		
		double d = 4.98765;   // double > int
		int j = (int) d; // 직접 (int)넣어서 다운캐스팅 해도되고
		                 // 빨간줄에 대고 add cast to int 해도됨.
		System.out.println(j);   // int로 변환되면서 소수점 값들은 버림.
		
		int k = 1000;  // int > byte
		byte b = (byte) k;
		System.out.println(b);   // -24가 나온이유, 이진수로 8자리(8비트)까지만 표현하기 때문.
		
		
		
		

	}

}
