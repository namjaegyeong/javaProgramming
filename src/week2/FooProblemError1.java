package week2;

/**
 * 
 * 메인(main) 메소드, 자바 키워드, 지역변수 선언 및 초기화 ppt 14쪽 문제
 *
 */

public class FooProblemError1 {
	public static int main(String[] args){
		 System.out.println("Hello World");
		 return	;
	} 
	
	// 정답 b) 반환형이 int이면 무조건 return에 값이 있어야 합니다. 이러면 메인 메소드를 인식하지 못해 컴파일을 할 수 없습니다.
}
