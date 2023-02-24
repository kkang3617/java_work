package basic.loop;

public class BreakExample1 {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			
			if(i > 7) {   // 속해있는 문장이 한줄이면 if의 괄호 생략해도 됨.
				break;
			}
			
			
			System.out.print(i + " ");
		}
		System.out.println("\n반복문 종료!");
		
		
		System.out.println("---------------------");
		
		/*
		 - 내부 반목문에 포함된 break로 바깥쪽 반복문까지 한번에
		  종료시키고 싶다면 바깥쪽 반복문에 label을 붙입니다.
		  그리고, break 선언 시 label을 함께 선언합니다.
		 */
		
		for(int i=0; i<=2; i++) {
			for(int j=0; j<=1; j++) {
				if(i == j) {
					break;  // * 0-1 은 0부터 깨져서 출력x
				}
				System.out.println(i + "-" + j);
			}
		}
		
		outer: for(int i=0; i<=2; i++) {
			for(int j=0; j<=1; j++) {
				if(i == j) {
					break outer;  // * 0-1 은 0부터 깨져서 출력x
				}
				System.out.println(i + "-" + j);
			}
		}
		
		
		
		
		
		
	}
	
}
