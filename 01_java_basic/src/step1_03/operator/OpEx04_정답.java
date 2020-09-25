package step1_03.operator;

public class OpEx04_정답 {

	public static void main(String[] args) {
		
		//예) 점수가 60점 이상이면 true 출력
        int score = 30;
        System.out.println(score >= 60);
        
        //문제1) 15가 3의 배수이면 true 출력
        //힌트) 숫자를 3으로 나눈 나머지가 0이면 3의 배수
        System.out.println(15%3==0);
        
        //문제2) 100이 짝수이면 true 출력
        //힌트) 숫자를 2로 나눈 나머지가 0이면 짝수
        //      숫자를 2로 나눈 나머지가 1이면 홀수
        System.out.println(100%2==0);

        //*****************************
        //문제3)아래돈중 1000원짜리 이상화폐를 제외한 1000원짜리가 3장 이상이면 true 출력
        int money = 178600;
        
        // 첫풀이
//        money = money - 50000*(money/50000); // 28600
//        money = money - 10000*(money/10000); // 8600
//        money = money - 5000*(money/5000);   // 3600
//        System.out.println(money/1000 >= 3);

        // 두번째
        money = money % 50000;
        money = money % 10000;
        money = money % 5000; // ***** 이거만 해도됨! 
        System.out.println(money/1000 >= 3);
        
        // 선생님 정답
        System.out.println((money%5000)/1000 >= 3);
        
	}
}
