/*package etc.api.lang.wrapper;

import java.util.Scanner;

public class ParseQuiz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.print("주민등록번호를 입력하세요: ");
			String num = sc.next();
			
			if(num.charAt(6) != '-') {
				System.out.println("주민등록번호는 하이픈을 포함시켜 주세요.");
			} else if(num.charAt(7) < '1' | num.charAt(7) > '4' ) {
				System.out.println("뒷자리 첫번째 숫자는 1, 2, 3, 4 중 하나여야 합니다.");
			} else if(num.length() != 14) {
				System.out.println("주민등록번호를 정수로 정확히 입력해주세요.");
			} else {
				
			}
			
		}
		/*
		switch(num.charAt(7)) {
			case '1': case '3':
				System.out.pri);
		}
		
		
	}

}*/