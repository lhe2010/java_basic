package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 연산자 기호 맞추기 게임
 * 1. 1~10 사이의 랜덤 숫자 2개를 저장한다.
 * 2. 1~4 사이의 랜덤 숫자 1개를 저장한다.
 * 3. 위 숫자는 연산자 기호에 해당된다.
 * 	  1) 덧셈	  2)  뺼셈     3) 곱셈	 4) 나머지
 * 4. 사용자는 연산자 기호를 맞추는 게임이다.
 * 예) 3 ? 4  = 7
 *    1) + 2) - 3) * 4) %
 *    정답 : 2번
 */

public class IfEx24_문제 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int ranNum1 = ran.nextInt(10)+1;
		int ranNum2 = ran.nextInt(10)+1;
		int ranNum3 = ran.nextInt(4)+1; //  1) 덧셈	  2)  뺼셈     3) 곱셈	 4) 나머지
		
		int answer = 0;
		
		if(ranNum3 == 1)
			answer = ranNum1 + ranNum2;
		else if (ranNum3 == 2)
			answer = ranNum1 - ranNum2;
		else if (ranNum3 == 3)
			answer = ranNum1 * ranNum2;
		else if (ranNum3 == 4) 
			answer = ranNum1 % ranNum2; // ***문제 꼼꼼히 읽을것! 나누기가 아니라 나머지였음!
		
		System.out.println(ranNum1 + " ? " + ranNum2 + " = " + answer);
		System.out.print("?에 와야할 연산자는? (1) 덧셈 2) 뺼셈 3) 곱셈 4) 나머지): ");
		int usrAnswer = scan.nextInt();
		
		if(usrAnswer == ranNum3) 
			System.out.println("===정답!===");
		else 
			System.out.println("===때엥!===");
		
		scan.close();
	}

}
