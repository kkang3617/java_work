package basic.if_;

import java.util.Scanner;

public class IfQuiz05 {

	public static void main(String[] args) {
		/*
		 # 국어, 영어, 수학 점수를 각각 입력받아서
		  평균을 구해 보세요. (평균은 소수점 첫째 자리까지 출력)
		  평균이 90점이 넘는다면, 다시 한 번 조건을 검사해서
		  95 ~ 100 -> A+
		  94 ~ 90 -> A0
		  80점대는 B, 70점대는 C, 60점대는 D, 나머지는
		  모두 F 처리하시면 됩니다. (100점이 만점)
		  ex)
		  평균 점수 : 95.5
		  당신의 학점은 A+ 입니다.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수를 입력하세요: ");
		int korean = sc.nextInt();
		System.out.print("영어 점수를 입력하세요: ");
		int english = sc.nextInt();
		System.out.print("수학 점수를 입력하세요: ");
		int math = sc.nextInt();
                                                    // int / int는 실수를 나타내지x
		double aver = (korean + english + math)/3.0 ; // 좌항 더블, 우항 int 
		System.out.printf("국영수 평균: %.1f점\n", aver ); // 3에 .0을 붙여 실수로 만듦.

		if(aver >= 90) {                              // 작성순 1, 큰틀먼저
			if(aver >= 95) {
				System.out.println("당신의 학점은 A+ 입니다.");  //  2
			} else {
				System.out.println("당신의 학점은 A0 입니다.");  //  3
			}	
		} else if(aver >= 80) {                       // 작성순 1
			System.out.println("당신의 학점은 B 입니다.");
		} else if(aver >= 70) {                       // 작성순 1
			System.out.println("당신의 학점은 C 입니다.");
		} else if(aver >= 60) {                       // 작성순 1
			System.out.println("당신의 학점은 D 입니다.");
		} else {                                      // 작성순 1
			System.out.println("당신의 학점은 F 입니다.");
		}   

		sc.close();
	}	


}
