package step1_06.loop;

import java.util.Random;

/*
 * # 베스킨라빈스31
 * 1. p1과 p2가 번갈아가면서 1~3을 입력한다.
 * 2. br은 p1과 p2의 입력값을 누적해서 저장한다.
 * 3. br이 31을 넘으면 게임은 종료된다.
 * 4. 승리자를 출력한다.
 * 
 * 예) 
 * 1턴 : p1(2)	br(2)
 * 2턴 : p2(1)	br(3)
 * 3턴 : p1(3)	br(6)
 * ...
 */

public class LoopEx11_정답 {

	public static void main(String[] args) {
		
		Random ran = new Random();
				
		int p1 = 0;		// p1이 선택한 수 
		int p2 = 0;		// p2이 선택한 수
			
		int br = 0;		// 누적
		int turn = 1; 	// 홀수면 p1차례, 짝수면 p2차례 
		// p1인지(0) p2인지(1)
		
		while (br < 31) {
			
			if(turn % 2 == 1) { // 홀수이므로 p1의 차례
				p1 = ran.nextInt(3)+1;
				br += p1;
				System.out.println(turn + "턴 : p1(" + p1 + ")  br("+br+")");
			}
			else if(turn % 2 == 0) { // 짝수이므로 p2의 차례
				p2 = ran.nextInt(3)+1;
				br += p2;
				System.out.println(turn + "턴 : p2(" + p2 + ")  br("+br+")");
			}
			
			turn++;			
		}
		// 삼항연산자!!!!!!!
		System.out.println("승리자는 p"+ (turn%2 == 1 ? 1 :2)+" 입니다.");

	}

}
