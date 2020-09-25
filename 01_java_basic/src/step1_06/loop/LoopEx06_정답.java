package step1_06.loop;

import java.util.Scanner;

/*
 * # 반복문 종료(-100)
 * 1. 무한 반복을 하면서 숫자를 입력받는다.
 * 2. 입력한 숫자가 -100이면, 프로그램은 종료된다.
 * 예)
 * 숫자 입력[EXIT:-100] : 1
 * 숫자 입력[EXIT:-100] : 3
 * 숫자 입력[EXIT:-100] : 4
 * 숫자 입력[EXIT:-100] : -100
 * 프로그램 종료
 */

public class LoopEx06_정답 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		// 내가 푼거
		/*
		int extCode = 0;
		
		while(true) {
			System.out.print("숫자 입력[EXIT:-100] : ");
			extCode = scan.nextInt();
			if(extCode == -100)
				break;				
		}
		System.out.println("프로그램 종료");
	*/
		
		// 정답방식 - 인덱스 값으로 종료시키기
		int run = 1;
		int num;
		
		while (run == 1) {
			System.out.print("숫자 입력[EXIT:-100] : ");
			num = scan.nextInt();
			if(num == -100)
				run = 0;
		}
		System.out.println("프로그램 종료");
		
		scan.close();
	}

}
