// 2020-10-16 금 15:00-15:03
package step1_06.loop;

/*
 * 2차원 반복문 구구단 출력
 * === 2단 ===
 * 2 X 1 = 2
 * 2 X 2 = 4
 * 2 X 3 = 6
 * 2 X 4 = 8
 * 2 X 5 = 10
 * 2 X 6 = 12
 * 2 X 7 = 14
 * 2 X 8 = 16
 * 2 X 9 = 18
 * === 3단 ===
 * 3 X 1 = 3
 * 3 X 2 = 6
 * ...
 * ...
 */

public class LoopEx21_정답 {

	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			System.out.printf("=== %d단 === \n", i);
			for (int j = 1; j < 10; j++) 
				System.out.printf("%d X %d = %d\n", i, j, i*j);
		}
	}
}
