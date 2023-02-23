package basic.loop;

import java.util.Scanner;

public class WhileQuiz03 {

	public static void main(String[] args) {
		/*
        1. 정수를 두개 입력받으세요. (x, y)
        2. x부터 y까지의 누적합계를 while을 사용하여 구하는 코드를 작성하세요.
        ex) 입력: 3, 7 -> "3부터 7까지의 누적합계: 25"

        처음에는 x에 무조건 작은 값이 들어올 것이라고 예상하고 작성하겠습니다.
        다 하신 분은 만약 x에 큰 값이 들어왔을 경우에는
        어떻게 대처할 지 생각해 보세요.
        (x에 큰 값이 들어와도 정상적으로 출력이 되었으면 좋겠습니다.
        입력: 7, 3 -> "3부터 7까지의 누적합계: 25")
        - while문을 if else 로 나눠서 두번 쓰는 것은 지양하겠습니다.
        */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력하시오: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력하시오: ");
		int num2 = sc.nextInt();
		
		if(num1 > num2) {  // 7 3
			int temp = num1;  // temp를 선언한이유?
			num1 = num2; // num1 -> num2
			num2 = temp; // num1이 num2로 변경된 상태, temp말고
			             // num1을 넣으면 num2=num2가 되서 temp로 넣어야함.
		}
		
		int n = num1;  // 얘는 밑에 출력할때 n으로 하면 n++된 최종값을 출력해서.. 선언해준거
		int total = 0;  
		
		while(n <= num2) {  //3~7 까지의 합	    
			total += n;     // total = total + n
			n++;
		}
		System.out.printf("%d부터 %d까지의 누적합계: %d", num1, num2, total);
		sc.close();
	}
	
}
