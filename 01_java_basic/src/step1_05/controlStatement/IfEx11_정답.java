package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 영수증 출력[1단계]
 * 1. 메뉴판을 출력한다.
 * 2. 사용자는 주문하고자 하는 메뉴의 번호를 입력한다.
 * 3. 현금을 입력받는다.
 * 4. 입력받은 현금과 메뉴가격을 확인해, 영수증을 출력한다.
 * 5. 단, 현금이 부족한 경우 "현금이 부족합니다."라는 메세지를 출력한다.
 */


public class IfEx11_정답 {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우   버거 : " + price2 + "원");
		System.out.println("3.콜     라 : " + price3 + "원");

		System.out.print("주문하고자 하는 메뉴를 선택하시오: ");
		int choice = scan.nextInt();
		
		int total = 0;
		if(choice == 1) total = price1;
		if(choice == 2) total = price2;
		if(choice == 3) total = price3;
		
		System.out.print("현금을 입력하세요: ");
		int moneyInput = scan.nextInt();
		
		if(moneyInput < total) System.out.println("현금이 부족합니다!");
		if(moneyInput >= total) 
			System.out.println("===== 영수증 =====\n"
							+"내실금액 --- " + total
							+"\n내신금액 --- " + moneyInput
							+"\n================="
							+"\n받으실금액 === " + (moneyInput-total));
		scan.close();


	}

}
