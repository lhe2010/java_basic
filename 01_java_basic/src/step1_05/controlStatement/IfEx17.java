package step1_05.controlStatement;

/*
 * [ if-else 문 ]
 *  - 형식
 *  	if (조건식) {
 *  		명령어;
 *  	} else {
 *  		명령어;
 *  	}
 *  - if 없이 else가 단독으로 올 수 없다. 
 *  - else를 중복해서 여러번 사용할 수 없다. 
 *  - if와 같은 라인에 작성(들여쓰기 라인정렬)
 *  - 여러 if-else있을때 맨 위에있는 조건식이 제일 중요하다!
 *    예를들어 첫 조건식에 70써버리면 85점인데 B가아니라 C가나옴 (오류)
 *  
 * [ if-else if 문 ]
 *  - 형식
 *  	if (조건식) {
 *  		명령어;
 *  	} else if (조건식) {
 *  		명령어;
 *  	} else if (조건식) {
 *   		명령어;
 *   	}
 *  - else if 문 조건은 '다중 택일'로 참인 조건식을 만나면 이하 조건은 실행하지 않는다. 
 *  - if없이 단독으로 사용할 수 없다. 
 *  - else문과 같이 사용할 수 있지만 else문은 맨 아래에 위치해야한다. 
 */

public class IfEx17 {

	public static void main(String[] args) {
		int finalScore = 61;
		
//		if(finalScore >= 60) {
//			System.out.println("합격!");
//		}
//		if(finalScore <60) {
//			System.out.println("불합격!");
//		}
		
		if(finalScore >= 60) {				// 조건식이 true일때 실행할 명령어
			System.out.println("합격!");	
		} else {							// 조건식이 false일때 실행할 명령어
			System.out.println("불합격!");
		}
		
		System.out.println();
		
		finalScore = 85;
		if(finalScore >= 90)
			System.out.println("A");
		else if(finalScore >= 80)
			System.out.println("B");
		else if(finalScore >= 70)
			System.out.println("C");
	}
}
