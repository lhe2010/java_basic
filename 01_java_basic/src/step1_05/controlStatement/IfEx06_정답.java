package step1_05.controlStatement;
import java.util.Scanner;

/*
 * # 구구단 게임[1단계]
 * 1. 구구단 문제를 출제하기 위해, 숫자 2개를 입력받는다.
 * 2. 입력받은 숫자를 토대로 구구단 문제를 출력한다.
 * 예)	3 x 7 = ?
 * 3. 문제에 해당하는 정답을 입력받는다.
 * 4. 정답을 비교 "정답" 또는 "땡"을 출력한다.
 */


public class IfEx06_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("숫자1을 입력하시오 : ");
		int num1 = scan.nextInt();
		System.out.print("숫자2를 입력하시오 : ");
		int num2 = scan.nextInt();
		
		// 두개 한번에 입력받아보기
//		System.out.print("숫자두개를 입력하시오 : ");
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
		
		System.out.print(num1 + " x " + num2 + "의 답은?: ");
		// 변수명 헷갈리게 지음 -> 정답을 answer, 사용자입력은 myAnswer로 바꿈.
		int answer = num1 * num2;
		int myAnswer = scan.nextInt();
		
		if(answer == myAnswer) System.out.println("정답");
		else System.out.println("때앵");

		scan.close();

	}

}
