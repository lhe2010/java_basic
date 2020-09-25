package step1_03.operator;

/*
 * [ 삼항연산자 ]
 * 	- 형식 
 * 		조건식 ? 참일때의 결과값 : 거짓일때의 결과값
 */
public class OpEx08 {

	public static void main(String[] args) {
		int totalGrade = 70;
		System.out.println(totalGrade >= 60 ? "합격" : "불합격");
		System.out.println(totalGrade < 60 ? "불합격" : "합격");
		
		char result = totalGrade >= 60 ? 'p' : 'f';
		String result2 = totalGrade >= 60 ? "pass":"fail";
		System.out.println(result);
		System.out.println(result2);
	}
}