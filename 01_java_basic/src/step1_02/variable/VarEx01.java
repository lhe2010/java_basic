package step1_02.variable;

/*
 * 변수 (variable)
 * 	- 단 하나의 값을 저장할 수 있는 메모리 공간
 * 		1) 변수의 선언 그리고 초기화
 * 		 변수의 선언		 : int nData;	// 메모리 공간 할당
 * 		 변수의 초기화	 : nData = 0;	// 값 저장
 * 		2) 변수의 선언과 동시에 초기화
 * 		 int nData = 0;
 * 		3) 변수의 특징
 * 		 3-1) 변수는 변수 하나당 값을 한개만 저장할 수 있다. [고유성]
 * 		 3-2) 새로운 값이 변수에 저장되면 이전 값은 사라진다.  	
 *  - 변수명은 고유해야함
 *  - 초기화는 필수로 해주는 습관!
 *  
 *  메모리8비트 표기법 16진수 eg.0xffffffff
 *  메모리 주소 외우는게 불가능해서 이름표를 붙인다. 
 */
public class VarEx01 {

	public static void main(String[] args) {
		
		// 1. 정수 : Integer(int) 4byte
		int nData;	// 변수 선언
		nData = 10;	// 값 저장
		System.out.println(nData);

		// 2. 실수 : double
		double fData;
		fData = 3.14; // double fData = 3.14;
		System.out.println(fData);
		
		// 3. 문자 1개 : character(char)
		// 문자 1개에 대한 정의. 한글은 예외케이스이다. 기준: 알파벳을 기준으로 보는 언어도있음(c)
		char cData1 = 'a'; 			// 싱글쿼터
		char cData2 = '가';
		System.out.println(cData1);
		System.out.println(cData2);
		
		// 4. 문자열 : String (대문자주의)
		String strData = "java";	// 더블쿼터
		System.out.println(strData);
		
		// 5. 참과 거짓 : boolean
		boolean isChecked = true;
		System.out.println(isChecked);		
		
		int tempData = 10;
		tempData = 9;
		// int tempData = 9;	// [error] 변수명은 고유해야한다. 
		tempData = 7;
		System.out.println(tempData); // 최근 값만 저장되어 있음
	}
}
