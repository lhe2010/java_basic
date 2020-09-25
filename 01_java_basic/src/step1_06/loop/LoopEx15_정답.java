package step1_06.loop;

import java.util.Random;

/*
 * # 랜덤학생
 * 1. 10회 반복을 한다.
 * 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적)
 * 3. 성적이 60점 이상이면 합격생이다.
 * ---------------------------------------
 * . 전교생(10명)의 총점과 평균을 출력한다.
 * . 합격자 수를 출력한다.
 * . 1등 학생의 번호와 성적을 출력한다.
 */

public class LoopEx15_정답 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int idx = 1;
		
		int score = 0;
		int maxScore = 0;
		int maxIdx = 0;
		
		int passNum = 0;
		int sum = 0;
		
		
		while (idx <= 10) { // 열번반복
			score = ran.nextInt(100)+1;
			
			if(score >= 60) passNum++;
			sum += score;
			if(maxScore <= score) {
				maxScore = score;
				maxIdx = idx;
			}
			
			System.out.println(idx + "번째 학생의 점수: " + score );
//			System.out.println("현재까지 최고점 학생은 "+ maxIdx + "번째 학생이며 그 학생의 점수는 " + maxScore);
			
			idx++;
		}
		
		System.out.println("\n전교생의 총점은 " + sum + "점이며, 평균은 " + sum/10.0);
		System.out.println("합격자의 수는 " + passNum + "명");
		System.out.println("1등 학생은 "+ maxScore + "점인 " + maxIdx + "번째 학생입니다. ");

	}

}
