package ex13interface;

/*
추상클래스
-상속을 목적으로 제작되므로 객체생성을 허용하지 않는다.
-추상클래스는 대부분 추상메소드를 포함하고 있으므로, 이를
상속받는 클래스는 반드시 추상메소드를 오버라이딩 해야한다.
-클래스의 상속관계에서의 설계도 역할을 한다.
-객체생성은 할수 없으나 그외 참조변수, 상속등의 모든 기능을
가지고 있다.

추상메소드
-오버라이딩의 목적으로 만들어진다.
-함수의 실행부가 없기때문에 {}를 쓰지않고 함수의 원형에 ;을
붙여준다.
 */

//프로젝트 전체에서 기준이 될수있는 추상클래스 정의
abstract class PersonalNumberStorageAbs{
	
	public abstract void addPersonalInfo(String juminNum, String name);
	
	public abstract  String searchPersonalInfo(String juminNum);
}

/*
사람의 정보를 저장할 용도의 DTO클래스. 혹은 VO클래스라고도 한다.(DTO 혹은 VO를 정보를 저장할 용도라고 보면댈듯)
 */
class PersonalInfoDTO{
	//멤바뱐수
	private String name;
	private String juminNum;
	
	//생성자
	public PersonalInfoDTO(String name, String juminNum) {
		this.name = name;
		this.juminNum = juminNum;
	}
	//getter메소드

	public String getName() {return name;}

	public String getJuminNum() {return juminNum;}
	
}

/*
제공된 추상클래스를 상속하여 사람의정보를 저장하는 기능과,
검색의 기능을 구현한 클래스.
 */
class PersonalNumberStorageExt extends PersonalNumberStorageAbs{
	//멤바뱐수
	PersonalInfoDTO[] personalArr;//정보저장용 객체배열
	int numOfPerOnfo;//입력정보 카운트용 변수
	//생성자
	public PersonalNumberStorageExt(int arrSize) {
		personalArr = new PersonalInfoDTO[arrSize];
		numOfPerOnfo=0;
	}

	/*
	 전달받은 인자를 통해 PersonalInfoDTO 객체를 생성후 객체배열에
	 저장한다.
	 */
	@Override
	public void addPersonalInfo(String juminNum, String name) {
		personalArr[numOfPerOnfo] = new PersonalInfoDTO(name, juminNum);
		numOfPerOnfo++;
	}
	
	/*
	 주민번호를 인자로 전달받아 객체배열에 저장된 정보를 검색한후
	 일치하는 경우에만 이름을 반환한다.
	 */
	@Override
	public String searchPersonalInfo(String juminNum) {
		for(int i=0; i<numOfPerOnfo; i++) {
			if(juminNum.compareTo(personalArr[i].getJuminNum())==0)
				//getter를 통해 이름을 반환한다.
				return personalArr[i].getName();
		}
		return null;//검색결과가 없는경우 null반환
	}
	
}

public class E02AbstractToInterface1 {
	
	public static void main(String[] args) {
		
		PersonalNumberStorageExt storage = new PersonalNumberStorageExt(10);
		
		//정보저장
		storage.addPersonalInfo("901234-2222222", "김태희");
		storage.addPersonalInfo("901234-1111111", "정지훈");
		
		//검색
		System.out.println(storage.searchPersonalInfo("901234-2222222"));
		System.out.println(storage.searchPersonalInfo("901234-1111111"));
		System.out.println(storage.searchPersonalInfo("001024-1090333"));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
