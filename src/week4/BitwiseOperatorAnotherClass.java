package week4;



public class BitwiseOperatorAnotherClass {
	
	/**
	 * leftShift 메소드 앞에 static이 없습니다. 해당 메소드를 메인 메소드에 사용하기 위해서 인스턴스를 생성해야 합니다.
	 * 메인 메소드에 bitwiseOperatorAnotherClass 클래스의 인스턴스를 생성했습니다.
	 * 참조변수.메소드(인자값1, 인자값2) 이런 식으로 대입하고 출력을 합니다.
	 * 
	 */
	
	public int leftShift(int i, int j) { 
		return i << j; 
	} 

	public static void main(String args[]) { 
		
		BitwiseOperatorAnotherClass i = new BitwiseOperatorAnotherClass(); //  BitwiseOperatorAnotherClass 클래스의 인스턴스를 생성합니다.
		System.out.println(i.leftShift(4, 2)); 
	}
	
}