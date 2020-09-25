// 0923수요일 2교시
package step1_05.controlStatement;
/*
 * switch-case문
 * 	[형식] 
 * 		switch(변수){
 * 		case 값: 
 * 			명령어;
 * 			break;
 * 		case 값: 
 * 			명령어;
 * 			break;
 * 		case 값: 
 * 			명령어;
 * 			break;
 * 		default:
 * 			명령어;
 * 		}
 * 	1. if문과 다르게 범위형태(조건식)으로 분기할 수없고 일차적으로 값을 기준으로 분기한다. 
 *  2. switch의 기준변수에는 정수, 문자, 문자열 자료형을 사용할 수 있다. 실수불가!
 *  3. 분기되는 case뿐만 아니라 그 case의 아래 case까지 모두 수행한다. 
 *  	이것을 원치 않을 경우 의도적으로 보조제어문 break 명령어를 함께 작성한다. 
 *  4. default는 case에 해당하는 값이 없을 경우 분기하는 구문이다. 
 */
public class IfEx26 {

	public static void main(String[] args) {
		
		char chrVar = 'B';	// b나 c로 바꿔보기
		
		// [ if문과 차이점 ]
		// if는 조건식이 들어가는데 switch는 변수자체가 들어감
		// if-else와 달리 분기점 밑으로 쭉 다 실행해 내려간다. 
		switch (chrVar) { 	// 기준
			case 'A':		// 분기점
				System.out.println("A로 분기합니다. ");
//				break;
			case 'B':
				System.out.println("B로 분기합니다. ");
//				break;
			case 'C':
				System.out.println("C로 분기합니다. ");
				break;
			default: 		
				// else처럼. 어차피 맨 아래에 있으니 default에는 break안써도됨. 
				System.out.println("default로 분기합니다. ");
				break;
			//System.out.println("실행되남? 모든 케이스에 넣고싶을때"); // 실행안됨!
		}

	}

}
