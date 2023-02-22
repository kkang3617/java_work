package basic.begin;

import java.util.Scanner;

public class CelToFahr {

	public static void main(String[] args) {
		
		/*
		  사용자에게 섭씨온도를 입력받아서
		  화씨온도로 변환하여 출력하는 로직을 작성하세요.
		  변환공식은 구글링.
		  화씨 온도는 소수점 첫째 자리까지 표현.
		  # ㄹ 한자 7 -> (℃), ㄹ한자 다음장4 -> (℉)
		*/
		  
		Scanner sc = new Scanner(System.in);
		System.out.printf("섭씨온도 입력: ");
		
		//int cel = sc.nextint();
		//double fahr = cel * 9/5 + 32;  day2,Casting3참조, 우항 cel이 int 정수형이라 값이다르게나옴.
		//double fahr = cel * 9.0/5 + 32; (o)
		double cel = sc.nextDouble(); //변수선언시는 소문자, class선언시만 대문자
		double fahr = cel * 9/5 + 32;  //단어결합시 첫째 소문자 둘째부터 대문자. camel case

		System.out.println("-------------------------------------------------");
		System.out.printf("입력 섭씨온도: %.1f℃\n", cel);
		System.out.printf("변환 화씨온도: %.1f℉", fahr);
		 // println으로는 소수점 표현을 하지 못하므로 printf사용.
		sc.close();
		  
		  
	}

}
