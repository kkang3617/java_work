package basic.begin;

public class identifier {

	public static void main(String[] args) {

		//꼭 지켜야 할 규칙 (안 지킬 시 에러가 발생할 수 있습니다.)
		//1. 식별자의 이름은 중복을 허용하지 않습니다.
		//그리고, 대/소문자를 철저하게 구분합니다.
		
		int age = 35;
//		int age = 40; (X) 중복선언불가
		int Age = 40; 
		System.out.println(age);
		System.out.println(Age);
		
		//2. 식별자 이름은 숫자로 지정하거나 숫자로 시작하면 안됩니다.
//		int 700 = 365; (X) 
//		int 7number = 7; (X)
		int number7 = 7; 
		int num7ber = 7;
		
		//3. 식별자 이름에 공백을 포함할 수 없습니다.
//		int my birth day = 19921013; (X) 
		int mybirthday = 19921013; 
		int myBirthDay = 19921013; //camel case, 단어끼리 연결할 때는 첫글자 대문자.
		
		//4. 식별자 이름에 쓸 수 있는 특수문자는 밑줄(_), 달러기호($)
		//뿐입니다. 하지만 사용을 권장하지는 않습니다.
		//저 특수문자들은 사용하기로 약속한 곳이 지정되어 있습니다.
		String $hello_ = "안녕";
		
		//5. 키워드(예약어)는 식별자 이름으로 사용이 불가능합니다.
		//키워드는 이미 어떠한 기능을 내포하고 있는 지정 문자입니다.
//		string class = "클래스"; (X)
		String Class = "클래스"; // 가능은 하지만 권장하지는 않습니다.
		String className = "클래스"; // 정 쓰고 싶다, 단어를 추가하여 class와 구분
		
		//6. 한글이나 한자 같은 식별자 이름도 지정이 가능합니다.
		//하지만 사용을 권장하지는 않습니다.
		int 숫자 = 10;
		String 名 = "홍길동";
		System.out.println(숫자);
		System.out.println(名);
		
		
		
		
	}

}
