package basic;

public class LogicalOperator {
	
	public static void main(String[] args) {
		
		//비교(관계) 연산자 (<, <=, >, >=, ==(같냐?), != (같지않냐?))
		//좌항과 우항의 크기를 비교하여, 결과값으로
		//항상 논리형 타입의 값을 도출합니다.
		
		int x = 10, y = 20;
		System.out.println(x == y);   // 같냐? false
		System.out.println(x != y);   // 같지않냐? true
		
		/*
		 # 논리 연산자 (&, &&, |, ||)
		 - 좌항과 우항의 논리값을 연산하여 하나의 논리값을 도출합니다.
		 1. &, &&: 양쪽 항의 논리값이 모두 true일 경우에만 true가 도출됩니다.
		 2. |, ||: 양쪽 항의 논리값 중 한 쪽만 true여도 true를 도출합니다.
		 
		 &&, || -> 단축 평가 연산 (short circuit operation)
		 - 좌항의 연산 결과가 덪체 연산 결과에 영향을 미칠 경우
		 우항의 연산을 진행하지 않습니다.
		 */
		
		System.out.println(x > 10 && y != 10); //좌:false 우:true
		System.out.println(x > 10 || y < 30);	
		System.out.println(x > 10 & y != 10); // 하나 썼을 때는 좌, 우항 둘다 확인
		System.out.println(x > 10 | y < 30);  // 그래서 연산속도가 느림
//		System.out.println(X > 10 && (y / 0 == 10)); // 연산오류
		
		//논리 반전 연산자 (!: 단항)
		//단순히 논리값을 반전시킬 때 사용합니다.
		//true -> false, false -> true
		
		int z = 10;
		System.out.println(!(z == 10));
		
		
	}
}
