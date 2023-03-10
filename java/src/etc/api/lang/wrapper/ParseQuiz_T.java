package etc.api.lang.wrapper;

import java.util.Scanner;

public class ParseQuiz_T {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String ssn;
		char c;

		while(true) {

			System.out.println("주민등록번호를 입력하세요: ");
			ssn = sc.next();

			if(ssn.indexOf("-") == -1) {
				System.out.println("주민등록번호는 하이픈을 포함시켜 주세요.");
				continue;
			}
			c = ssn.charAt(7);
			if(!(c=='1'|c=='2'|c=='3'|c=='4')) {
				System.out.println("뒷자리 첫번째 숫자는 1, 2, 3, 4 중 하나여야 합니다.");
				continue;
			}
			
			
			try {
				String test = ssn.substring(0,6);
				String test2 = ssn.substring(7);
				Integer.parseInt(test);
				Integer.parseInt(test2);
				break;
			} catch (NumberFormatException e) {
				System.out.println("숫자를 정확하게 입력하셔야 합니다.");
			}
			
			
		}
		
		
		
		
		
		
		
	}

}
