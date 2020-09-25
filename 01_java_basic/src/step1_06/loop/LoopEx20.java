// 0923수요일 2교시
package step1_06.loop;

import java.util.Scanner;

/*
 * [ 보조제어문 ]
 * 	1. break
 *  2. continue
 */
public class LoopEx20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int i = 0;
		while(true) {
			if(i==3) 
				break;
			System.out.println(i);
			
			i++;
		}
		System.out.println();
		
		i = 0;
		while(i<8) {
			i++;
			if(i==1||i==3 || i==5)
				continue; // jump한다고 표현함
			System.out.println(i);
		}
		// 크리티컬한 이슈
		// 23줄의 i++을 if다음으로 하면 무한1컨티뉴... 안돌아간다. 
		// i++의 위치 한줄차이로 결과가 완전히 다르다.
		
		// continue 사용예제
		while(true) {
			System.out.println("1. 햄버거");
			System.out.println("2. 콜라 ");
			System.out.println("3. 감자");
			
			System.out.print("#메뉴입력 : ");
			int getMenu = scan.nextInt();
			System.out.println();
			
			// 1,2,3가 아니면 현금투입을 보여주기 싫은경우. 
			if(getMenu != 1&& getMenu != 2 && getMenu !=3) {
				System.out.println("1-3번 중에 선택하세요.\n");
				//continue;
			}
			
			if(getMenu == 1) System.out.println("햄버거");
			if(getMenu == 2) System.out.println("콜라");
			if(getMenu == 3) System.out.println("감자");
			
			System.out.print("#현금 투입 : ");
			int getMoney = scan.nextInt();
		}
		
	}
}
