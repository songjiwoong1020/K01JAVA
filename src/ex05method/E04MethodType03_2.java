package ex05method;

import java.util.Scanner;

public class E04MethodType03_2 {
	
static void inputGugudan(int sNum, int eNum) {
	
	//for문으로 제작한 구구단을 아래와같이 업데이트
	for(int i=sNum; i<=eNum; i++) {
		for(int j=1; j<=9; j++) {
			System.out.printf("%dX%d=%d", i, j, (i*j));
		}
		System.out.println();
	}
}

	public static void main(String[] args) {
		/*
		연습문제] 사용자로부터 2~9사이의 숫자중 2개를 입력받아
		그에 해당하는 구구단을 출력하는 메소드를 작성하시오.
		무조건 첫번째 입력받는수가 작아야한다.
		입력예]
			첫번째숫자 : 3
			두번째숫자 : 12
			3*1=3 3*2=6........
			........
			...................6*9=54
		메소드명 : inputGugudan(int sNum, int eNum)
		 */
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째숫자:");
		int sNum = scanner.nextInt();
		System.out.print("두번째숫자:");
		int eNum = scanner.nextInt();
		inputGugudan(sNum, eNum);
		


	}

}
