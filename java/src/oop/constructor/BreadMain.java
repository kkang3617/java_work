package oop.constructor;

public class BreadMain {
	
	
	public static void main(String[] args) {

		/*
		 - 객체를 생성하지 않았을 때의 예시를 보고
		   빵 객체를 생성할 수 있는 클래스(설계도)를 작성해보세요
		   클래스 이름은 Bread로 통일.
		   
		 - BreadMain에서 똑같이 피자빵, 초코케이크의 정보를
		   호출해 보세요 (생성자는 마음대로~)
		 */
		Bread basic = new Bread();
		basic.breadSpec();
		
		Bread pizza = new Bread();
		pizza.price = 3000;
		pizza.name = "피자빵";
		pizza.ingredient = "치즈";
		pizza.breadSpec();
		
		Bread cake = new Bread(5000, "초코케이크", "초콜릿");
		cake.breadSpec();
		

	}

}
