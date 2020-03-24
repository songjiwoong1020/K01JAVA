package common;

public class Student extends Person {
	
	public String stNumber;
	
	public Student(String name, int age, String stNumber) {
		super(name, age);
		this.stNumber = stNumber;
	}
	@Override
	public String getInfo() {
		return super.getInfo() +", 학번:" + stNumber;
	}
	
	@Override
	public void showInfo() {
		System.out.println("학생의 정보");
		System.out.println(getInfo());
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((stNumber == null) ? 0 : stNumber.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		Student student1 = (Student)obj;
		System.out.println("오버라이딩 한 equals()메소드 호출됨");
		if(student1.name.equals(obj)) {
			return true;
		}else {
			return false;
		}
	}
	
	
	

}
