package cat;

public class Cat extends Animal {
    public static void eat() {
        System.out.println("Cat eat()"); // 메소드 오버라이딩 형태이지만 static으로 선언했기 때문에 해당 클래스에만 귀속됩니다.
    }
    public void sound() {
        System.out.println("cat sount()"); // 메소드 오버라이딩 형태이지만 static으로 선언했기 때문에 해당 클래스에만 귀속됩니다.
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        Animal myAnimal = myCat;
        Animal.eat();
        myAnimal.sound();
    }
}