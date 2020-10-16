// 2020-10-16 금 자습 20:08-20:12
package step1_06.loop;

import java.util.Scanner;

/*
 * # 소수 찾기[3단계]
 * 1. 숫자를 한 개 입력받는다.
 * 2. 입력받은 숫자보다 큰 첫 번째 소수를 출력한다.
 * 
 * 예) Enter Number ? 1000
 *    1000보다 큰 첫번재 소수는 1009
 * 예) Enter Number ? 500
 *    500보다 큰 첫번째 소수는 503
 */


public class LoopEx25_테스트정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Number ? ");
		int getNumber = scan.nextInt();
		int cnt = 0;
		
		for (int i = getNumber; i < getNumber*10; i++) {
			cnt = 0;
			for (int j = 1; j <= i; j++) {
				if(i % j == 0)
					cnt++;
			}
			
			if(cnt == 2) {
				System.out.print(i);
				break;
			}
		}
		
		scan.close();
		
	}

}
