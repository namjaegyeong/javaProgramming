package week5;

public class MyObject2 {
	
	 public static void main(String[] args) {
		 
		 MyObject2 mo = new MyObject2();
		 Object o = new Object();
		 
		 mo = (MyObject2)o; 
		 // 자식 클래스에 부모 클래스를 형변환 없이 대입하려 할 때 컴파일 오류가 발생합니다. 명시적으로 형변환을 하면 컴파일 오류는 없어지지만 RUN할 때 런타임 오류가 발생합니다. 
		 // 자식 클래스에 부모 클래스를 대입하려 할 때 런타임 오류가 발생합니다.
		 System.out.println(mo.equals(o));
	 }

}
