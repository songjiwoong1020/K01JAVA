package ex02variable;

public class Qu_03 {
	
	/*
	문제3] 파일명 : Qu_03.java
	반지름이 10인 원의 넓이를 구해 출력하시오.
	단, 면애의 타입을 int, float, double형
	세가지로 선언하여 각각 출력해야한다.
	변수명] 
	int형 : area_int
	float형 : area_float
	double형 : area_double
	공식]
	원의넓이 = 반지름 * 반지름 * 3.14
	*/

	public static void main(String[] args) {

//		double area_double = (10*10*3.14) ;
//		int area_int = (int)area_double;
//		float area_float = (float)area_double;
//		
//		System.out.println(area_int);
//		System.out.println(area_float);
//		System.out.println(area_double);

		int r = 10;
		final double PI = 3.14;
		int area_int = (int)(r*r*PI);
		float area_float = (float)(r*r*PI);
		double area_double = r*r*PI;
		
		System.out.printf("int형:%d%nfloat형:%f%ndouble형:%f"
				, area_int, area_float, area_double);

	}

}
