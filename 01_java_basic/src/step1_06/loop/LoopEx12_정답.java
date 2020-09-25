package step1_06.loop;

/*
 * # 369게임[2단계]
 * 1. 1~50까지 반복을 한다.
 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
 */

public class LoopEx12_정답 {

	public static void main(String[] args) {
		
		int num = 1;
		
		System.out.println("369게임 시이작!");
		
		while (num <=50) {
			if(num%10 ==3 || num%10 == 6 || num%10 == 9 || num/10 == 3) {
				System.out.print("짝");
				if((num/10 == 3)&&(num%10 ==3 || num%10 == 6 || num%10 == 9)) {
					System.out.print("짝");
				}
			} else {
				System.out.print(num);				
			}
			System.out.print(" ");
			num++;
		}

	}

}
