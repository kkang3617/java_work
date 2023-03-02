package chap1;

import java.util.Scanner;

public class Solution01 {

	public static void main(String[] args) {
		
	/*  문제:
		nums 배열에서 가장 큰 값을 출력하는 코드를 작성합니다. 

		입력: 
			Scanner를 사용해서 입력받은 값을 nums 배열에 삽입합니다.
			배열의 크기는 10이고, 중복 입력값은 없다고 가정합니다.
			배열의 모든 인덱스에 값을 채울 때 까지 입력을 반복합니다.
			
		출력:
			ex) 가장 큰 값: 95
			의 형태로 출력합니다. */
		
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[10];
		
		int j=0;
		System.out.println("숫자를 10개 입력해주세요.");
		for(int i=0; i<nums.length; i++) {
			System.out.printf("%d번째 숫자를 입력하세요.", i+1);
			nums[i] = sc.nextInt();
			
			if(j<=nums[i]) { //nums[i]가 j보다 크다면
				j=nums[i];   //nums[i]를 j에 저장 
			}
			
		}
		System.out.print("입력된 값: ");
		for(int n:nums) {
			System.out.print(n+ " ");
		}
		System.out.println("\n가장 큰 값: "+ j);
		
	}

}
