package cartest;

public class CarTest {
	public static void main(String[] args) {

		Car firstCar = new Car("HMW520");
		Car secondCar = new Car("HMW520");
		if (firstCar.equalModel(secondCar)) { 
			System.out.println("모델 명이 같습니다.");
		} else {
			System.out.println("모델 명이 다릅니다.");
		}
	}
}