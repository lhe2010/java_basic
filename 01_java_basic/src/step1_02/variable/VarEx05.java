package step1_02.variable;
/*
 * [ 변수의 생명주기 (scope) ]  
 */

public class VarEx05 {

	public static void main(String[] args) {
		int x = 10;
		int z = 0;
		if(true) {
			int y = 20;	
			System.out.println(x);
			System.out.println(y);
			z=30; // 대입만
			System.out.println(z);
		}
		
		System.out.println(x);
//		System.out.println(y);	// error! if안에서 만든 변수는 if 밖에서 접근 불가
		System.out.println(z);
	}

}
