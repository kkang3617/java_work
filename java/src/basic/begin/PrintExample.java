package basic.begin;

public class PrintExample {

	public static void main(String[] args) {
		
		//자바의 표준 출력 형식은 크게 3가지입니다.
		//1. 개행을 포함하진 않는 print() / 출력 후 커서가 맨오른쪽끝
		//2. 자동으로 개행을 포함해 주는 println() / 출력 후 커서가 줄바꿈
		
		System.out.print("안녕하세요~!");
		System.out.println("Hello~!");
		System.out.print("안녕히 가세요ㅜㅜ");
		System.out.println("bye bye~~");
		
		//3. 형식 지정 표준 출력 함수 printf()
		//   서식 문자를 이용해서 문자열을 완성시킨 후,
		//   서식 문자에 들어갈 값을 지정해서 출력하는 방식.
		
		/*
		 # 포맷팅 서식 문자 종류
		 %d: 부호가 있는 정수 데이터 (decimal)
		 %f: 실수 데이터 (floation point)
		 %s: 문자열 (String)
		 
		 # 탈출 코드 (escape code) -> printf에만 동작하는 게 아님. print,println가능.
		 - 반드시 따옴표 내에 위치해야 합니다.
		 - 문자열 내에서 특정 명령을 내리고 싶을 때 사용하는 특수기호입니다.
		 \n: 줄 개행 명령
		 \t: 가로 공백 (스페이스 4칸)   tab을 누른것과 동일한 기능
		 */
		
		int month = 12;
		int day = 25;
		String anni = "크리스마스";
		
		//12월 25일은 크리스마스 입니다.
		System.out.println(month + "월 " + day + "일은 " + anni + " 입니다.");
		System.out.printf("%d월 %d일은 %s 입니다.\t", month, day, anni);
		System.out.printf("%d월 %d일은 %s 입니다.\n", month, day, anni);
		
		// 실수를 표현하는 서식문자 %f -> 기본 6자리까지 표현
		// %.[자리수를 지정하는 숫자]f -> 원하는 자리수까지 표현
		// %라는 문자 자체를 표현할 때는 %%를 쓰면된다.
		double rate = 64.126;  // printf도 print처럼 줄 개행 기능이 없다.
		                       // \n 마지막에 쓰면 줄 개행됨.
		System.out.printf("합격률은 %f입니다.\n", rate); 
		System.out.printf("합격률은 %.2f입니다.\n", rate);
//		System.out.printf("합격률은 %.2f%입니다.", rate);  (X),%입을 서식문자로 인식
		System.out.printf("합격률은 %.2f%%입니다.", rate);
		
	}
}
