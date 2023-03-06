package oop.inherit.good;

public class MainClass {

	public static void main(String[] args) {
		
		Warrior w1 = new Warrior();
		w1.level = 1;
		w1.atk = 3;
		w1.hp = 50;
		w1.name = "전사1";
		w1.rage = 60;
		w1.characterInfo();
		
		Mage m1 = new Mage();
		m1.level = 2;
		m1.atk = 1;
		m1.hp = 70;
		m1.name = "마법사1";
		m1.mana = 70;
		m1.characterInfo();
		
		Hunter h1 = new Hunter();
		h1.level = 3;
		h1.atk = 4;
		h1.hp = 40;
		h1.name = "헌터1";
		h1.pet = "냐옹이";
		h1.characterInfo();
		
		
		
		
		
		
		
		
		
		
	}
	
}
