package week2;

public class StringArrayProblem {
	
	/**
	 * 
	 * 메인(main) 메소드, 자바 키워드, 지역변수 선언 및 초기화 ppt 33쪽 문제
	 * 
	 * 배열의 차원이 같아야지 대입을 할 수 있습니다.
	 * 1차원 배열에 1차원 배열을 대입할 수 있지만, 1차원 배열에 2차원 배열을 대입할 수 없습니다.
	 */
	
	public static void main(String[] args) {
		
		byte[] array1 = new byte[5]; // 배열 선언과 동시에 초기화를 해줘야 배열을 사용할 수 있습니다.
		byte array2[] = new byte[5];
		byte array3[][] = new byte[5][];
		byte[][] array4 = new byte[5][]; 
		
		array2 = array1; 
		array2 = array3;
		array2 = array4;
	}
}
