package bank;

class Bank {
	double getInterestRate() {
		return 0.0;
	}
}

class BadBank extends Bank { // Bank 상속
	double getInterestRate() { // 메소드 오버라이딩
		return 10.0;
	}
}

class NormalBank extends Bank { // Bank 상속 
	double getInterestRate() { // 메소드 오버라이딩
		return 5.0;
	}
}

class GoodBank extends Bank { // Bank 상속
	double getInterestRate() { // 메소드 오버라이딩
		return 3.0;
	}
}

public class BankTest {
	public static void main(String args[]) {
		BadBank b1 = new BadBank(); // 인스턴스 생성
		NormalBank b2 = new NormalBank(); // 인스턴스 생성
		GoodBank b3 = new GoodBank(); // 인스턴스 생성
		System.out.println("BadBank : " + b1.getInterestRate());
		System.out.println("NormalBank : " + b2.getInterestRate());
		System.out.println("GoodBank : " + b3.getInterestRate());
	}
}