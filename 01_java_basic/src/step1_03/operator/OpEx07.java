package step1_03.operator;

/*
 * [ 증감연산자 ]
 * 	+=, -=, *=, /=, %=, 
 * 	++, --
 */

public class OpEx07 {

	public static void main(String[] args) {
		
		int tempData1 = 10;
		System.out.println(tempData1 + 10);
		System.out.println(tempData1);
		
		int tempData2 = 10;
		tempData2 += 100;	// tempData2 = tempData2 + 100;
		System.out.println(tempData2);
		
		int tempData3 = 100;
		tempData3 /= 10;	// tempData3 = tempData3 / 10;
		System.out.println(tempData3);
		
		System.out.println();
		/*
		 * [ 변수++과, ++변수의 차이점 ]
		 *  x = x + 1;
		 *  x+= 1;
		 *  x++;
		 *  ++x;
		 *  
		 *  x = x - 1;
		 *  x -= 1;
		 *  x--;
		 *  --x;
		 */
		int x = 0;
		System.out.println(x++);
		System.out.println(x);
		System.out.println();
		
		int y = 0;
		System.out.println(++y);
		System.out.println(y);
		System.out.println();
	}
}
