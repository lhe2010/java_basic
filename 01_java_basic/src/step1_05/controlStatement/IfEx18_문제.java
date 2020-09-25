package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 가위바위보 게임을
 *   if - else if , else 등 구문을 활용하여 자율적으로 작성해보자.
 *   
 *   0 : 가위 , 1 : 바위 , 2 : 보
 */

public class IfEx18_문제 {

	public static void main(String[] args) {
		
		int com = 0;	// 랜덤으로 저장
		int me = 0;		// 키보드로 입력받아 저장
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("가위바위보!(0:가위,1:바위,2:보): ");
		me = scan.nextInt();
		com = ran.nextInt(3); // ***********random이니까 숫자 인수써야지!
		
		//   10 12 20 21
		// 정답: 이긴경우만 else-if로 하고 진경우는 다 else로 빼버림
		if(me == com) System.out.println("비겼군요!!");
		else {
			if (me==0) {
				if(com == 1) System.out.println("졌습니다!!");
				if(com == 2) System.out.println("이겼습니다!!");
			} else if (me == 1) {
				if(com == 2) System.out.println("졌습니다!!");
				if(com == 0) System.out.println("이겼습니다!!");
			} else if (me == 2) {
				if(com == 0) System.out.println("졌습니다!!");
				if(com == 1) System.out.println("이겼습니다!!");
			}
		}
		scan.close();
	}

}
