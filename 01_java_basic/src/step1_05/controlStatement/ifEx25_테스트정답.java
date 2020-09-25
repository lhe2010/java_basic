package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
	==== 가위 바위 보 (하나빼기) ====
	
	1) 가위바위보 2개씩 저장
	meleft 에 가위바위보 입력
	meright 에 가위바위보 입력
	
	comleft 에 가위바위보 입력 (랜덤)
	comright 에 가위바위보 입력 (랜덤)
	
	2) 둘중 하나만 저장 
	me 에 meleft 또는 meright 저장(집접)
	com 에 comleft 또는 comright 저장(랜덤)
	
	3) 최종판정
*/
public class ifEx25_테스트정답 {

	public static void main(String[] args) {

		System.out.println("가위 0 바위 1 보 2");
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		// 가위 0 바위 1 보 2
		int meleft, meright, comleft, comright;
		int me, com;
		
		System.out.print("왼쪽 손을 입력하세요: ");
		meleft = scan.nextInt();
		System.out.print("오른쪽 손을 입력하세요: ");
		meright = scan.nextInt();
		
		comleft = ran.nextInt(3);
		comright = ran.nextInt(3);
		
//		System.out.println(meleft + ", " + meright + ", " + comleft + ", " + comright +"\n" );
		

		System.out.print("나 하나빼기! (왼손빼기:0 오른손빼기: 1): ");
		me = scan.nextInt() == 0 ? meright : meleft;   
		System.out.println("컴퓨터 하나빼기!\n");
		com = ran.nextInt(2) == 0 ? comright : comleft;   
		
		// 가위0 바위1, 바위1 가위0 >> 바위승
		// 가위0 보2, 보2 가위0 >> 가위승
		// 바위1 보2, 보2 바위1 >> 보 승
		System.out.print("[ 결과 ] 나: " + me + " / 컴: "+com+"\n");
		if(me == com) {
			System.out.println("[ 최종결과 ] 비김!");
		} else if ((me==0&&com==1)|| (me==1&& com==0)
				|| (me == 0&& com==2)|| (me == 2&&com==0)
				|| (me == 1&& com==2)|| (me == 2&& com==1)) {
			// 내가 이기는 경우 
			System.out.println("[ 최종결과 ] 내가 이김!");
		} else
			System.out.println("[ 최종결과 ] 컴퓨터가 이김!");
		
		scan.close();
	}
}
