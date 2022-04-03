package week2;

public class MainArgs {
	 public static void main(String[] args) {
		 
		 /**
		  * 메인메소드는 자바 어플리케이션 실행 시 제일 먼저 동작하며 어느 객체에서든 접근할 수 있으며 자바가 컴파일 되는 순간 정의 되는 돌려주는 값이 없는 함수입니다.
		  * 관련 내용 URL : https://javacpro.tistory.com/11 
		  */
		 
		 args = new String[3]; //2개의 저장 공간을 가진 배열을 초기화합니다.
		 args[0] = "blue"; //배열의 첫 번째 공간에 데이터 입력합니다.
		 args[1] = "green"; //배열의 두 번째 공간에 데이터 입력합니다.
		 args[2] = "red"; //배열의 세 번째 공간에 데이터 입력합니다.
		 
		 System.out.println("args[0] = " + args[0]);
		 System.out.println("args[1] = " + args[1]);
		 
	 }
}
