package basic;

public class PlusMinusOperator {

	public static void main(String[] args) {

		int q = 1;
		q++; // i = i + 1;
		q++;
		++q;
		q--;
		--q;
		System.out.println(q);
		
		//증감 연산자 (++, --)
		//변수의 값을 단순히 하나 올리거나 내릴 때 사용합니다.
		
		
		int i = 1;
		int j = i++; // 후위 연산 (선연산 후증감) i 가 먼저 대입후 1증가
		int k = i--; // 2가 먼저 대입되고 1감소 결과 1
		
		System.out.println("i의 값: " + i);
		System.out.println("j의 값: " + j);
		System.out.println("k의 값: " + k);
		
		System.out.println("-------------------------------");
		
		int x = 1;
		int y = ++x; // 전위 연산 (선증감 후연산) 1증가 후 대입
		int z = --x; // 1감소 후 대입
		
		System.out.println("x의 값: " + x);
		System.out.println("y의 값: " + y);
		System.out.println("z의 값: " + z);
		
		int a = 3;
		int b = a++ + 5 * 3; // 선연산후 증감 연산먼저하고 a+1이라 4
//		int b = ++a + 5 * 3;  19
		System.out.println(b);
		System.out.println(a);
		
		
	}

}
