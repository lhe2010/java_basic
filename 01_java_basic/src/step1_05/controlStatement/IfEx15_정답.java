package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 당첨복권[1단계] 30%의 당첨확률
 *  - 예를들어 0, 1, 2 세개면 각각 당첨확률은 33%이다. 
 */

public class IfEx15_정답 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int winCnt = 0;

		Scanner scan = new Scanner(System.in);
//		int usrNum = scan.nextInt();
		int usrNum =0;
		
//		int winNum = ran.nextInt(usrNum)+1;
//		int winNum = ran.nextInt(10)+1;
		int winNum=0;
		int i = 1;

		while (i <= 10) { // 10번 실행합니다. 
			
			System.out.print(i+"번째 게임입니다. 복권번호를 입력하세요(범위는 1-10): "); 
			usrNum = scan.nextInt();
			
			winNum = ran.nextInt(10)+1;	// 1-10사이 값이라고 하자
			if(winNum == usrNum) {
				System.out.println("당첨되었습니다. 당첨번호: " + winNum);
				winCnt++; // 당첨 카운트 올려줌			
			}
			else
				System.out.println("때엥~ 당첨번호: "+ winNum);
			i++; 			
		}
		System.out.println("당첨확률은 "+ (winCnt*10) + "% 입니다.");
	}

}

// 선생님 답

//int rNum = ran.nextInt(10);
//if(rNum < 3) 
//	System.out.println("당첨");
//if(rNum >= 3)
//	System.out.println("꽝");
