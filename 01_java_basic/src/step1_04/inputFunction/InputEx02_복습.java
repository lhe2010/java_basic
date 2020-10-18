// 2020-10-18 일 자습 20:58-21:02
package step1_04.inputFunction;

import java.util.Scanner;

public class InputEx02_복습 {

	public static void main(String[] args) {
	
		// 문제1) 숫자 2개를 입력받아서 합 출력
		// 문제2) 숫자 1개를 입력받아서 , 홀수이면 true 출력
		// 문제3) 성적을 입력받아, 60점 이상이고 100점 이하이면 true 출력
		
		Scanner scan = new Scanner(System.in);
		System.out.print("[1] 숫자2개를 입력하세요 : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.println("두수의 합은 " + (num1 + num2));
		
		System.out.print("[2] 숫자 한개를 입력하세요. 홀수이면 true출력 : ");
		int num = scan.nextInt();
		System.out.println((num%2 == 1? true:false));
		
		scan.close();
		
	}
	
}
