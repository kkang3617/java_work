package oop.abs.quiz;

public class Rect extends Shape {

	private int length;
	
	//Rect 객체를 생성할 때, 이름과 변의 길이를 받도록 처리해 주세요.
	public Rect(String name, int length) {
		super(name);
		this.length = length;
	}

	
	//오버라이딩이 강제되는 메서드에는 각 도형의 넓이를 구하는
    //로직을 알아서 작성해 주세요.
	@Override
	public double getArea() {
		return length * length;
	}

	

}
