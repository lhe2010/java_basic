package step1_06.loop;

import java.util.Scanner;

/*
 * # 영수증 출력[2단계]
 * 1. 5번 주문을 받는다.
 * 2. 주문이 끝난 후, 돈을 입력받는다.
 * 3. 각 메뉴별 주문수량과 총금액을 출력한다.
 * 
 * 예)
 * 메뉴 선택 : 1
 * 메뉴 선택 : 1
 * 메뉴 선택 : 2
 * 메뉴 선택 : 2
 * 메뉴 선택 : 3
 * 총 금액 = 31300원
 * 현금 입력 : 32000
 * === 롯데리아 영수증 ===
 * 1. 불고기 버거 : 2개
 * 2. 새우    버거 : 2개
 * 3. 콜         라 : 1개
 * 4. 총   금   액 : 31300원
 * 5. 잔         돈 : 700원
 */


public class LoopEx05_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		int usrChoice = 0;	// 고를때 입력받는 사용자의 선택지
		int choice1 = 0;	// 1번을 주문한 수
		int choice2 = 0;	// 2번을 주문한 수
		int choice3 = 0;	// 3번을 주문한 수 
		
		System.out.println("=== 롯데리아 ===");					// 메뉴판
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우   버거 : " + price2 + "원");
		System.out.println("3.콜       라 : " + price3 + "원");
		
		int i = 0;			// while 초기식 변수 인덱스
		int total=0; 		// 총금액
		int usrMoney = 0;	// 사용자가 낸 돈 액수
		
		while (i<5) { 		// 루프 5번 실행
			System.out.print("메뉴 선택 : ");
			usrChoice = scan.nextInt();		
			
			if(usrChoice == 1) {
				total += price1;
				choice1++;
			}
			else if (usrChoice == 2) {
				total += price2;
				choice2++;
			}
			else if (usrChoice == 3) {
				total += price3;
				choice3++;
			}
						
			i++; 
		}
		System.out.println("총 금액 = " + total + "원"); 
		// while에서는 카운트만하고 여기서 토탈 구하는 방법도있음
		// total = choice1*price1 + choice2*price2 + choice3*price3;
		System.out.print("현금 입력 : ");
		usrMoney = scan.nextInt();

		// 돈이 부족할때는 아예 영수증 발급X
		if((usrMoney - total) < 0 ) {
			System.out.println("=== 돈이 부족합니다! ===");			
		}
		else {
			System.out.println("=== 롯데리아 영수증 ===");
			System.out.println("1.불고기 버거 : " + choice1 + "개");
			System.out.println("2.새우   버거 : " + choice2 + "개");
			System.out.println("3.콜       라 : " + choice3 + "개");
			System.out.println("4.총   금  액 : " + total + "원");
			System.out.println("5.잔       돈 : " +  (usrMoney - total)  + "원");			
		}
		
		scan.close();

	}

}
