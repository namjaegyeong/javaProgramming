package assignment;

class Orange2
{
	int sugarContent;
	public Orange2(int sugar) { sugarContent = sugar; }
	public void showSugarContent() { System.out.println("오렌지 당도 " + sugarContent); }
}

class Apple2
{
	int sugarContent;
	public Apple2(int sugar) { sugarContent = sugar; }
	public void showSugarContent() { System.out.println("사과 당도 " + sugarContent); }
}

class FruitBox1<T>
{
	T item;
	public void store(T item) { this.item = item; }
	public T pullOut() { return item; }
}

public class assign4 {
	public static void main(String[] args) {
		FruitBox1<Orange2> fBox1 = new FruitBox1<Orange2>();
		fBox1.store(new Orange2(10));
		Orange2 org1 = fBox1.pullOut();	
		org1.showSugarContent();
		
		FruitBox1<Apple2> fBox2 = new FruitBox1<Apple2>();
		fBox2.store(new Apple2(20));
		Apple2 app1 = fBox2.pullOut();	
		app1.showSugarContent();
	}
}


