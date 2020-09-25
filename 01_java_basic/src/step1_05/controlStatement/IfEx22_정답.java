package step1_05.controlStatement;

import java.util.Random;

/*
 * # 369게임[1단계]
 * 1. 1~50 사이의 랜덤 숫자를 저장한다.
 * 2. 위 수에 369의 개수가
 * 	1) 2개이면, 짝짝을 출력
 *  2) 1개이면, 짝을 출력
 *  3) 0개이면, 해당 숫자를 출력
 * 예)
 * 		33	 : 짝짝
 * 		16	 : 짝
 * 		 7	 : 7
 */

public class IfEx22_정답 {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int ranNum = ran.nextInt(50)+1;
		int answer = 0; // 변수명 cnt
		
		if (ranNum/10 == 3 || ranNum/10 == 6 || ranNum/10 == 9) // 풀때 ||아니고 &&로 써서 한참헤맸음
			answer++;
		if (ranNum%10 == 3 || ranNum%10 == 6 || ranNum%10 == 9)
			answer++;
		
//		System.out.println(answer);
		
		System.out.println("게임 결과!! (랜덤숫자는 "+ranNum +")");					
		if(answer == 0) 
			System.out.println(ranNum);	// 369 0 개
		else if (answer == 1) 
			System.out.println("짝!"); 	// 369 1 개
		else 
			System.out.println("짝짝");	// 369 2 개
		
	}

}
