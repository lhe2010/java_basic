package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 최대값 구하기[1단계]
 * 1. 숫자 3개를 입력받는다.
 * 2. 입력받은 3개의 수를 비교하여,
 * 3. 가장 큰 수(MAX)를 출력한다.
 */


public class IfEx12_정답 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하시오: ");
		int num1 = scan.nextInt();
		System.out.print("두번째 숫자를 입력하시오: ");
		int num2 = scan.nextInt();
		System.out.print("세번째 숫자를 입력하시오: ");
		int num3 = scan.nextInt();

		//		int num1 = 8;
		//		int num2 = 3;
		//		int num3 = 2;
		
		int maxNum = 0;
		
		if (num1 <= num2) {
			if (num2 >= num3) maxNum = num2;
			if (num2 <= num3) maxNum = num3; 
		}
		if(num1 > num2) {
			if (num1 >= num3) maxNum = num1;
			if (num1 <= num3) maxNum = num3; 
		}
		
		System.out.println("가장큰수는 "+maxNum);
		scan.close();
	}

}
