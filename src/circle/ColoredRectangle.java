package circle;

abstract class Shape { 
       int x, y;

       public void move(int x, int y) {
             this.x = x;
             this.y = y;
       }

       public abstract void draw(); // 추상 클래스

};
 
class Rectangle extends Shape {
       int width, height;
       public void draw() { 		
             System.out.println("직사각형"); // 메소드 오버라이딩
       }
};


class Circle extends Shape {
       int radius;
        public void draw() { 
             System.out.println("원"); // 메소드 오버라이딩
       }
};