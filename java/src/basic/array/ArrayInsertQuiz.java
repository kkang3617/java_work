package basic.array;

import java.util.Scanner;

public class ArrayInsertQuiz {
	public static void main(String[] args) {

		/*
        1. String 배열을 생성하세요. (foods)
        크기는 넉넉하게 50개로 지정하겠습니다.

        2. 사용자에게 음식 이름을 입력받아서 배열에
         삽입해 주세요.
         사용자가 음식 입력창에 '배불러' 라고 작성하면
         입력을 종료해 주세요.

        3. 입력이 종료되면 사용자가 입력한 음식을
        가로로 출력해 주세요. (null은 출력하지 마세요.)

		 추가문제
		- 입력을 받았는데 이미 배열에 존재하는 음식이라면
		'이미 존재하는 음식입니다.' 를 출력하고
		다시 새로운 음식을 입력받을 수 있도록 코드를 제어해 보세요.
		 */

		String[] foods = new String[50];    // String 배열생성
		Scanner sc = new Scanner(System.in);

		System.out.println("먹고싶은 음식을 입력하세요.");
		System.out.println("'배불러'를 입력하시면 종료됩니다.");
		for(int i=0; i<foods.length; i++) {     // 입력횟수
			System.out.print("> ");
			String food = sc.next();            // 입력값저장

			if(food.equals("배불러")) {   //배불러 치면 입력종료
				System.out.println("입력을 종료합니다.");
				break;
			}

			foods[i] = food;    // foods 배열에 food입력값 저장
		}//여기가 for문 닫히는 곳
		System.out.println("----------------------");
		System.out.print("내가 먹고싶은 음식들:");
		for(String food:foods) {   //향상된 for문, 입력된 음식나열.
			if(food == null)break;
			System.out.print(food + " ");
		}


		sc.close();







		}

	}
