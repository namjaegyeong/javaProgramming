package week4;

public class conditionalOperator {
	public static void main(String[] args) {
		
		/**
		 * 메인 메소드(public static void main(String[] args) 안에 코드가 있으셔야 run이 가능합니다.
		 * main을 치고 ctrl + space를 하면 메인 메소드가 자동 완성됩니다.
		 * sysout을 치고 ctrl + space를 하면 System.out.println();이 자동 완성됩니다.
		 */
		
		String str1 = (5 > 3) ? "참" : "거짓";
		String str2 = (5 < 3) ? "참" : "거짓";
		System.out.println("5 > 3 은 " + str1 + "입니다.");
		System.out.println("5 < 3 은 " + str2 + "입니다.");
	}
}
