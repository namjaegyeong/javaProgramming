package week4;

public class OpTest {
	
	 public static void main(String[] args) {
		 
		 int i1 = 5;
		 int i2 = 10;
		 boolean b1 = true;
		 
		 System.out.println(i1 >= i2 & b1);
		 System.out.println(i1 >= i2 | b1);
		 System.out.println(!(i1 >= i2) & b1);
		 System.out.println(false | !b1 & i1 <= i2);
	 }
}