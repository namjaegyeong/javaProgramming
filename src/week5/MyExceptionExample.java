package week5;

/**
 * 사용자 정의 예외 클래스(MyExceptionTest) 도 만들고 try catch로 간단하게 예외 처리를 해보았습니다.
 * 
 * 관련 URL 주소 : https://devbox.tistory.com/entry/Java-%EC%98%88%EC%99%B8-%EB%A7%8C%EB%93%A4%EA%B8%B0 
 * 				( 예외 만들기 예제 )
 *				https://lnsideout.tistory.com/entry/JAVA-etoString-egetMessage-eprintStackTrace-%EC%98%88%EC%99%B8%EC%B2%98%EB%A6%AC 
 *				( e.getMessage(),e.printStackTrace() 설명 )
 */

@SuppressWarnings("serial") // The serializable class MyExceptionTest does not declare a static final serialVersionUID field of type long 오류를 없애기 위해 선언한 어노테이션입니다.
class ExceptionExample extends Exception { //  Exception 클래스로부터 상속 받는 사용자 정의 예외 클래스(ExceptionExample)를 만듭니다.
	
	public ExceptionExample(String msg) {
		super(msg); // 부모 클래스인 Exception의 생성자를 호출합니다. ExceptionExample 클래스의 인스턴스를 만들면서 인자에 문자열을 넣을 수 있습니다. 해당 문자열을 불러오려면 .getMessage() 메소드가 필요합니다.
	}
}

public class MyExceptionExample {
	
	static void startError(boolean Error) throws ExceptionExample{ // throws ExceptionExample로 예외 예약을 합니다.
		if(Error) { // Error가 true일 경우,
			throw new ExceptionExample("오류가 발생했습니다."); // ExceptionExample 클래스의 인스턴스를 만들면서 "오류가 발생했습니다."라는 인자를 넣고 예외를 발생시킵니다.
		}
	}
	
	public static void main(String[] args) {

		try {
			startError(true); // true이면 예외가 발생하고 false일 경우는 예외가 발생하지 않습니다.
		} catch(ExceptionExample e) { // 예외를 catch 합니다.
			System.out.println("에러 메시지 : " + e.getMessage()); //  getMessage()로 ExceptionExample 클래스의 인스턴스의 msg를 가져옵니다.
			e.printStackTrace(); // 콘솔 창에 오류가 어디서 발생했는지 추적하고 출력합니다.
		}
		
	}
}
