package oop.this_super;

public class Player {

	String name;
	int level;
	int atk;
	int hp;
	
	/*
	 # this
	 
	 - this란? 자기 자신 객체를 가리키는 키워드이다.
	 - 생성자 또는 메서등 내에서 this를 사용하면 this는
	   그 생성자 또는 메서드를 호출한 객체의 주소값을 띄게 된다.
	 - this()를 사용해서 같은 클래스 내의 다른 생성자를 호출할 수도 있다.
	   이 때는 매개변수의 선언에 따라 괄호 내에 적절한 값을 전달하면 된다.
	 */
	
	Player() {
		System.out.println("Player의 기본 생성자 호출!");
//		System.out.println("this의 주소값: " + this);
		level = 1;
		atk = 3;
		hp = 50;
	}
	
	Player(String name) {
		this(); // 같은 클래스의 다른 생성자를 부르는 문법. (1번한테)
		System.out.println("Player의 2번 생성자 호출");
//		System.out.println("this의 주소값: " + this);
//		level = 1;
//		atk = 3;
//		hp = 50;
//		name = name;  // 멤버변수가 아닌 지역변수로 인식을 하고 있다.
		this.name = name; 
	}
	
	Player(String name, int hp) {
		this(name); // 다른생성자한테 넘김(2번한테)
		// 다른 생성자의 호출은 생성자 내에서 최상단에 위치해야 한다.
		System.out.println("Player의 3번 생성자 호출");
		this.name = name;
		this.hp = hp;
		
	}
	
	void attack(Player target) {
		
//		System.out.println("target: " + target);
//		System.out.println("this: " + this);
		
		if(this == target) {
			System.out.println("스스로는 때릴 수 없습니다.");
			return;
		}
		
		//출력메세지: x가 y를 공격합니다.
		System.out.printf("%s(이)가 %s를 공격합니다.\n", this.name, target.name);
		
		//상대방의 체력을 10 낮추고 나의 체력을 5 회복하고 싶어.
		target.hp -= 10;  //target.hp = target.hp - 10;
		this.hp += 5;
		System.out.printf("나의 체력: %d, 상대방 체력: %d\n", this.hp, target.hp);
		
	}
	
	
	
	void characterInfo() {
		System.out.println("*****캐릭터 정보*****");
		System.out.println("# 아이디: " + name);
		System.out.println("# 레벨: " + level);
		System.out.println("# 공격력: " + atk);
		System.out.println("# 체력: " + hp);
//		System.out.println("지금 이 메서드를 호출한 객체의 이름: " + this.name);
	}
	
	
}
