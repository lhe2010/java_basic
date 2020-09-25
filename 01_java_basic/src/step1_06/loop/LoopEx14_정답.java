package step1_06.loop;

import java.util.Scanner;

/*
 * # 최대값 구하기[2단계]
 * 1. 3회 반복을 하면서 정수를 입력받는다.
 * 2. 입력받은 3개의 숫자 중 가장 큰 값을 출력한다.
 */

public class LoopEx14_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int idx = 1;
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int max = 0;
		
		while(idx <= 3) {
			System.out.print(idx + "번째 비교할 수를 입력하세요: ");
			// 여기서 if로 다 구분안하고 바로 num1,2,3에 바로 넣는방법은없는가
			if(idx == 1) num1 = scan.nextInt();
			else if (idx == 2) num2 = scan.nextInt();
			else if (idx == 3) num3 = scan.nextInt();			
			idx++;
		}
		
		// 258 285 528 582 852 825
		if (num1 >= num2) { // 528, 852, 825
			if(num1 >= num3) max = num1; // 852 825
			if(num1 < num3) max = num3;  // 528
		} else { // num2가 제일클때 285 582 258
			if(num2 >= num3) max = num2; // 285 582
			if(num2 < num3) max = num3; 	// 258
		}
		System.out.println("세 정수중 제일 큰 정수는 " + max +" 입니다.");
	}

}

/* 선생님 답
int maxNum = 0;

int i = 1;

while(i <= 3) {
	
	System.out.print("정수" + i + " 입력 : ");
	int num = scan.nextInt();
	
	if(maxNum < num) {
		maxNum = num;
	}
	i += 1;
}

System.out.println("최대값 = " + maxNum);
*/