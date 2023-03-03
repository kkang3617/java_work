package oop.string;

import java.util.Scanner;

public class StringQuiz02 {

	public static void main(String[] args) {

		/*
		 1. 주민등록번호 13자리를 입력받습니다.
		 2. 주민등록번호는 -을 포함해서 받을 예정.
		 3. 13자리가 아니라면 다시 입력.
		 4. 남자인지 여자인지를 구분해서 출력.
		 */
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("주민등록번호 13자리를 -포함 입력하세요");
			String id = sc.next();
			id = id.replace("-", "");
			
			if(id.length() != 13) {
				System.out.println("주민등록번호 13자리를 재입력하세요.");
			} else {
				if(id.charAt(6)=='1' || id.charAt(6)=='3') { // 7이 아닌 6, 0부터시작
					//char은 equals사용(x) 및 '' 사용해야함 String은 equals 사용
					System.out.println("남자입니다.");        
					break;
				} else if(id.charAt(6)=='3' || id.charAt(6)=='4') {
					System.out.println("여자입니다.");
					break;
				} else {
					System.out.println("7번째자리를 잘못입력했습니다.");
					
				}
				
				 
			}
			
		}
		sc.close();
		
		
		
		
		
		
		
		
		
		
		

	}

}
