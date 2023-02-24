package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModify {

	public static void main(String[] args) {
		
		String[] foods = {"삼겹살","족발","피자","햄버거"};
		System.out.println(Arrays.toString(foods));
		
		foods[0] = "치킨";
		foods[2] = "탕수육";
				System.out.println(Arrays.toString(foods));

		//배열의 인덱스 탐색
		System.out.println("------------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("탐색할 음식을 입력하세요: ");
		String name = sc.next();
				
		//boolean flag = false;
		for(int i=0; i<foods.length; i++) {  // 0 1 2 3
			if(name.equals(foods[i])) {   // 입력값이랑 food[i] 랑 같냐
				System.out.println("탐색완료!");   //여기는 참
				System.out.println("인덱스: " + i + "번");
				break;  // 3일때 여기서도 못찾으니까 아래로 넘어가면서 아래 출력
			} else if(i == foods.length-1){
				System.out.println("해당 음식이 없습니다.");
				
			}
		}
	
		sc.close();
		
		/*
		 *  boolean을 활용한 풀이
		boolean flag = false;
		int i;
		for(i=0; i<foods.length; i++) {
			if(name.equals(foods[i])) {
				System.out.println("탐색 완료!");
				System.out.println("인덱스: " + i + "번");
				flag = true;
				break;
			} 
		}
		
		if(!flag) {
			System.out.println("없는 음식입니다.");
		}
		
		sc.close();
		*/
	}

}
