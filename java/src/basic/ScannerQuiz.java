package basic;

import java.util.Scanner;

public class ScannerQuiz {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름입력: ");
		String name = sc.next();
		System.out.print("나이입력: ");
		int age = sc.nextInt();
		System.out.println("이름: " + name);
		System.out.println("나이: " + age + "세");
		System.out.printf("출생년도: %d년", 2023 - age + 1);
		sc.close();
		
		
	}
}
