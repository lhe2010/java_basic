package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 가운데 숫자 맞추기 게임
 * 1. 150~250 사이의 랜덤 숫자 저장
 * 2. 랜덤 숫자의 가운데 숫자를 맞추는 게임이다.
 * 예)
 * 		249		: 4
 */

public class IfEx21_정답 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		System.out.println("가운데 숫자 맞추기 게임!");
		System.out.println("랜덤숫자 생성중...");
		
		int ranNum = ran.nextInt(101)+150; // *******범위틀림!!!!!!! ㅠㅠㅠ150이랑 250 포함!
		
		System.out.print(ranNum+"\t: ");
		int usrAnswer = scan.nextInt();
		
		if((ranNum%100)/10 == usrAnswer) 
			System.out.println("정답!");
		else 
			System.out.println("때앵!");
		
		scan.close();
	}

}
