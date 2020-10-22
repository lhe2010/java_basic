package step1_04.inputFunction;

import java.util.Scanner;

public class InputEx02_정답T {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 문제 1) 숫자 2개를 입력받아, 합 출력
		System.out.print("정수1 입력 : ");
		int x = scan.nextInt();
		System.out.print("정수2 입력 : ");
		int y = scan.nextInt();
		
		int total = x + y;
		System.out.println("두 수의 합 = " + total);
		
		// 문제 2) 숫자 1개를 입력받아, 홀수이면 true 출력
		System.out.print("숫자 한 개 입력 : ");
		int z = scan.nextInt();
		System.out.println(z % 2 == 1);
		
		// 문제 3) 성적을 입력받아, 60점 이상이고 100점 이하이면 true 출력
		System.out.print("성적 입력 : ");
		int score = scan.nextInt();
		System.out.println(60 <= score && score <= 100);
		
		scan.close();

	}

}
