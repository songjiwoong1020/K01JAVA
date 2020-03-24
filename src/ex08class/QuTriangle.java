/*
문제2) 파일명 : QuTriangle.java
밑변과 높이 정보를 저장할 수 있는 Triangle클래스를 정의해보자. init메소드를 통해 밑변과 높이를 초기화한다.
그리고 밑변과 높이를 변경시킬수 있는 메소드와 삼각형의 넓이를 계산해서 반환하는 메소드도 함께 정의해보자.

메인메소드 샘플코드]
public static void main(String[] args)
{
	Triangle t = new Triangle();
	t.init(10, 17); //밑변10, 높이17로 초기화
	System.out.println("삼각형의 넓이 : " + t.getArea());
	t.getBottom(50);//밑변 50으로 변경
	t.getHeight(14);//높이 14로 변경
	System.out.println("삼각형의 넓이 : " + t.getArea());
}

 */
package ex08class;
//  내꺼
//class Triangle{
//	
//	double Bottom;
//	double Height;
//	
//	void init(double a, double b) {
//		Bottom=a;
//		Height=b;
//	}
//	public double getArea () {
//		double area = (Bottom*Height)/2;
//		return area;
//	}
//	public double getBottom(double a) {
//		Bottom=a;
//		return Bottom;
//	}
//	public double getHeight(double a) {
//		Height=a;
//		return Height;
//	}
//	
//}
class Triangle{
	//멤버변수
	//밑변
	//높이
	int bottom;//밑변
	int height;//높이
	//밑변과 높이를 초기화하는 메소드
	public void init(int bot, int hei) {
		bottom = bot;
		height = hei;
	}
	//삼각형의 넓이를 계산해서 반환하는 멤버메소드
	public double getArea() {
		return bottom*height*0.5;
	}
	public void getBottom(int bottom) {
		this.bottom = bottom;
	}
	public void getHeight(int height) {
		this.height = height;


	}
}
public class QuTriangle {

	public static void main(String[] args) {
		
		Triangle t = new Triangle();
		t.init(10, 17); //밑변10, 높이17로 초기화
		System.out.println("삼각형의 넓이 : " + t.getArea());
		t.getBottom(50);//밑변 50으로 변경
		t.getHeight(14);//높이 14로 변경
		System.out.println("삼각형의 넓이 : " + t.getArea());

	}

}
