package basic.begin;

import java.util.Scanner;

public class ScannerQuiz {
	
	public static void main(String[] args) {
		
		/* !문제!
		 * 이름 : xxx
		   나이 : xx세
		   출생년도 : xxxx년
		   을 출력하세요. 
		   ( 출력함수는 마음대로 사용해서 출력, 출생년도는
		   입력사항이 아니다)
		*/
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름입력: ");
		String name = sc.next();
		
		System.out.print("나이입력: ");
		int age = sc.nextInt();
		
		System.out.println("이름: " + name);
		System.out.println("나이: " + age + "세");
		System.out.printf("출생년도: %d년", 2023 - age + 1);
		sc.close();
		
		/*강사님 
		Scanner sc = new Scanner(System.in);
		s
		System.out.print("이름입력: ");
		String name = sc.next();
		
		System.out.print("나이입력: ");
		int age = sc.nextInt();
		
		int birth = 2023 - age;
		System.out.println("이름: " + name);
		System.out.println("나이: " + age + "세");
		System.out.println("출생년도: " + (birth+1) + "년");
		//System.out.println("이름 : %s\n나이: %d세\n출생년도: %d년\n", name, age, 2023-age+1 );
		sc.close();
		*/
	}
}
