package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # ATM[1단계] : 이체하기
 * 1. 이체할 계좌번호를 입력받는다.
 * 2. 계좌번호가 일치하면,
 * 3. 이체할 금액을 입력받는다.
 * 4. 이체할 금액 <= myMoney	: 이체가능
 * 			myMoney   - 이체할 금액
 * 			yourMoney + 이체할 금액
 *    이체할 금액  > myMoney 	: 이체불가
 */

public class IfEx19_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int myAcc = 1234;
		int myMoney = 8700;
		
		int yourAcc = 4321;
		int yourMoney = 12000;
		
		System.out.print("이체할 계좌번호를 입력하세요: ");
		int inputAcc = scan.nextInt(); // transAcc
		int inputMoney = 0;
		
		if(inputAcc == yourAcc) {		// 계좌번호가 일치
			System.out.print("이체할 금액을 입력하세요: ");
			inputMoney = scan.nextInt();
			
			if(inputMoney <= myMoney) {
				System.out.println("------이체가능!------");
				myMoney -= inputMoney;
				yourMoney += inputMoney;				
			} else 
				System.out.println("------잔액부족!이체불가!------");
		} else {
			System.out.println("계좌번호를 확인해주세요!");	// *****계좌번호가 일치하지 않은경우, 메세지 출력 
		}
		System.out.println("=======이체결과=======");
		System.out.println("myMoney = " + myMoney + "원");
		System.out.println("yourMoney = " + yourMoney + "원");
	
	}

}
