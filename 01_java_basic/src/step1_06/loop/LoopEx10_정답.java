package step1_06.loop;

import java.util.Scanner;

/*
 * # ATM[2단계]
 * 1. 로그인
 * . 로그인 후 재 로그인 불가
 * . 로그아웃 상태에서만 이용 가능
 * 2. 로그아웃
 * . 로그인 후 이용가능
 * 3. 입금
 * . 로그인 후 이용가능
 * 4. 출금
 * . 로그인 후 이용가능
 * 5. 이체
 * . 로그인 후 이용가능
 * 6. 조회
 * . 로그인 후 이용가능
 * 7. 종료
 */

public class LoopEx10_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int usrId=0;
		int usrPw;
		int transMoney;

		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;	
		
		int identifier = -1;						// -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)
		
		boolean isRun = true;
		while(isRun) {
			
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("3.입금");
			System.out.println("4.출금");
			System.out.println("5.이체");
			System.out.println("6.조회");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if(identifier == -1 ) { // 로그아웃상태에서 로그인
					// 아이디와 패스워드를 입력받는다. 
					System.out.print("  아이디를 입력하세요: ");
					usrId = scan.nextInt();
					System.out.print("  비밀번호를 입력하세요: ");
					usrPw = scan.nextInt();
					
					if(usrId == dbAcc1 && usrPw == dbPw1) {		// 유저1이 로그인한 경우 
						identifier = 1;	
						System.out.println("[로그인 성공!]\n");
					} else if (usrId == dbAcc2 && usrPw == dbPw2) {// 유저2가 로그인한 경우 
						identifier = 2;
						System.out.println("[로그인 성공!]\n");
					} else 									// 회원이 아닌 사람이 로그인한경우 
						System.out.println("[오류] 올바르지 않은 회원정보!\n");
				} else {	// 로그인이 이미 되어있는데 또 로그인하는 경우 
					System.out.println("[오류] 로그인 상태입니다. 로그아웃 상태에서만 이용 가능합니다. \n");
				}
			}
			else if(sel == 2) {
				if(identifier == 1 || identifier == 2) { // *****if (identifier != -1)
					identifier = -1; // 로그아웃상태로 변화
					System.out.println("[ 로그아웃 성공 ]\n");
				} else { // 로그인상태가 아니고 이미 로그아웃된 경우 
					System.out.println("[오류] 먼저 로그인 해야 이용 가능합니다. \n");
				}
			}
			else if(sel == 3) { // 입금
				if(identifier != -1) { // 로그인된 상태의 경우 - 입금진행
					System.out.print("[입금] 입금 금액: ");
					transMoney = scan.nextInt();
					
					if (usrId == dbAcc1) // ***이게 identifier가 1인것이랑 같으니까 if(identifier == 1)로 해도됨
						dbMoney1 += transMoney;
					else if(usrId == dbAcc2) // *** if(identifier == 2)
						dbMoney2 += transMoney;
					System.out.println("[ 입금완료 ]\n");
				} else { // identifier가 -1일때 즉, 로그인 안된 상태로 접근 
					System.out.println("[오류] 먼저 로그인 해야 이용 가능합니다. \n");					
				}
			}
			else if(sel == 4) { // 출금
				if(identifier != -1) { // 로그인된 상태의 경우 - 출금진행
					System.out.print("[출금] 출금 금액: ");
					transMoney = scan.nextInt();
					
//					int myMoney;
//					if(usrId == dbAcc1) 
//						myMoney = dbMoney1;
//					else
//						myMoney = dbMoney2;
//					
//					if(transMoney <= myMoney)
//						myMoney -= transMoney;
//					else
//						System.out.println("[오류] 출금 불가 - 잔액 부족!\n");
					
					if (usrId == dbAcc1) { // dbAcc1로 로그인했을때 *** if(identifier == 1)
						if(transMoney <= dbMoney1) {	// 출금금액이 계좌잔액보다 작거나 같을때 출금가능
							dbMoney1 -= transMoney;
							System.out.println("[ 출금완료 ]\n");
						}
						else 
							System.out.println("[오류] 출금 불가 - 잔액 부족!\n");
					}
					else if(usrId == dbAcc2) {
						if(transMoney <= dbMoney2) {
							dbMoney2 -= transMoney;
							System.out.println("[ 출금완료 ]\n");
						}
						else 
							System.out.println("[오류] 출금 불가 - 잔액 부족!\n");
					}
				} else { // identifier가 -1일때 즉, 로그인 안된 상태로 접근 
					System.out.println("[오류] 먼저 로그인 해야 이용 가능합니다.\n");					
				}				
			}
			else if(sel == 5) { // 이체 **** 선생님 답이랑 다름
				if(identifier != -1) {
					
					System.out.print("[이체] 이체할 계좌번호: " );
					int transAcc = scan.nextInt();
					
					if( transAcc == usrId ) {
						System.out.println("[오류] 동일 계좌로는 이체 불가합니다. \n");
					}
					else {
						// 올바른 계좌번호를 입력한경우 
						if(transAcc == dbAcc1 || transAcc == dbAcc2) {
							System.out.print("이체할 금액: ");
							transMoney = scan.nextInt();
							
							if(transAcc == dbAcc1 && dbMoney2 >= transMoney) {
								dbMoney1 += transMoney;
								dbMoney2 -= transMoney;								
								System.out.println("이체 후 잔액: "+dbMoney2);
							} else if (transAcc == dbAcc2 && dbMoney1 >= transMoney) {
								dbMoney2 += transMoney;								
								dbMoney1 -= transMoney;
								System.out.println("이체 후 잔액: "+dbMoney1+"\n");
							} else
								System.out.println("이체할 금액이 부족합니다. \n");
							
						} else {
							System.out.println("[오류] 존재하지 않는 계좌번호를 입력하셨습니다.\n ");
						}
					}
				}	else {
					System.out.println("[오류] 먼저 로그인 해야 이용 가능합니다.\n");					
				}
			}
			else if(sel == 6) { // 조회
				if(identifier != -1) { // 로그인된 상태의 경우 - 조회 진행
					System.out.print("[조회] \n계좌 번호: " + usrId);
					if (usrId == dbAcc1) 
						System.out.println("\n계좌 잔액: "+dbMoney1+"\n");
					else if(usrId == dbAcc2)
						System.out.println("\n계좌 잔액: "+dbMoney2+"\n");
				} else { // identifier가 -1일때 즉, 로그인 안된 상태로 접근 
					System.out.println("[오류] 먼저 로그인 해야 이용 가능합니다.\n");					
				}
			}
			else if(sel == 0) {
				isRun = false;
				System.out.println("[ 프로그램 종료 ]\n");
			}
		}
		scan.close();
	}
}

/* 선생님답
else if(sel == 5) {
	if(identifier != -1) {
		System.out.print("이체할 계좌번호 입력 : ");
		int acc = scan.nextInt();
		
		if(identifier == 1) {
			if(acc == dbAcc2) {
				System.out.print("이체할 금액 입력 : ");
				int money = scan.nextInt();
				
				if(money <= dbMoney1) {
					dbMoney1 = dbMoney1 - money;
					dbMoney2 = dbMoney2 + money;
					System.out.println("이체를 완료하였습니다.");
				}else {
					System.out.println("계좌잔액이 부족합니다.");
				}
			}else {
				System.out.println("계좌번호를 확인해주세요.");
			}
		}
		else if(identifier == 2) {
			if(acc == dbAcc1) {
				System.out.print("이체할 금액 입력 : ");
				int money = scan.nextInt();
				
				if(money <= dbMoney2) {
					dbMoney2 = dbMoney2 - money;
					dbMoney1 = dbMoney1 + money;
					System.out.println("이체를 완료하였습니다.");
				}else {
					System.out.println("계좌잔액이 부족합니다.");
				}
			}else {
				System.out.println("계좌번호를 확인해주세요.");
			}
		}
	}else {
		System.out.println("로그인 후 이용가능합니다.");
	}				
}
else if(sel == 6) {
	if(identifier != -1) {
		System.out.println("dbMoney1 = " + dbMoney1 + "원");
		System.out.println("dbMoney2 = " + dbMoney2 + "원");
	}else {
		System.out.println("로그인 후 이용가능합니다.");
	}				
}*/
