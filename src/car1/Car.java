package car1;

public class Car 
{
	private int speed; // 다른 패키지, 클래스에서 접근하지 못하는 필드
	public void setSpeed(int speed) { 
		this.speed = speed;
	}
	
	public void ShowInfo() {
		System.out.println("speed : " + speed);
	}
}