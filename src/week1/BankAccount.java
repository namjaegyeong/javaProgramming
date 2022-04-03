package week1;

/**
 * 
 * 메인 메소드 안에 BankAccount 클래스의 인스턴스를 생성하고 참조변수.메소드 형식으로 printInfo 메소드를 호출합니다.
 *
 */

public class BankAccount {
	
	 String name = "홍길동";
	 int accountNumber = 123456;
	 
	 void printInfo() {
	 System.out.println(name);
	 System.out.println(accountNumber);
	 
	 }
	 
	 public static void main(String[] args) {
		 BankAccount client = new BankAccount();
		 client.printInfo();
	 }
}
