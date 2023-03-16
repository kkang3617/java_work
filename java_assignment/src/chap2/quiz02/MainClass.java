package chap2.quiz02;

public class MainClass {

	public static void main(String[] args) {
		Car car = new Car("Hcar");

		car.setSpeed(30);
		System.out.println();
		car.engineStart();
		System.out.println();
		car.setMode('D');
		System.out.println();
		car.setSpeed(100);
		System.out.println();
		car.engineStop();
		System.out.println();
		car.setSpeed(0);
		System.out.println();
		car.setMode('P');
		System.out.println();
		car.engineStop();
	}

}
