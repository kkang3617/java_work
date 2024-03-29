package chap3;

public class MainClass {

	public static void main(String[] args) {
		
		

		
		
		/*********** 문제 **********

		패키지명: chap03

		클래스명: Product, Computer, Radio, Tv, MyCart, MainClass

		** 클래스가 제공됩니다. 복사하셔서 그대로 붙여 넣어주시면 됩니다.


		문제: 

			상품을 뜻하는 Product 클래스가 존재하고 
			여러가지 상품들 클래스가 Product를 상속받고 있습니다.
			Product와 Computer, Radio, Tv 클래스는 변경하실 필요 없습니다.
			작성해야 할 클래스는 MyCart와 MainClass 입니다.
			
			MyCart 클래스에 주석으로 작성된 요구사항을 준수하여
			메서드를 선언하시고, MainClass에서 객체를 생성한 후에
			메서드를 호출해 보세요.
			
		요구사항:

			Class MyCart 
			-> 주석으로 요구사항들이 작성되어 있습니다.
			
			-----------------------------------
			
			Class MainClass
			-> MyCart 클래스를 완성시킨 후에
			MyCart 객체를 생성합니다. 
			초기 금액은 2100원으로 지정합니다. 
			
			MyCart 객체의 buy 메서드를 호출하여 
			tv, radio, computer 객체들을 전달해 보세요.
			모든 물건들이 제대로 담기는 지 확인 후 
			카트 내부 정보를 출력하면 됩니다. 
			
			그 후에, MyCart의 소지금을 적게 설정하여
			금액이 부족할 시 물건이 담기지 않는지도 확인해 보세요.*/
		
		MyCart cart = new MyCart(2100);
		
		Tv tv = new Tv();
		Radio radio = new Radio();
		Computer computer = new Computer();
		
		cart.buy(tv);
		cart.buy(radio);
		cart.buy(computer);
		
		
	}

}
