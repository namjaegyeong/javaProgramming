package week2;

/**
 * 
 * 메인(main) 메소드, 자바 키워드, 지역변수 선언 및 초기화 ppt 31쪽 문제
 * 
 * 지역 변수를 초기화하지 않았으므로 The local variable s may not have been initialized 오류가 출력됩니다.
 * 정답 a) Code does not compile because String s is not initialized 입니다.
 *
 */

public class FooProblemError2 {
	 public static void main(String[] args) {
		 String s;
		 System.out.println("s = " + s);
	}
}
