package week4;


class leftShiftClass {
	
	public int leftShift(int i, int j) { 
		return i << j; 
	} 
}

public class bitwiseOperatorAnotherClass {
	
	/**
	 * 다른 클래스에 leftShift 메소드가 있을 경우,
	 * 해당 클래스의 객체를 생성하고 참조변수.메소드(인자값1, 인자값2) 이런 식으로 대입하고 출력을 합니다.
	 * 관련 내용 URL : https://jenny-daru.tistory.com/31
	 *  */

	public static void main(String args[]) { 
		
		leftShiftClass i = new leftShiftClass(); //인스턴스 생성, 인스턴스 혹은 객체라고 합니다.
		System.out.println(i.leftShift(4, 2)); 
	}
	
}