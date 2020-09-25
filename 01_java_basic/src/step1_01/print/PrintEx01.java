package step1_01.print; 
// 1) 패키지 선언문은 '항상' 첫줄에 작성한다. 표준이 아니라 법이닷

// 2) 주석(comment) : 설명문을 작성하기 위한 방법으로 프로그램의 실행에 영향을 미치지 않는다. 
// 	2-1) 라인(line)주석 : 한 줄 주석
/*
 * 	2-2) 블록(block)주석 : 여러줄 주석
 * 		 000책임이 000부장의 지시를 받아서
 * 		 아래의 코드를 ~~~게 수정하였음
 * */
/*
 * [ 단축키 ]
 * 3) 에디터 화면 확대 및 축소 : Ctrl+[+], Ctrl+[-]
 * 4) 뒤로 되돌리기(redo) : Ctrl+Z
 *    앞으로 되돌리기(undo) : Ctrl+Y
 * 5) 저장 : Ctrl+S, 저장하지 않았을 경우 파일명 왼쪽에 *표시가 나옴
 * 					(항상 저장하는 습관 권장)
 * 6) 출력문 자동완성 
 * 	6-1) sout + Ctrl + space
 * 	6-2) sysout + Ctrl + space
 * 7) 유용한 단축키
 * 	삭제: Ctrl + D
 * 	복사: Ctrl + Alt + up/down
 * 	이동: Alt + up/down
 */
public class PrintEx01 {
	
	public static void main(String[] args) { // ***메인함수의 {}안에서 프로그래밍을 한다.
		
		// tab으로 들여쓰기 이후 코드 작성. Insert 누른 상태로 작성하지 않도록 주의.
		System.out.println("===================");	// println : 자동 줄바꿈 기능 NewLine
		System.out.println("     메뉴 선택 ");					
		System.out.println("===================");
		System.out.println("1) 로그인(Login)");
		System.out.println("2) 로그아웃(Logout)");
		System.out.println("3) 종료(Exit)");
		
		System.out.println(); // 아무 내용이 없으면 줄바꿈 기능만 적용(한줄 띄기)
		System.out.println();
		System.out.println();
		
		System.out.print("출력문1");	// print : 줄바꿈 기능이 없음 
		System.out.print("출력문2");
		System.out.print("출력문3");	
		System.out.println();
		System.out.println(" -- end -- ");
		
	}
}