package basic;

import java.util.Scanner;

public class IfQuiz02 {

	public static void main(String[] args) {
		
		/*
		 - 정수를 2개 입력받아서, 두 정수 중 어느 수가 큰 지
		 혹은 같은지를 판별하시면 됩니다.
		 ex)
		 입력받은 수 : 4, 7 -> 7이 큰 수 입니다.
		 입력받은 수 : 10, 3 -> 10이 큰 수 입니다.
		 입력받은 수 : 4, 5 -> 같은 수 입니다.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("비교할 첫번째 숫자를 입력하세요: ");
		// 아래쪽이랑 순서 계속틀림.
		int number1 = sc.nextInt();
		System.out.print("비교할 두번째 숫자를 입력하세요: ");
		int number2 = sc.nextInt();
		
		if(number1 > number2) {
			System.out.println(number1 + "이 큰 수 입니다.");
		} else if(number1 < number2) { 
			System.out.println(number2 + "이 큰 수 입니다.");
		} else {
			System.out.println("같은 수 입니다.");
		}	
		sc.close();
	}
}
