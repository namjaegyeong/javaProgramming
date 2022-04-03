package week4;

public class InstanceofTest {
	
	public static void main(String[] args) {
		
		/**
		 * 
		 * 인스턴스와 객체의 정의가 무엇인지 헷갈릴 수가 있습니다.
		 * 객체 지향 프로그래밍 공부하시면서 붕어빵과 붕어빵 틀에 대한 비유는 많이 들어보셨을 겁니다.
		 * 붕어빵 틀 : 클래스, 붕어빵 : 객체, 붕어빵 틀로 찍어낸 각각의 붕어빵 : 인스턴스 입니다.
		 * 관련 주소 URL : https://computer-science-student.tistory.com/319
		 * 
		 */
		
		 MySuper mySuper = new MySuper(); // 부모 클래스의 인스턴스를 생성합니다.
		 MySub mySub = new MySub(); // 자식 클래스의 인스턴스를 생성합니다.
		 
		 System.out.println(mySub instanceof MySub); // mySub는 자식 클래스의 인스턴스입니다. 자식 인스턴스는 자식 객체로부터 파생되었습니다. true입니다.
		 System.out.println(mySub instanceof MySuper); // mySub는 자식 클래스의 인스턴스입니다. 자식 클래스는 부모 클래스의 내용을 다 가지고 있습니다. true입니다.
		 System.out.println(mySuper instanceof MySuper); // mySuper는 부모 클래스의 인스턴스입니다. 부모 인스턴스는 부모 객체로부터 파생되었습니다. true입니다.
		 System.out.println(mySuper instanceof MySub); 
		 // mySuper는 부모 클래스의 인스턴스입니다. 자식 클래스는 부모 클래스의 내용을 다 가지고 있지만 부모 클래스는 자식 클래스의 내용을 다 가지고 있지 않습니다. false입니다.
	}
}

class MySuper {
	
	 void methodSuper() {}
} // 부모 클래스 입니다.

class MySub extends MySuper {
	
	 void methodSub(){}
} // 부모 클래스로부터 상속 받은 자식 클래스입니다.