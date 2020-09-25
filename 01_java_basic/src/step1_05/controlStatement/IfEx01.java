package step1_05.controlStatement;
/*
 * 조건문 if
 * - 조건식이 true이면 실행되는 구문(false면 실행x)
 * 분기문
 * [ 형식 ]
 * 	if (조건식){
 * 		조건식이 true일 때 실행할 명령어;	// if 안 명령어는 tab으로 들여쓰기 한다. 
 * }
 */
public class IfEx01 {

	public static void main(String[] args) {
		if(true) {
			System.out.println("실행0");
		}
		if(false) {
			System.out.println("실행X");
		}
		
		int number = 8;
		if(number %2 ==0) 	// if문 안의 명령어가 한줄이면 {}를 생략가능
			System.out.println("짝수");
		
		if(number %2 ==1) 
			System.out.println("홀수");
		
		
	}
}
