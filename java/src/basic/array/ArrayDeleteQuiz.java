package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] kakao = {"무지","네오","어피치","라이언","춘식이"};
		System.out.println("현재 저장된 친구들: " + Arrays.toString(kakao));
		System.out.println("삭제를 원하는 친구를 입력하세요: ");
		String name = sc.next();
		
		/*
		 1. 삭제할 친구를 입력받아서 삭제를 진행해 주세요.
		 
		 2. 입력받은 이름이 없다면 없다고 얘기해 주세요.
		 */
		
		boolean flag = false; // boolean의 기본값 false
		for(int i=0; i<kakao.length; i++) {
			if(name.equals(kakao[i])) {
					flag = true;   // 찾았으면 flag를 true로 바꿈
					for(int j=i ; j<kakao.length-1; j++) {
						kakao[j] = kakao[j + 1];
					}
					break;
			} 
			
		}
		
		if(!flag) {   // flag == false?
			System.out.println(name + "(은)는 없는 이름입니다.");
		} else {   // 없는 이름이 아니고 입력한 이름이라면~
			String[] temp = new String[kakao.length-1];  // temp의 선언, 크기가 하나 작은
			for(int k=0; k<temp.length; k++) {           //배열을 만들어서 정렬해주기 위함.
				temp[k] = kakao[k];
			}
			kakao = temp;
			temp = null;
					
			System.out.println("삭제 후 정보: " + Arrays.toString(kakao));
		}
		
		sc.close();
		
		
		
		
		
		
	}
	
}
 