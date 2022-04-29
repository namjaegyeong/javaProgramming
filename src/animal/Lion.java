package animal;


public class Lion extends Animal {
	int legs=4;
	
	public Lion(double weight, String picture){
		super(weight,picture); // 부모 클래스의 멤버 변수 가져오기
	}
	
	void roar() {
		System.out.println("weight : " + weight + " picture : " + picture + " legs : " + legs);
		System.out.println("roar()");	
	}
	
}