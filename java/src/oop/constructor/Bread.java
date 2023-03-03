package oop.constructor;

public class Bread {

	int price;
	String name;
	String ingredient;
	
	Bread() {   //기본생성자는 하나 있으면 오류방지가능.
		price = 1000;
		name = "모닝롤";
		ingredient = "밀가루";
	}
	
	Bread(int p, String n, String i) {
		price = p;
		name = n;
		ingredient = i;
	}
	
	void breadSpec() {
		System.out.println("**** 빵 정보 ****");
		System.out.println("빵 가격: " + price);
		System.out.println("빵 이름: " + name);
		System.out.println("주 재료: " + ingredient);
	}
	
	
}
