package week5;

public class TestImplicit{
	
	 public static void main(String[] args)
	 {
		 
		 byte b = 123;
		 short s = 321;
		 char c = 'A';
		 int i;
		 long l;
		 float f = 0.456f;
		 
		 i = b + s;
		 l = i + c;
		 f += b;
		 
		 System.out.println("i = " + i);
		 System.out.println("l = " + l);
		 System.out.println("f = " + f);
	}
}
