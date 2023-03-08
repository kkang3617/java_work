package oop.abs.quiz;

public class Circle extends Shape {

	int length;
	
	public Circle(String name, int length) {
		super(name);
		this.length = length;
	}

	@Override
	public double getArea() {
		return length * length * Math.PI;
	}


	
}
