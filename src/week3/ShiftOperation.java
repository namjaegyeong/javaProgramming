package week3;

public class ShiftOperation {
	
	 public static void main(String[] args) {
		 
		 int l1 = 128 << 2;
		 int l2 = -128 << 2;
		 int r1 = 128 >> 2;
		 int r2 = -128 >> 2;
		 int ur1 = 128 >>> 2;
		 int ur2 = -128 >>> 2;
		 
		 System.out.println("128 << 2 = " + l1);
		 System.out.println("-128 << 2 = " + l2);
		 System.out.println("128 >> 2 = " + r1);
		 System.out.println("-128 >> 2 = " + r2);
		 System.out.println("128 >>> 2 = " + ur1);
		 System.out.println("-128 >>> 2 = " + ur2);
	}
}