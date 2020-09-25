package step1_03.operator;

/*
 * [ 비교연산자 ]
 * 	1) 크다 		>
 * 	2) 크거나 같다 	>=
 * 	3) 작다 		<
 * 	4) 작거나 같다 	<=
 *  5) 같다			==
 *  6) 다르다 		!=
 *  
 * [ 중요 ] 비교연산자의 결과는 '항상' 참(true) 또는 거짓(false)이다.  
 */
public class OpEx03 {

	public static void main(String[] args) {
		System.out.println(10 > 3);
		System.out.println(10 >= 3);
		System.out.println(10 < 3);
		System.out.println(10 <= 3);
		System.out.println(10 == 3);
		System.out.println(10 != 3);
	}
}
