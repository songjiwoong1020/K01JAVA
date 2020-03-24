/*
문제3) QuRectangleMain.java
정사각형을 의미하는 Square클래스와 직사각형을 의미하는 Rectangle클래스를 정의하고자 한다.
그런데 정사각형은 직사각형의 일종이므로, 다음의 형태로 클래스의 상속관계를 구성하고자 한다. 아래의 소스를 참조하여 구현하시오. 

실행결과]
직사각형 면적: 12
정사각형 면적: 49
 */
package ex12inheritance;
//직사각형을 표현한 클래스
class Rectangle{
	
	int dLine;
	int uLine;
	int Line;
	
	Rectangle(int a, int b){
		dLine = a;
		uLine = b;
	}
	
	Rectangle(int a) {
		Line = a;
	}

	void showAreaInfo(){
		System.out.println("직사각형 면적:"+(dLine*uLine));
	}

} 
//정사각형을 표현한 클래스(정사각형은 직사각형의 일종)
class Square extends Rectangle{

	Square(int a){
		super(a);
	}
//	public Square(int a) {
//		super(a, a);
//	}
	
	/*
	넓이를 구하는 공식은 동일하나 부모는 직사각형, 자식은 정사각형의
	면적을 출력해야 하므로 오버라이딩 해야한다.
	 */
	@Override
	void showAreaInfo(){
		System.out.println("정사각형 면적:"+(Line*Line));
	}
	
	
	
} 
public class QuRectangleMain {

	public static void main(String[] args) {
       	Rectangle rec = new Rectangle(4, 3);
       	rec.showAreaInfo();
 
       	Square sqr = new Square(7);
       	sqr.showAreaInfo();
	}

}
