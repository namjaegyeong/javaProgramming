package car1;

public class SportsCar extends Car 
{
	private boolean turbo;// 다른 패키지, 클래스에서 접근하지 못하는 필드

	public void setTurbo(boolean flag) {
		turbo = flag;
	}
	
	public void ShowInfo() {
		super.ShowInfo(); // super로 부모 클래스인 Car의 ShowInfo 가져오기
		System.out.println("turbo : " + turbo);
	}
}