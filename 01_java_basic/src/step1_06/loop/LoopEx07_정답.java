package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*
 * # Up & Down 게임[2단계]
 * 1. 정답을 맞추면 게임은 종료된다.
 * 2. 100점부터 시작해 오답을 입력할 때마다 5점씩 차감된다.
 * 3. 게임 종료 후, 점수를 출력한다.
 */

public class LoopEx07_정답 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int score = 100;
		int usrAsr;
		int i = 1;
		int comAsr = ran.nextInt(99)+1; // 0-99 //1-100
		
		while(i == 1) {
			System.out.print("====== UP&DOWN(0과100사이) : "); 
			usrAsr = scan.nextInt();
			
			if(usrAsr == comAsr) 
				i = 0;
			else {
				if(usrAsr < comAsr) System.out.println("UP! ~~ 5점차감!");
				else if (usrAsr > comAsr) System.out.println("DOWN! ~~ 5점차감!");
				score -=5;
			}
		}
		
		System.out.println("게임종료! 당신의 점수는 " + score + "점! ");
		scan.close();
	

	}

}
