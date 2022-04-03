package week1;

/**
 * 
 * .java 파일에 public class 가 2개 존재하면 오류가 발생합니다. 무조건 public class는 하나여야 합니다.
 *
 */

public class BankError {
	public static void main(String[] args) {
	Account client = new Account();
	client.printInfo();
	}
}

public class Account {
	void printInfo() {
		System.out.println("계좌정보");
		System.out.println("고객이름");
	}
};
