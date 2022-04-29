package animal;

public class Eagle extends Animal {
	int wings=2;
	
	public Eagle(double weight, String picture){
		super(weight,picture); // 부모 클래스의 필드 가져오기
	}
	
	void fly() {
		System.out.println("weight : " + weight + " picture : " + picture + " wings : " + wings);
		System.out.println("fly()");	
	}
}