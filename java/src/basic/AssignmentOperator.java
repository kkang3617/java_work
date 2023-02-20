package basic;

public class AssignmentOperator {

	public static void main(String[] args) {

		/*
		 # 대입 연산자 (=)
		 # 복합 대입 연산자 (+=, -=, *=, /= (몫), %= (나머지))
		 - 변수에 값을 대입할 때 사용하는 연산자 입니다.
		 - 복합 대입 연산자는 대입 연산자에 산술 연산자가 결합되어 있는 형태입니다.
		 */
		
		int a = 5;
		int b = 5;
		
//		b =+ 3   -> b = +3; 과 같은 의미, 이렇게 쓰면 안됨!!
		
		a += 3;  //  a = a + 3 기존 a에 3을 더한 값을 저장해라.
		System.out.println(a);
		
		System.out.println("-----------------------------------");
		
		a -= 4; // 4   처음엔 틀림, 이유? a값에 8이 이미 저장되어있었음.
		System.out.println(a);
		a *= 6; // 24
		System.out.println(a);
		a /= 5; // 4
		System.out.println(a);
		a %= 3; // 1
		System.out.println(a);
		
		
	}

}
