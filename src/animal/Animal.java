package animal;

public class Animal {
	double weight; // 필드
	String picture; // 필드
	
	public Animal(double weight, String picture) { // 값을 전달 받는 생성자, 필드 초기화 역할
		this.weight = weight; 
		this.picture = picture; 
	}

	void eat() {		System.out.println("eat()");	}
	void sleep() {		System.out.println("sleep()");	}
}