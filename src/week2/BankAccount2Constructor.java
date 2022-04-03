package week2;

public class BankAccount2Constructor {
	 String name;
	 int accountNumber;
	 
	 public BankAccount2Constructor(String clientName, int clientAccount) {
		 name = clientName;
		 accountNumber = clientAccount;
	 }// 생성자입니다. 리턴 타입이 명시되지 않았고 이름이 클래스 이름과 동일합니다.
	 
	 void printInfo() {
		 System.out.println(name);
		 System.out.println(accountNumber);
	 } // 이 메소드는 멤버 변수들을 출력해주는 역할입니다.
	 
	 public static void main(String[] args) {
		 BankAccount2Constructor client = new BankAccount2Constructor("홍길동", 123456); 
		 // 메인 메소드에서 BankAccount2 클래스의 인스턴스를 생성합니다. 인자에 값을 넣어서 클래스 안에 멤버변수들을 초기화합니다.
		 client.printInfo(); // 참조변수.메소드 형식으로 메소드를 호출합니다.
	}
}