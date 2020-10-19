// 2020-10-16 금 자습 20:12-20:25
// 2020-10-19 월 3교시 20:25-20:35
package step1_06.loop;

import java.util.Scanner;

/*
 * 1. key값(기준값)을 입력받아서 저장한다.
 * 2. 반복문을 사용하여 -1을 입력받을때까지 일련의 수를 계속 받는다. -1을 입력받을 경우 종료한다.
 * 3. 위 수 중 key 값이 몇 번째에 포함되어 있는가를 출력하는 프로그램을 작성하시오.
 * 4. 단, key가 여러개 포함되어 있을 경우 앞에 나타난 것의 위치를 출력하시오.
 * 5. key가 일련의 수 안에 없는 경우 "not found"를 출력하시오.
 * 
 * 예) 
 * key 값 입력 : 7
 * 
 * 입력 : 10
 * 입력 : 7
 * 입력 : 20
 * 입력 : 7
 * 입력 : 30
 * 입력 : 7
 * 입력 : 10
 * 입력 : -1
 * 
 * 결과 : key값 7가 첫번재 나타난 것은 2번째 이다.
 */

public class LoopEx26_테스트정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        
		System.out.print("key값 입력 : ");
		int key = scan.nextInt();
		int getNum;
		int numPlace = -1;
		int turn = 1;
		int cnt = 1;
		
		do {
			System.out.printf("%d번째 입력 : ", turn);
			getNum = scan.nextInt();
			if(getNum == key && cnt == 1) {
				numPlace = turn;
				cnt++;
			}
			turn++;
			
		} while(getNum != -1);
	
		if(numPlace == -1) {
			System.out.println("[결과] NOT FOUND");
		} else {
			System.out.printf("[결과] key값 %d가 첫번째 나타난 것은 %d번째 이다.", key, numPlace);
		}

		scan.close();
	}

}
