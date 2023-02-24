package basic.loop;

import java.util.Scanner;

public class BreakQuiz01 {

	public static void main(String[] args) {
		
		/*
		 1. 2가지의 정수를 1~100사이의 난수를 발생시켜서
		   지속적으로 문제를 출제한 후 정답을 입력받으세요.
		   사용자가 0을 입력하면 반복문을 탈출시키세요.
		   
		 2. 종료 이후에 정답 횟수와 오답 횟수를 각각 출력하세요.
		 */
		Scanner sc = new Scanner(System.in);
		int cCount = 0;   //맞은개수
		int iCount = 0;   //틀린개수
		
		System.out.println("*** 연산 퀴즈 ***");
		System.out.println("# 종료하시려면 0을 입력해 주세요.");
		
		while(true) {
			
			int rn1 = (int) ((Math.random()*100) + 1); // 밖에 선언하면 똑같은문제반
			int rn2 = (int) ((Math.random()*100) + 1); // 1~100
			int num = (int) (Math.random()*2); //0이상 2미만 0,1
			
			int correct;
			if(num == 0) {   // 0이라면 0+0=??? 출력
				System.out.printf("%d + %d = ???\n", rn1, rn2);
				correct = rn1 + rn2;  //정답을 입력하면 correct에 저장
			} else {         // 1이라면 0-0=??? 출력
				System.out.printf("%d - %d = ???\n", rn1, rn2);
				correct = rn1 - rn2;  //정답을 입력하면 correct에 저장
			}
			
			System.out.print("> ");
			int answer = sc.nextInt();
			
			if(answer == correct) {    //정답이라면~
				System.out.println("정답입니다!");
				cCount++;
			} else if(answer == 0) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("틀렸습니다~");
				iCount++;
			}
			
		}
		
		System.out.println("------------------------");
		System.out.println("정답 횟수: " + cCount + "회");
		System.out.println("오답 횟수: " + iCount + "회");
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
	}

}
