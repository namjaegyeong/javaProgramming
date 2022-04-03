package week1;

/**
 * 
 * Account 클래스의 인스턴스 생성 후 참조변수.메소드 형식으로 printInfo 메소드를 호출합니다.
 *
 */

public class Bank {
	public static void main(String[] args) {
	Account client = new Account();
	client.printInfo();
	}
}

class Account {
	void printInfo() {
		System.out.println("계좌정보");
		System.out.println("고객이름");
	}
};
