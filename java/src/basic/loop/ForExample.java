package basic.loop;

import java.util.Scanner;

public class ForExample {

	public static void main(String[] args) {
		/*
		int i = 1;
		int total = 0;
		while(i <= 10) {
			total += i;
			i++;
		}
		*/
		int total = 0;
		
		for(int i=1; i<=10; i++) {
			total += i;
		}
		
		//1~200까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수를 
		//가로로 출력해 보세요 (for)
		// int i를 또 써도 된다. for문은 괄호(블록) 안에서만 유효
		for(int i=1; i<=200; i++) {    
			if(i % 6 == 0 && i % 12 != 0 ) {
				System.out.print(i +" ");
			}
		}
		
		//1~60000까지의 정수 중 177의 배수의 개수를 구해보세요. (for)
		int count = 0;
		for(int i=1; i<=60000; i++) {
			if(i % 177 == 0) {
				count++;
			}
		}
		System.out.println("\n177의 배수의 개수: " + count);
		
		//입력받은 정수까지의 팩토리얼 값을 구하세요.
		// 팩토리얼) 5! -> 5x4x3x2x1
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();
		int result = 1;
		
		for(int i=1; i<=num; i++) {
			result *= i;   // result = result*i  ->1x2x---x5
	  //for(int i=num; i>=1; i--) {
	  //	result *= i;                         ->5x4x---x1
	  //}
		}
		System.out.println("5!=" + result);
		
		
		
	}
}
