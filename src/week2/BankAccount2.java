package week2;

public class BankAccount2 {
	 String name;
	 int accountNumber;
	 
	 void setInfo(String clientName, int clientAccount) {
		 name = clientName;
		 accountNumber = clientAccount;
	 } // 이 메소드는 생성자의 역할을 합니다. 멤버 변수를 초기화를 합니다.
	 
	 void printInfo() {
		 System.out.println(name);
		 System.out.println(accountNumber);
	 } // 이 메소드는 멤버 변수들을 출력해주는 역할입니다.
	 
	 public static void main(String[] args) {
		 BankAccount2 client = new BankAccount2(); // 메인 메소드에서 BankAccount2 클래스의 인스턴스를 생성합니다.
		 client.setInfo("홍길동", 123456); // 참조변수.메소드 형식으로 인자에 값을 넣고 메소드를 호출합니다.
		 client.printInfo(); // 참조변수.메소드 형식으로 메소드를 호출합니다.
	}
}