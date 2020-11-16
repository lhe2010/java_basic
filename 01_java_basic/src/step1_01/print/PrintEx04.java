// 2020-11-16 월 2교시 강의 - 날짜/형식(포맷)
package step1_01.print;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *  # Date
 * 	[1] 날짜 및 시간 출력 서식 지정 방법
 *  	. 날짜 및 시간 서식에 사용되는 영문자를 제외한 나머지 문자는 입력하는 그대로 출력된다.
 *  	. Date date = new Date();
 *  	. SimpleDateFormat sdf = new SimpleDateFormat("날짜 및 시간 서식");
 *  [2] 날짜 및 시간 서식 적용 방법
 *  	. sdf.format(date);
 *  [3] 날짜 및 시작 출력 서식 문자의 종류
 *  	. 구글에서 "simpledateformat 날짜 형식" 라고 검색하기
 */ 

public class PrintEx04 {

	public static void main(String[] args) {
		Date date = new Date(); // TimeStamp 
		System.out.println(date);
		
		/*System.out.println(date.getYear()); 	// 1900년 이후부터 지나온 연수를 반환 
		System.out.println(1900 + date.getYear()); 
		System.out.println(date.getMonth());  	// 0~11 이라 매번 +1해줘야함 
		System.out.println(1 + date.getMonth());  	// 0~11 이라 매번 +1해줘야함 
		System.out.println(date.getDay());  
		
		date.setYear(2020);
		date.setMonth(11);
		System.out.println(date);*/

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 a hh시 mm분 ss초");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("yyyy.MM.dd(E) hh:mm");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("yyyy.MM.dd");
		System.out.println(sdf.format(date));
		
		// 이슈 : DB에 넣을 때, date객체로 넣고 사용자한테만 sdf로 보여줄건지,
		// 						String 문자열로 애초에 둘다 넣을지 고민해봐야함
		System.out.println("=============================================");
		
//		int time = System.currentTimeMillis(); 	// 정수 범위가 int보다 높아서 에러발생 
		long time = System.currentTimeMillis(); 	
		System.out.println(time);				// 1970년 1월 1일부터 지금까지 지나온 단위 
		System.out.println(sdf.format(time));
		System.out.println("=============================================");
		
		// 숫자 서식 지정
		int number = 1000000000;
		NumberFormat nf = NumberFormat.getNumberInstance(); // 천단위 구분 기호
		System.out.println(nf.format(number));
		
		nf = NumberFormat.getCurrencyInstance();			// 통화기호
		System.out.println(nf.format(number));
		
		nf = NumberFormat.getPercentInstance();				// 백분율
		System.out.println(nf.format(number));	
		System.out.println("=============================================");
		
		// DecimalFormat df = new DecimalFormat("숫자서식");// 위에 보다 많이 쓰는 것
		// 숫자서식 : "#,##0"을 쓰고 필요한 문자를 앞 또는 뒤에 붙여준다. 
		// DecimalFormat으로 바꾸는 순간 더이상 int아니다. -> 화면에 보여줄때만 이용
		DecimalFormat df = new DecimalFormat("#,##0");		// 천단위 구분 기호
		System.out.println(df.format(number));
		
		df = new DecimalFormat("$#,##0");		
		System.out.println(df.format(number));
			
		df = new DecimalFormat("#,##0%");		// 백분율
		System.out.println(df.format(number));
		
		df = new DecimalFormat("#,##0.0");		// 소수점 1자리
		System.out.println(df.format(10000.1234));
		
		df = new DecimalFormat("#,##0.00");		// 소수점 2자리
		System.out.println(df.format(10000.1234));
		System.out.println("=============================================");
		
		// String.format("형식"); 				// 문자열의 형식을 지정한다.
		String st = String.format("test : %d , %d , %d , %d", 1,3,5,7);
		System.out.println(st);
		
		st = String.format("test : %d / %d / %d / %d", 1,3,5,7);
		System.out.println(st);
		
		st = String.format("=== %d, %d, %d, %d ===", 1,3,5,7);
		System.out.println(st);
	}
}
/*
2020-11-16 정리
date 객체(timestamp)란?
SimpleDateFormat란?
DecimalFormat이란?
웹개발에서 날짜형식을 date 클래스로 가질 것인가 String으로 가질 것인가
DecimalFormat은 보통 화면에서 보여줄때 웹언어로 처리함
자바 API보는 연습 */