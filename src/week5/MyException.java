package week5;

/**
 * 
 * 단순히 Exception 클래스로부터 상속 받는 사용자 정의 예외 클래스(MyExceptionTest) 를 만드는 예제입니다.
 *
 */

@SuppressWarnings("serial") // The serializable class MyExceptionTest does not declare a static final serialVersionUID field of type long 오류를 없애기 위해 선언한 어노테이션입니다.
class MyExceptionTest extends Exception { //  Exception 클래스로부터 상속 받는 사용자 정의 예외 클래스(MyExceptionTest)를 만듭니다.
	
	String name = "My Exception";
	void printInfo(String msg) {
		
		System.out.print(name + " : ");
		System.out.println(msg);
	}
}

@SuppressWarnings("serial") // The serializable class MyExceptionTest does not declare a static final serialVersionUID field of type long 오류를 없애기 위해 선언한 어노테이션입니다.
class MyExceptionSubTest extends MyExceptionTest { // 사용자 정의 예외 클래스(MyExceptionTest)로부터 상속 받는  MyExceptionSubTest를 만듭니다.
	
	String name = "MyExceptionSub";
	void printUse() {
		 System.out.println("How to use");
	}
}
	
public class MyException{

	public static void main(String[] args) {
		
		MyExceptionTest e1 = new MyExceptionTest(); // 예외 클래스의 인스턴스를 만듭니다.
		MyExceptionSubTest e2 = new MyExceptionSubTest();
		e1.printInfo("오류 발생!"); // 참조변수. 메소드 형식으로 MyExceptionTest 클래스의 메소드 호출만 했습니다.
		e2.printUse(); // 참조변수. 메소드 형식으로 MyExceptionSubTest 클래스의 메소드 호출만 했습니다.
	}
}
