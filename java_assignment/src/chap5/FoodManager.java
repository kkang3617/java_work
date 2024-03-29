package chap5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FoodManager {

	public static void main(String[] args) {
		
		Map<String, Integer> foods = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** 음식점 메뉴판 관리 프로그램 ***");
		
		while(true) {
			
			System.out.println("# 1. 메뉴 등록");
			System.out.println("# 2. 메뉴 전체보기");
			System.out.println("# 3. 프로그램 종료");
			System.out.print("> ");
			int menu = sc.nextInt();
			
			System.out.println("--------------------------------");
			
			if(menu == 1) {
				/*
				 - 메뉴명과 가격을 입력받아서 Map에 삽입하시면 됩니다.
				  이미 존재하는 메뉴명이 들어왔다면 '이미 존재하는 메뉴입니다.'
				  를 출력하시고 메인 메뉴로 돌아와 주세요.
				 - 메뉴 등록 완료 후 'XXX 메뉴가 등록되었습니다.' 를 출력하세요.
				 */
				System.out.print("메뉴명: ");
				String name = sc.next();
				if(foods.containsKey(name)) {	
					System.out.println("이미 존재하는 메뉴입니다.");
				} else {
					System.out.print("가격: ");
					int price = sc.nextInt();
					foods.put(name, price); //Map에 데이터를 추가하는 메서드: put(key, value)
					System.out.printf("%s 메뉴가 등록되었습니다.\n", name);
				}
				
				
				
			} else if(menu == 2) {
				/*
				 - 만약 메뉴가 하나도 등록되어 있지 않다면
				  '메뉴부터 먼저 등록해 주세요!' 출력 후 메인 메뉴로 이동시켜
				  주세요. 
				 
				 - Map의 모든 요소를 반복문을 이용하여 출력해 주세요.
				 ex)
				    메뉴명 : 가격
				    메뉴명 : 가격
				    메뉴명 : 가격....
				  
				  메뉴를 모두 출력 후에 선택지를 제공하세요.
				  (1. 수정 | 2. 삭제 | 3. 취소)
				  - 수정: 수정할 메뉴명을 입력받아서 가격 수정을 진행하세요.
				   없는 메뉴명이라면 없다고 메세지를 출력하시고 메인 메뉴로 이동.
				   
				  - 삭제: 삭제할 메뉴명을 입력받아서 해당 메뉴를 삭제해 주세요.
				   없는 메뉴명이라면 없다고 메세지를 출력하시고 메인 메뉴로 이동.
				   
				  - 취소: 메인 메뉴로 이동
				 */
				if(foods.isEmpty()) { // 비었다면~
					System.out.println("메뉴부터 먼저 등록해 주세요!");
				} else {
					System.out.println("=========메뉴=========");
					for(String m : foods.keySet()) { //Map에서 key들만 추출하는 메서드: keySet()
						System.out.println(m + " : " + foods.get(m)); //Map 내부의 값을 참조하는 법: get(key)
					}
					System.out.println("1. 수정 | 2. 삭제 | 3. 취소");
					System.out.println("> ");
					int select = sc.nextInt();
					
					switch(select) {
					case 1: 
						System.out.print("수정할 메뉴 입력: ");
						String mMenu = sc.next();
						if(foods.containsKey(mMenu)) {
							System.out.print("수정 가격: ");
							int newPrice = sc.nextInt();
							foods.put(mMenu, newPrice); //Map에 데이터를 추가하는 메서드: put(key, value)
							System.out.printf("수정 메뉴: %s, 수정 가격: %d\n",
									   					mMenu, newPrice);
						} else {
							System.out.println("존재하지 않는 메뉴입니다.");
						}
						break;
					
					case 2:
						System.out.print("삭제할 메뉴 입력: ");
						String del = sc.next();
						if(foods.containsKey(del)) {
							foods.remove(del);
							System.out.printf("%s 음식이 삭제되었습니다.\n", del);
						} else {
							System.out.println("존재하지 않는 음식입니다.");
						}
						break;
						
					case 3:
						System.out.println("메인 메뉴로 이동합니다.");
						break;
						
					default:
						System.out.println("메뉴를 잘못 입력했습니다.");
						System.out.println("메인 메뉴로 이동합니다.");
						
						
					}
					
				}
				
				
					
			} else if(menu == 3) {
				 /*
				  - Y / N를 입력받아서 Y가 입력되면 프로그램 종료.
				   그 이외의 값은 종료 취소를 진행해 주세요.
				 */
				System.out.print("프로그램을 종료하시겠습니까[Y/N]: ");
				String quit = sc.next();
				if(quit.toUpperCase().equals("Y")) {
					System.out.println("종료합니다.");
					sc.close();
					System.exit(0);
				} else {
					System.out.println("종료를 취소합니다.");
				}
				
				
				
			} else {
				System.out.println("메뉴를 잘못 입력하셨습니다.");
			}
			
			
			
		}
		
		

	}

}
