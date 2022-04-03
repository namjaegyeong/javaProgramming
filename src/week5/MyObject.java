package week5;

public class MyObject {

	public static void main(String[] args) {
		
		Object o = new Object();
		MyObject mo = new MyObject(); // Object는 모든 클래스의 조상 클래스이므로 자식 클래스인 MyObject가 대입이 됩니다. 부모 클래스에 자식 클래스를 대입할 때는 묵시적 형변환이 이루어집니다.
		
		o = mo;
		System.out.println(mo.equals(o));
	}	
}


