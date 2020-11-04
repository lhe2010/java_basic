// 2020-11-04 수 2교시 16:27-16:50
package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*
 * # 카카오 택시
 * 1. 손님을 태워 목적지까지 이동하는 게임이다.
 * 2. -10~10 사이의 랜덤 숫자 2개를 저장해 목적지로 설정한다.
 * 3. 메뉴는 아래와 같다.
 * 		1) 속도설정 : 1~3까지만 가능
 * 		2) 방향설정 : 동(1)서(2)남(3)북(4)
 * 		3) 이동하기 : 설정된 방향으로 설정된 속도만큼 이동
 * 4. 거리 2칸 당 50원씩 추가되어 요금도 출력한다.
 * 예) 1(50) 2(50) 3(100) 4(100) ...
 */

public class LoopEx16_테스트정답 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		// 목적지(destination)
		int desX = 0;
		int desY = 0;
		
		// 현재 위치
		int x = 0;
		int y = 0;
		
		// 방향(direction)
		int dir = 0;
		
		// 속도
		int speed = 0;
		
		// 요금
		int fee = 0;
		int move = 0;

		desX = ran.nextInt(20)-10;
		desY = ran.nextInt(20)-10;
		System.out.printf("desX=%d, desY=%d", desX, desY);
		boolean isRun = true;
		while(isRun) {
			
			System.out.println("\n= 카카오 택시 =");
			System.out.println("목적지 : " + desX + "," + desY);
			System.out.println("현위치 : " + x + "," + y);
			System.out.println("방   향 : " + dir);
			System.out.println("속   도 : " + speed);
			System.out.println("========================");
			
			System.out.println("1.방향설정 : 동(1)서(2)남(3)북(4)");
			System.out.println("2.속도설정 : 1~3까지만 가능");
			System.out.println("3.이동하기");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) { 			// 방향 설정
				System.out.print("\t방향을 설정해주세요: ");
				dir = scan.nextInt();
				if(!(dir >= 1 && dir <= 4)) {
					System.out.println("\t잘못된 방향값");
					continue;
				}
			} else if(sel == 2) { 	// 속도 설정  
				System.out.print("\t속도를 설정해주세요: ");
				speed = scan.nextInt();
				if(!(speed >= 1 && speed <= 3)) {
					System.out.println("\t잘못된 속도값");
					continue;
				}
			} else if(sel == 3) {
				System.out.println("\t택시 이동중...");
				// 설정된 방향으로 설정된 속도만큼 이동
				if(dir==1) { 			// 동
					x += speed;					
				} else if(dir == 2) {	// 서 
					x -= speed;
				} else if(dir == 3) {	// 남
					y -= speed;
				} else if(dir == 4) {	// 북
					y += speed;
				}
				// 이동완료, 요금 계산
				move += speed;
			}
			
			if(x == desX && y == desY) {
				if(move %2 == 1) {
					fee = 50 * (move / 2 + 1);
				} else {
					fee = 50* (move / 2);
				}
				System.out.printf("[목적지에 도착] %d번 움직였으므로 요금은 %d원\n", move, fee);
				break;
			}
			
		}

	}

}
