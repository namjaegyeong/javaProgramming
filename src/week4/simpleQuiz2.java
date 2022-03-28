package week4;

public class simpleQuiz2 {
	static boolean i; 
	public static void main(String[] args) {
		
		/**
		 * 이것을 그대로 실행하면 cannot convert from int to boolean 발생합니다.
		 * else 안에 있는 ++i은 i의 변수 타입이 int여야 오류가 발생하지 않습니다.
		 */
		
		if (i) { 
			System.out.println(i); 
		} 
		else { 
			System.out.println(++i); 
		} 
	}
}
