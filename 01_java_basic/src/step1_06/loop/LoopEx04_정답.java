package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*
 * # 구구단 게임[3단계]
 * 1. 구구단 게임을 5회 반복한다.
 * 2. 정답을 맞추면 20점이다.
 * 3. 게임 종료 후, 성적을 출력한다.
 */


public class LoopEx04_정답 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		System.out.println("구구단 게임을 시작합니다!");
		int num1, num2, usrNum;
		int score = 0;
		
		int i = 0;
		while (i<5) {
			num1 = ran.nextInt(9)+1;  	// 선생님 정답: ran.nextInt(8) + 2 // 1단안나오게...
			num2 = ran.nextInt(9)+1;	// 1-9 사이의 난수
			
			System.out.print(i+"번째 문제: " + num1 + " * "+ num2 +" = ");
			usrNum = scan.nextInt();
			
			if(usrNum == num1*num2) 
				score += 20;
		
			i++;
		}
		System.out.println("당신의 점수는 "+score +"점 입니다. ");

		scan.close();
	
	}

}
