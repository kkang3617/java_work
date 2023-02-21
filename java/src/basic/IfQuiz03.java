package basic;

import java.util.Scanner;

public class IfQuiz03 {

	public static void main(String[] args) {
		
		/*
		 # 스캐너를 사용하여 정수를 하나 입력받으세요
		 
		 - 입력받은 값이 7의 배수라면 "7의 배수입니다." 를 출력.
		 - 입력받은 값이 7의 배수가 아니라면 "7의 배수가 아닙니다." 를 출력.
		 - 입력받은 값이 0이라면 "0입니다." 를 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();
		
		// 처음에 순서를 7의 배수입니다를 먼저했음. 잘 되지 않아 0입니다를 먼저.
		// 0 나누기 7 의 나머지도 0 임. 생각해서 해야함.
		if(num == 0 ) {                     //   /(몫), %(나머지)
			System.out.println("0입니다.");
		} else if (num % 7 == 0 ) {         //
			System.out.println(num + "은 7의 배수입니다.");
		} else {
			System.out.println(num + "은 7의 배수가 아닙니다.");
		}		
			sc.close();
	}
}
