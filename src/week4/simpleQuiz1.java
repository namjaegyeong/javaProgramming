package week4;

public class simpleQuiz1 {
	static int i; 
	public static void main(String[] args) {
		
		/**
		 * 이것을 그대로 실행하면 cannot convert from int to boolean 발생합니다.
		 * if 안에 있는 값은 true(1) of false(0)여야 하기 때문에 오류가 발생합니다.
		 */
		
		if (i) { 
			System.out.println(i); 
		} 
		else { 
			System.out.println(++i); 
		} 
	}
}
