package basic.loop;

import java.util.Scanner;

public class BreakQuiz02 {
	public static void main(String[] args) {
		
		/*
        # UP&DOWN 게임을 제작합니다.
        1. 기준이 되는 수는 난수 범위 1~100까지로 지정해 주세요.
        2. 사용자에게 정답을 입력받아서, 기준이 되는 수보다
        작은 수를 입력하면 UP, 큰 수를 입력하면 DOWN이라고 출력해서
        정답에 근접할 수 있도록 유도해 주세요.
        3. 승리 조건 횟수는 7회로 제한하겠습니다.
        7회가 넘어가도 정답은 계속 맞출 수 있도록 작성해 주세요.
        정답을 맞췄다면, 반복문 종료와 함께 승리/패배 여부를 알려 주세요.
        */
		
		int num = (int) ((Math.random()*100)+1);
		System.out.println("1부터 100까지의 정수 중 어느 숫자가 선택되었을까요?");
		
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("> ");
			int input = sc.nextInt();
			count++;
			
			if(input < 1 || input > 100) {   // 하나만 참이어도 참
				System.out.println("범위 내 숫자를 입력하세요!");
				continue;   // 범위 넘어가면 continue로 아래코드 실행하지 않음.
			}
			
			if(num > input) {
				System.out.println("UP!!");
			} else if(num < input) {
				System.out.println("DOWN!!");
			} else {
				System.out.println("정답입니다.");
				break;
			}
			// 여까지는 작성
			if(count < 7 ) {
				System.out.println("정답기회" + (7-count) + "번 남음!");
			} else {
				System.out.println("정답 기회 모두 소진!");
				System.out.println("마저 정답을 맞춰주세요~");
			}
		}
		System.out.println(count + "번 만에 맞추셨네요~");
		if(count <= 7) {
			System.out.println("승리했습니다!");
		} else {
			System.out.println("패배했습니다.");
		}
		
		sc.close();
	}
}
