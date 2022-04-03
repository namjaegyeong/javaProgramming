package week2;

public class DefaultValueError {
	
	 public static void main(String[] args) {
		 
		 boolean booleanVar; // 메인 메소드 안에 변수가 선언되었으므로 멤버 변수가 아닌 지역 변수입니다. 지역 변수는 명시적으로 초기화를 해줘야 합니다.
		 System.out.println(booleanVar);
	 }
}