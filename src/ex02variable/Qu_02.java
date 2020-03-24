package ex02variable;

public class Qu_02 {
	
	/*
	문제2] 파일명 : Qu_02.java
	국어,영어,수학 점수를 99, 80, 96점으로 입력하고 
	평균점수를 구해서 출력하는 프로그램을 작성하시오.
	출력결과]
	99점,80점,96점의 평균점수는 XXX.XX점입니다.(실수형태)
	99점,80점,96점의 평균점수는 XXX점입니다.(정수형태)
	*/

	public static void main(String[] args) {
//		int g = 99, y = 80, s = 96;
//		double sum = (g+y+s);
//		double avg = sum/3;
//		int avg2 = (int)avg;
//		System.out.printf("99점,80점,96점의 평균점수는 %f점입니다.%n", avg);
//		System.out.printf("99점,80점,96점의 평균점수는 %d점입니다.", avg2);
		
		int kor = 99, eng = 80, mat = 96;
		double avg = (kor+eng+mat)/3.0;
		System.out.printf("%d점, %d점, %d점의 평균점수는 %f점입니다. \n"
				,kor, eng, mat, avg);
		System.out.printf("%d점, %d점, %d점의 평균점수는 %d점입니다."
				,kor, eng, mat, (int)avg);
		
		
		
		


	}

}
