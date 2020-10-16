// 2020-10-16 금 자습 20:31-20:39
package step1_06.loop;

/*
 * # 2차원 반복문
 * 1   2  3  4  5
 * 10  9  8  7  6
 * 11 12 13 14 15
 * 20 19 18 17 16
 * 21 22 23 24 25
 * 
 * 
 * 1) 오른쪽방향으로 순서대로 출력
 * 2) 왼쪽방향대로 순서대로 출력
 * 
 * 1)2) 5번 반복
 * 
 */


public class LoopEx28_정답 {

	public static void main(String[] args) {

		int start = 1;
		int end = 5;
		
		for (int i = 1; i <= 5; i++) {
			if(i%2 == 1) { // 오른방향으로 출력 
				for (int j = 5*(i-1)+1; j <= i*end; j++) {
					System.out.print(j + "\t");
				}
			}
			if(i%2 == 0) { // 왼쪽방향으로 출력 
				for (int j = 5*i; j > 5*(i-1); j--) {
					System.out.print(j + "\t");
				}
			}
			System.out.println();
			
		}
		
	}

}
