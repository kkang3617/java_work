package oop.this_super;

public class Warrior extends Player {
	
	int rage;

	Warrior(String name) {
		//모든 생성자에는 super()가 내장되어 있다.
		//자식 객체가 생성될 때는 부모의 객체도 생성이 되어야
		//부모의 속성과 기능이 실존하게 되고, 물려줄 수가 있기 때문.
		super(name); // 부모의 기본,2번 생성자에서 이름을 받겠다. 
		             //this.name = name;
		this.rage = 60;
	}
	
	@Override   
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 분노: " + rage);
	}	
	
	
}
