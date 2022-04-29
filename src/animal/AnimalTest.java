package animal;

public class AnimalTest {
	public static void main(String[] args) {
		Lion lion = new Lion(10.0,"Lion"); // 객체, 인스턴스 생성하면서 생성자에게 값 전달
		lion.eat();
		lion.sleep();
		lion.roar();

		Eagle eagle = new Eagle(2.0,"Eagle"); // 객체, 인스턴스 생성하면서 생성자에게 값 전달
		eagle.eat();
		eagle.sleep();
		eagle.fly();
	}
}