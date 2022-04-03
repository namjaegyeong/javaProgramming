package week2;

public class DefaultValue
{
	/**
	 * 
	 * 명시적인 초기화 구문이 없더라도 인스턴스를 생성할 때 멤버 변수들은 자동으로 초기값을 할당 받습니다.
	 * 
	 */
	
	 boolean booleanVar;
	 byte byteVar;
	 char charVar;
	 short shortVar;
	 int intVar;
	 long longVar;
	 float floatVar;
	 double doubleVar;
	 String stringVar;
	 
	 public static void main(String[] args) {
		 
		 DefaultValue dv = new DefaultValue(); // DefaultValue 클래스에 대한 인스턴스를 생성합니다.

		 System.out.println(dv.booleanVar);
		 System.out.println(dv.byteVar);
		 System.out.println(dv.charVar);
		 System.out.println(dv.shortVar);
		 System.out.println(dv.intVar);
		 System.out.println(dv.longVar);
		 System.out.println(dv.floatVar);
		 System.out.println(dv.doubleVar);
		 System.out.println(dv.stringVar);
	 }
}