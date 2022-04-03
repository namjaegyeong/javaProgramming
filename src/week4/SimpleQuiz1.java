package week4;

public class SimpleQuiz1 {
	static int i; 
	public static void main(String[] args) {
		
		/**
		 * 
		 * 4주차-실습강의자료 ppt 17쪽
		 * 
		 * 이것을 그대로 실행하면 cannot convert from int to boolean 발생합니다.
		 * if 안에 있는 값은 true of false여야 하기 때문에 오류가 발생합니다.
		 * 현재 선언된 static int i에서 i 값은 0입니다.
		 * 
		 */
		
		System.out.println(i);
		
		if (i) { 
			System.out.println(i); 
		} 
		else { 
			System.out.println(++i); 
		} 
	}
}
