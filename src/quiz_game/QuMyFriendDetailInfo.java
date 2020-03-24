package quiz_game;

class MyFriendInfo{
	
	private String name;
	int age;
	
	//인자생성자
	MyFriendInfo(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public void ShowMyFriendInfo() {
		System.out.println("이름: "+ name);
		System.out.println("나이: "+ age);
	}
}

//친구의 기본정보 외 상세정보를 저장할 클래스
class MyFriendDetailInfo extends MyFriendInfo{
	private String addr;
  	private String phone;
  	
  	//인자생성자
  	MyFriendDetailInfo(String name, int age, String addr, String phone){
  		super(name, age);
  		this.addr=addr;
  		this.phone=phone;
  	}
  	
	public void ShowMyFriendDetailInfo(){
		/*
		부모클래스의 멤버메소드르 호출할때 명시적으로 super를
		붙여주는것이 좋다
		 */
		super.ShowMyFriendInfo();
		System.out.println("주소: "+ addr);
		System.out.println("전화: "+ phone);
	}
}

public class QuMyFriendDetailInfo {

	public static void main(String[] args) {

		MyFriendDetailInfo mfdi = new MyFriendDetailInfo("이순신", 100, "성균관", "010-1000-8888");
		mfdi.ShowMyFriendDetailInfo();

	}

}
