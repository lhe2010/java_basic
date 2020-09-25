package step1_03.operator;

/*
 * 산술연산자 ( +, -, /, %, * )
 */
public class OpEx01 {

	public static void main(String[] args) {
		
		System.out.println(10 + 3);	// 덧셈
		System.out.println(10 - 3);	// 뺄셈
		System.out.println(10 * 3);	// 곱셈
		
		System.out.println(10 / 3);	// 나눗셈(몫)
		System.out.println(10 % 3);	// 나머지
		
		/*
		 * [중요] 
		 * 	정수 / 정수 = 정수
		 * 	정수 / 실수 = 실수
		 * 	실수 / 정수 = 실수
		 * 	실수 / 실수 = 실수
		 * - 최소 1개 이상 실수형태의 모습을 가지고 있어야함
		 * - 프로그래밍 언어마다 약간씩 차이 있음
		 */
		System.out.println(10 / 3); 	// 정수
		System.out.println(10.0 / 3);	// 둘중 하나를 소수로 바꾸면 됨
		System.out.println(10 / 3.0);	
		System.out.println(10.0 / 3.0);	
	}
}