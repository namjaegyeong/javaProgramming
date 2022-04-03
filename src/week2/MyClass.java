package week2;

interface MyInterface {
	void myMethod();
}

/**
 * 
 * 인터페이스 사용은 상속과 비슷합니다. 이 예제를 잘 이해하기 위해서는 상속과 메소드 오버라이딩에 대한 이해가 있어야 합니다.
 * MyClass는 MyInterface를 상속을 받았습니다. MyInterface에서도 myMethod()라는 메소드가 있고 MyClass에서도 myMethod()라는 메소드가 있습니다.
 * MyInterface에서 메소드를 비워 두고, MyClass에서 메소드를 재정의해서 쓸 수 있습니다. 이것을 메소드 오버라이딩이라고 합니다. 실무에서 많이 쓰이고 있습니다.
 * MyInterface로 인스턴스를 생성할 수 없습니다.
 *
 */

public class MyClass implements MyInterface {
	
	@Override // 인터페이스나 부모 클래스의 메소드를 상속 받아서 메소드 오버라이딩을 구현할 때 @Override를 씁니다. 안써도 오류는 발생하지 않습니다.
	public void myMethod() {	 
		System.out.println("myMethod is implemented");
	}
	
	public static void main(String[] args) {	 
		MyClass mc = new MyClass(); 
		mc. myMethod();
	}
} 