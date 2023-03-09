package oop.abs.quiz;

public class Circle extends Shape {

	private int radius;
	
	//Circle 객체를 생성할 때, 반지름도 받아서 초기화 할 수 있는
    //생성자를 선언해 주세요.
	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;
	}

	//오버라이딩이 강제되는 메서드에는 각 도형의 넓이를 구하는
    //로직을 알아서 작성해 주세요.
	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}


	
}
