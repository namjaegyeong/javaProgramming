package week4;

public class SimpleQuiz2 {
	static boolean i; 
	public static void main(String[] args) {
		
		/**
		 * 
		 * 4주차-실습강의자료 ppt 17쪽
		 * 
		 * 이것을 그대로 실행하면 cannot convert from int to boolean 발생합니다.
		 * else 안에 있는 ++i은 i의 변수 타입이 int여야 오류가 발생하지 않습니다.
		 * 현재 선언된 static boolean i에서 i 값은 false입니다.
		 * 
		 */
		
		if (i) { 
			System.out.println(i); 
		} 
		else { 
			System.out.println(++i); 
		} 
	}
}
