package circle;

public class ColoredRectangleTest{
	public static void main(String[] args) {
		Shape sha = new Shape(); // 추상 클래스라서 인스턴스, 객체 생성 불가능
		Rectangle rec = new Rectangle();
		Circle cir = new Circle();
		
		rec.draw();
		cir.draw();
	}
}