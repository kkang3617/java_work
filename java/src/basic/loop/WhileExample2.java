package basic.loop;

public class WhileExample2 {

	public static void main(String[] args) {
		// 48 ~ 150사이의 정수 중 8의 배수만 가로로 출력해 보세요.
		// (48부터 숫자를 하나씩 올려가면서 8의 배수 판별을 반복하면 되겠죠?)

		// 항상 begin - end - step 순으로 작성하고 나머지부분 작성.
		int n = 48;   //begin

		while(n <= 150) {   //end
			if(n % 8 == 0) {
				System.out.print(n+" ");
			} 
			n++; // step
		}
		System.out.println(); // 단순 줄 개행

		//1 ~ 100까지의 정수 중 4의 배수이면서
		//8의 배수는 아닌 수를 가로로 출력해 보세요.

		int i = 1;

		while(i <= 100) {
			if(i % 4 == 0 && i % 8 != 0) {
				System.out.print(i+" ");
			}
			i++;
		}
		System.out.println(); // 단순 줄 개행
		
		//1~30000까지의 정수 중 258의 배수의 개수를 출력.
		
		int j = 1;
		int cnt = 0;        // 약수의 개수를 기억해줄 변수.

		while(j <= 30000) {
			if(j % 258 == 0) {
				cnt++;				
			}
			j++;
		}
		System.out.println("258의 배수의 개수: " + cnt + "개");
		
		//1000의 약수의 개수를 구하세요.
		//1부터 1000까지 하나씩 올라가면서 1000이랑 나눠보세요.
		//그랬을 때 나누어 떨어지는 애가 약수입니다.
		
		int k = 1;
		int count = 0;        // 약수의 개수를 기억해줄 변수.
		
		while(k <= 1000) {
			if(1000 % k == 0 ) {
				count++;
			}
			k++;
		}
		System.out.println("1000의 약수의 개수: " + count + "개");
		
	}		
	

}

