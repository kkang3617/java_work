package basic.loop;

public class ForQuiz01 {

	public static void main(String[] args) {
		
		//2~19까지의 난수를 생성하셔서 구구단을 출력해보세요. (for)
		//19행까지 출력하세요.
		
		int rn = (int) ((Math.random()*18) + 2);  //난수
		
		System.out.println("*** 구구단 " + rn + "단 ***");
		
		for(int i=1; i<=19 ;i++) {
			System.out.printf("%d x %d = %d\n", rn, i, (rn*i));
		}
		
		
		
		
	}
	
}
