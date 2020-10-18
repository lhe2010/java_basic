// 2020-10-18 일 복습 19:58-20:04
package step1_03.operator;

public class OpEx02_복습 {

	public static void main(String[] args) {
		
		//예) 현금이 1000원있다. 200원짜리 과자 구입 후, 잔돈 출력 
		System.out.println(1000 - 200);
		System.out.println("잔돈 = " + (1000 - 200) + "원");
		
		//문제1) 월급이 100원이다. 연봉은? (조건 : 세금 10% 제외)
		int sal = 100;
		System.out.println("[1] 연봉 : " + sal * 12 * 0.9);
		
		//문제2) 시험점수를 30, 50, 4점 을 받았다. 평균은?
		System.out.println("[2] 평균 : " + (30+50+4)/3.0);
		
		//문제3) 가로가 3이고 세로가 6인 삼각형 넓이 출력
		System.out.println("[3] 삼각형넓이 : " + 3*6*0.5);
		
		//문제4) 100초를 1분 40초로 출력
		System.out.printf("[4] 100초 : %d분 %d초 \n", 100/60, 100%60);
		
		//문제5) 800원에서 500원짜리 개수 , 100원짜리 개수 출력
		//정답5) 500원(1개), 100원(3개)
		System.out.printf("[5] 500원(%d개), 100원(%d개)", 800/500, (800-500)/100);

	}

}
