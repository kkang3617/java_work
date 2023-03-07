package oop.this_super;

public class MainClass {

	public static void main(String[] args) {

		Player p1 = new Player();
		p1.name = "전사1";
		System.out.println("p1의 주소값: " + p1);
		p1.characterInfo();
		
		System.out.println("--------------------------");
		
		Player p2 = new Player("전사2");
		System.out.println("p2의 주소값: " + p2);
		p2.characterInfo();
		
		System.out.println("--------------------------");
		
		Player p3 = new Player("전사3", 200);
		p3.characterInfo();
		
		System.out.println("--------------------------");
		
		p3.attack(p2);
	  //this    target
		p1.attack(p2);
		p2.attack(p2);
		
		System.out.println("--------------------------");
		
		Warrior w1 = new Warrior("전사짱짱맨");
		w1.characterInfo();
		
		Mage m1 = new Mage("법사짱짱맨");
		m1.characterInfo();
		
		Hunter h1 = new Hunter("사냥꾼짱짱맨");
		h1.characterInfo();
		
		w1.attack(m1);
		m1.attack(h1);
		
		
		
	}

}
