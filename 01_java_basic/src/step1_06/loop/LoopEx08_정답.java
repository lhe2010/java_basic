package step1_06.loop;

import java.util.Scanner;

/*
 * # ATM[2단계]
 * 1. 로그인
 * . 로그인 후 재 로그인 불가
 * . 로그아웃 상태에서만 이용 가능
 * 2. 로그아웃
 * . 로그인 후 이용가능
 */

public class LoopEx08_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int usrId, usrPw;
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		
		int identifier = -1;						// -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)
		
		boolean isRun = true;
		while(isRun) {
			
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {				// 사용자가 로그인 메뉴 선택
				if(identifier == -1) { 	// 로그아웃 상태에서만 이용 가능 
					// 아이디와 패스워드를 입력받는다. 
					System.out.print("  아이디를 입력하세요: ");
					usrId = scan.nextInt();
					System.out.print("  비밀번호를 입력하세요: ");
					usrPw = scan.nextInt();
					
					if(usrId == dbAcc1 && usrPw == dbPw1) {		// 유저1이 로그인한 경우 
						identifier = 1;	
						System.out.println("[로그인 성공!]");
					} else if (usrId == dbAcc2 && usrPw == dbPw2) {// 유저2가 로그인한 경우 
						identifier = 2;
						System.out.println("[로그인 성공!]");
					} else 									// 회원이 아닌 사람이 로그인한경우 
						System.out.println("[오류] 올바르지 않은 회원정보!");
					
				} else { // 로그인이 이미 되어있는데 또 로그인하는 경우 
					System.out.println("[오류] 로그인 상태입니다. 로그아웃 상태에서만 이용 가능합니다. ");
				}
			}
			else if(sel == 2) {
				if( identifier == 1 || identifier == 2) { // 로그인 상태인경우 
					identifier = -1;
					System.out.println("[로그아웃 성공]");
				} else { // 로그인 안된상태의 경우 
					System.out.println("[오류] 먼저 로그인 해야합니다. ");
				}
			}
			else if(sel == 0) {
				isRun = false;
				System.out.println("[프로그램 종료]");
			}
			System.out.println("=============================");
		}


	}

}
