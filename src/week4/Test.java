package week4;

public class Test {
	
	/**
	 * 
	 *	str1과 str2는 내용은 동일하지만 각각 new 키워드를 사용해 만들어진 별개의 객체이므로 이 둘의 참조는 다릅니다. 
	 *	문자열의 내용을 비교하려면 equals() 메소드를 사용해야 합니다.
	 *
	 */
	
	 public static void main(String[] args) {
		 
		 String str1 = new String("Java 2 SCJP");
		 String str2 = new String("Java 2 SCJP");
		 
		 System.out.println("== Comparison result : " + (str1==str2));
		 System.out.println("equals() Comparison result : " + str1.equals(str2));
	 }
}
