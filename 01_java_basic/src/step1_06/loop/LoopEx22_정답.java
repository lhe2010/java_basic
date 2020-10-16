package step1_06.loop;
// 2020-10-16 금 17:05-

// # 삼각형 그리기

public class LoopEx22_정답 {
	
	public static void main(String[] args) {
		
		final int SIZE = 5;
		
		/*
		 * 예)
		 * ###
		 * ###
		 * ###
		 */
		
//		for (int i=0; i<9; i++) {
//			System.out.print("#");
//			if (i%3 == 2) System.out.println();
//		}
		
		System.out.println();
		for (int i=0; i<SIZE; i++) {
			for (int j=0; j<SIZE; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		
		
		/*
		 * 문제 1)
		 * #
		 * ##
		 * ###
		 */
		// 17:05-17:08
		System.out.println("문제 1");

		for (int i = 1; i <= SIZE; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		/*
		 * 문제 2)
		 *   #
		 *  ##
		 * ###
		 */
		// 17:11-17:15
		System.out.println("\n문제 2");
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		/*
		 * 문제 3)
		 * ###
		 * ##
		 * #
		 */
		// 17:08-17:11
		System.out.println("\n문제 3");
		for (int i = 0; i < SIZE; i++) {
			for (int j = SIZE-i; j < 0; j--) {
				System.out.print(" ");
			}
			for (int j = i+1; j <= SIZE; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		/*
		for (int i = SIZE; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}*/
		
		/*
		 * 문제 4)
		 * ###
		 *  ##
		 *   #
		 */
		// 17:15-17:19
		System.out.println("\n문제 4");
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = SIZE-i; j > 0; j--) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		/*
		 * 문제 5)
		 * @##
		 * @@#
		 * @@@
		 */
		// 17:19-17:21
		System.out.println("문제 5");
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("@");
			}
			for (int j = SIZE-i; j > 0; j--) {
				System.out.print("#");
			}
			System.out.println();
		}

		/*
		 * 문제 6)
		 *   #
		 *  ###
		 * #####
		 */
		// 17:25-17:28
		System.out.println("\n문제 6");
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i*2+1; j++) {
				System.out.print("#");
			}
			System.out.println();
		}

		/*
		 * 문제 7)
		 *  #####
		 *   ###
		 *    #
		 */
		// 17:28-17:44
		System.out.println("\n문제 7");
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			// *****아오....
			for (int j = 2*(SIZE-i)-1 ; j > 0 ; j--) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
