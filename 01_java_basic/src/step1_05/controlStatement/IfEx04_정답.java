package step1_05.controlStatement;
import java.util.Scanner;

/*
 * # 로그인[1단계]
 * 1. Id와 Pw를 입력받는다.
 * 2. 입력받은 데이터와 db데이터를 비교해 로그인 처리를 진행한다.
 * 예) 로그인 성공 or 로그인 실패
 */


public class IfEx04_정답 {

	public static void main(String[] args) {
		int dbId = 1234;
		int dbPw = 1111;

		Scanner scan = new Scanner(System.in);

		System.out.print("아이디를 입력하시오 : ");
		int myId = scan.nextInt();
		System.out.print("비밀번호를 입력하시오 : ");
		int myPw = scan.nextInt();
		
		if(myId == dbId && myPw == dbPw) System.out.println("로그인 성공!");
		if(myId != dbId || myPw != dbPw) System.out.println("로그인 실패!");

		scan.close();
		
	}

}
