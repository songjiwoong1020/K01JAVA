package ex10accessmodifier.sub;

class DefaultClass2{
	
	void myFunc() {
		System.out.println("DefaultClass2클래스의 myFunc()메소드 호출");
	}
}

public class E01AccessModifier2 {

	private int privateval;
	int defaultVal;
	public int publicVal;
	
	private void privateMethod() {
//		privateVar = 400;
		System.out.println("privateMethod() 메소드 호출");
	}
	void defaultMethod() {
		defaultVal = 500;
		System.out.println("defaultMethod() 메소드 호출");
	}
	public void publicMethod() {
		publicVal = 600;
		System.out.println("publicMethod() 메소드 호출");
	}
}