package coloredrectangle;

public class Rectangle{
    int x, y, width, height;
    public Rectangle(int x, int y, int width, int height) {
    	this.x = x;
    	this.y = y;
    	this.width = width;
    	this.height = height;
    }
    public void draw() { 		
          System.out.println("직사각형");
    }
};
