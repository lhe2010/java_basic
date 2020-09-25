package step1_05.controlStatement;
import java.util.Scanner;

/*
 * # 로그인[2단계]
 * 1. Id와 Pw를 입력받아 회원가입을 진행한다.
 * 2. 이후 로그인을 위해 다시 Id와 Pw를 입력받는다.
 * 3. 가입 후 저장된 데이터와 로그인 시 입력받은 데이터를 비교한다.
 * 예) 로그인 성공 or 로그인 실패
 */


public class IfEx05_정답 {

	public static void main(String[] args) {
		
		int dbId = 0;
		int dbPw = 0;
		
		Scanner scan = new Scanner(System.in);

		System.out.println("================회원가입===============");
		System.out.print("가입할 아이디를 입력하시오 : ");
		dbId = scan.nextInt();
		System.out.print("가입할 아이디의 비밀번호를 입력하시오 : ");
		dbPw = scan.nextInt();
		System.out.println("===============축하합니다===============");
		
		System.out.println("================로그인===============");
		System.out.print("아이디를 입력하시오 : ");
		int myId = scan.nextInt();
		System.out.print("비밀번호를 입력하시오 : ");
		int myPw = scan.nextInt();
		
		if(myId == dbId && myPw == dbPw) System.out.println("로그인 성공!");
		if(myId != dbId || myPw != dbPw) System.out.println("로그인 실패!");

		scan.close();
	}

}
