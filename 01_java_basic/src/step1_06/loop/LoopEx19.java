// 0923수요일 1교시
package step1_06.loop;
/*
 *  do while 문
 *  
 *  [ 형식 ]
 *  	do {
 *  		반복할 명령어;
 *  	} while (조건식);
 *  
 *   1. while문과 do-while문의 차이점은 반복 조건의 '검사시점'이다
 *   	(while: 반복조건을 먼저 검사)
 *   	(do-while: 일단 한 번 실행한 후 반복저건을 검사)
 *   2. while문 조건식 뒤에 ;를 잊지 않고 반드시 써준다.  
 */ 

import java.util.Scanner;

public class LoopEx19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0; // num이 while조건식에서 false나니까 돌지 않음
		while  (num > 0 && num < 4) {
			System.out.print("숫자입력(1,2,3) : ");
			num = scan.nextInt();
		}
		
		do {
			System.out.print("숫자입력(1,2,3) : ");
			num = scan.nextInt();
		} while (num > 0 && num < 4);
		
		scan.close();
	}

}
