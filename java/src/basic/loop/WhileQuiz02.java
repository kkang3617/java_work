package basic.loop;

import java.util.Scanner;

public class WhileQuiz02 {

	public static void main(String[] args) {
		
		//입력받은 수의 약수의 총합을 구하세요.
		//입력받은 값: 12 -> 1 2 3 4 6 12 -> 28
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int num = sc.nextInt();
		
		int a = 1;                //begin 
		int total = 0;            //누적합을 담아줄 변수
		
		while(num >= a) {         //num의 최대 약수는 a
			if(num % a == 0) {    //num나누기a의 나머지=0, 약수
				total += a;       //누적해서 더해라 t = t + a
			}
			a++;                  //a하나씩 올려주기
		}
		System.out.println(num +"의 약수의 총합: "+ total);
		sc.close();
	}
	
}
