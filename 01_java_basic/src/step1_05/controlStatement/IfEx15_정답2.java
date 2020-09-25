package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 당첨복권[1단계] 30%의 당첨확률
 */

public class IfEx15_정답2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int usrNum = scan.nextInt();
		int randNum = ran.nextInt(10); // 0-9까지의 난수
		
		// 0 1 2 3 4 5 6 7 8 9 중에 답이 0-3이라면 10개중에 30%이니까 ... 
		if (usrNum < 3)
			System.out.println();
			
		scan.close();
		
	}

}
