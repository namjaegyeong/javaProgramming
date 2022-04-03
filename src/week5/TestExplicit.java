package week5;

public class TestExplicit{
	
	 public static void main(String[] args)
	 {
		 
		 byte b = 100;
		 short s;
		 char c = 'A';
		 int i;
		 float f = 0.456f;
		 
		 i = (int) f + b; // f를 int로 형변환을 하면 소수점 이하 값들은 다 없어집니다.
		 s = (short) (i + c);
		 
		 System.out.println("i = " + i);
		 System.out.println("s = " + s);
	}
}
