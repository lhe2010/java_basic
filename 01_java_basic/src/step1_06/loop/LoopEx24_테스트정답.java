// 2020-10-16 금 자습 19:52-20:06
package step1_06.loop;

/*
 
	# 문제2)  9의 배수중 십의 자리가 6인 첫번째 배수 출력
	# 답 : 63
	
	# 문제3) 8로 나누면 5가 남는수 중 150보다 적은수중에 가장 가까운수를 구하시요 ( 절대값 사용 x )
	# 답 149
	
	# 문제4) 50에서 100까지 자연수중에서 9의 배수는 모두 몇개입니까?
	# 답 6 (54,63,72,81,90,99)
	
	# 문제5) 28의 배수 중에서 가장 큰 세자리 수를 구하시요.
	# 답 980
	
	# 문제6) 8의 배수를 작은수부터 5개 출력
	# 답 : 0,8,16,24,32
	
*/

public class LoopEx24_테스트정답 {

	public static void main(String[] args) {
		
		System.out.println("[Q2] 9의 배수중 십의 자리가 6인 첫번째 배수 출력 ");
		int num = 0;
		for (int i = 1; i < 30; i++) {
			num = 9 * i;
			if(num / 10 == 6) {
				System.out.println(num);
				break;
			}
		}
		
		System.out.println("[3] 8로 나누면 5가 남는수 중 150보다 적은수중에 가장 가까운수를 구하시요 ( 절대값 사용 x )");
		for (int i = 150; i > 0; i--) {
			if(i%8 == 5) {
				System.out.println(i);
				break;
			}
		}
		
		int cnt = 0;
		System.out.print("[4] 50에서 100까지 자연수중에서 9의 배수는 모두 몇개입니까?\n(");
		for (int i = 50; i < 100; i++) {
			if(i % 9 == 0) {
				cnt++;
				System.out.print(i + ", ");
			}
		}
		System.out.print(") 답: " + cnt);

		System.out.println("\n[5] 28의 배수 중에서 가장 큰 세자리 수를 구하시요.");
		for (int i = 999; i > 99; i--) {
			if(i % 28 == 0) {
				System.out.println(i);
				break;
			}
		}
		
		System.out.println("[6] 8의 배수를 작은수부터 5개 출력");
		for (int i = 0; i < 5; i++) {
			System.out.print(i*8 + ", ");
		}
		
	}

}
