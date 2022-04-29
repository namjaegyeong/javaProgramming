package daynamiccalltest;

class Animal  { 
  void sound() { 
    System.out.println("Animal sound()"); 
  } 
} 
 
class Dog extends Animal { 
  void sound() { // 메소드 오버라이딩
    System.out.println("왈왈"); 
  } 
} 
 
class Cat extends Animal { 
  void sound() { // 메소드 오버라이딩
    System.out.println("야옹"); 
  } 
} 
 
public class DynamicCallTest { 
  public static void main(String args[]) { 
    Animal animal = new Animal(); 
    Dog dog = new Dog(); 
    Cat cat = new Cat(); 

 
    Animal obj;  
 
    obj = animal;  
	obj.sound(); 
 
    obj = dog;  
	obj.sound(); 
 
    obj = cat;  
	obj.sound(); 
  } 
}