package coloredrectangle;

public class ColoredRectangle extends Rectangle {
	String color;

	public ColoredRectangle(int x, int y, int width, int height, String color) {
		super(x, y, width, height); // super로 부모 클래스 필드 가져오기
		this.color = color;
	}
	
    public void draw() { 		
        System.out.println("칼라 직사각형!"); // 메소드 오버라이딩
    }

	public static void main(String[] args) {
		ColoredRectangle obj = new ColoredRectangle(10, 10, 20, 20, "red");
		obj.draw();
	}
}