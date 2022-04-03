package week5;

public class MyExplicit {
	
	 public static void main(String[] args) {
		 
		 int i = 0;
		 float f = 1.78f;
		 i = (int)f + i; // f + i를 그대로 int i에 대입하면 오류가 발생합니다. float f를 (int)f로 명시적 형변환을 해줘서 컴파일 오륙가 없도록 합니다.
		 
		 System.out.println("i = " + i);
	}
}