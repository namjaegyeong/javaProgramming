package week4;

public class bitwiseOperator {

	public static int leftShift(int i, int j) { 
			return i << j; 
	} 
	
	public static void main(String args[]) { 
		
		/**
		 *  leftShift 메소드 앞에 static을 선언하셔야 
		 *  메인 메소드 안에 객체 생성 없이 해당 메소드 호출이 가능합니다. 
		 *  */
		
			int i = 4, j = 2; 
			i = leftShift(i,j); 
			System.out.println(i); 
	}
	
}
