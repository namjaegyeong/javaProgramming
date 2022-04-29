package cartest;
/*
 * 참고 : https://arabiannight.tistory.com/313
 */


public class Car {
	private String model;

	public Car(String model) { // 값을 전달 받는 생성자
		this.model = model;
	}

	public boolean equalModel(Object obj) {
		if (obj instanceof Car) // instanceof를 통해 클래스 타입 확인, obj 가 Car거나 Car를 상속 받은 자식 클래스일 경우 true 반환, true 일 경우 Obj는 Car 클래스 타입으로 형 변환 가능
			return model.equals(((Car) obj).model); // equals 메소드는 대상 내용 자체를 비교하지만, == 연산자는 주소 값을 비교
		else
			return false;
	}
}