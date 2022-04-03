package week2;

/**
 * 
 * 메인(main) 메소드, 자바 키워드, 지역변수 선언 및 초기화 ppt 15쪽 문제
 * 
 * 명령 프롬프트로 java 명령어를 사용한 메인 메소드의 인자에 값 넣는 방법
 * 
 * 1, public class Test부터 다 복사합니다.
 * 2, 메모장(Notepad)를 키고 복사한 내용을 붙여넣기 한 다음, 바탕 화면에 확장자 명을 .java로 해서 저장합니다.(Test.java)
 * 3, 시작 메뉴 -> cmd를 쳐서 명령 프롬프트(Command Prompt)를 띄웁니다.
 * 4, cd DeskTop -> java Test.java 2 2 2 2 명령어를 치시면 콘솔에 결과가 출력이 됩니다.
 * 5, 경로에 Test.java가 없을 경우 Could not find or load main class Test.java 뜨기 때문에 경로를 잘 잡으셔야 합니다. 
 * 
 * IDE 상에서 RUN을 하면 오류가 발생합니다. 반드시 명령 프롬프트에서 경로 잘 잡고 java Test.java 2 2 2 2 실행하셔서 결과를 확인해보세요.
 * 
 * 관련 내용 URL : https://elecs.tistory.com/40 (java Test.java 2 2 2 2 를 사용하기 위해 JDK 환경 변수 설정 방법과 cmd를 통한 java 명령어 사용 절차)
 * 				 https://gocoder.tistory.com/1491 (cd 사용 방법)
 */

public class MainArgsProblem {
	 public static void main(String[] args) {
		String foo = args[1];
		String bar = args[2];
		String baz = args[3];
		System.out.println("baz = " + baz); 		 
	 }
}
