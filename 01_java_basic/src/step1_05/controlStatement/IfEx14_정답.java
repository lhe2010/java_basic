package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 코인 게임
 * 1. 0 또는 1의 랜덤 숫자를 저장한다.
 * 2. 0은 동전의 앞면, 1은 동전의 뒷면이다.
 * 3. 동전의 앞뒷면을 맞추는 게임이다.
 */

public class IfEx14_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int coin = ran.nextInt(2);
		System.out.println(coin);
		System.out.print("동전이 앞면일까요 뒷면일까요?(앞이0, 뒤가1): ");
		int userGuess = scan.nextInt();
		
		if(coin == userGuess) System.out.println("맞습니다!");
		if(coin != userGuess) System.out.println("꽝!");
		
		scan.close();
	}

}
