package book;

/*
 * 참고 : https://backback.tistory.com/68
 */

public class Book {
	private String title;
	private String isbn;
	public Book(String title, String isbn) { // 값을 전달 받는 생성자
		this.title = title;
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "ISBN: " + isbn + "; TITLE: "+title+";"; //toString 를 재정의, 인스턴스 생성할 때 값을 전달하면 해당 문자열을 리턴
	}

	public static void main(String[] args) {
		Book myBook = new Book("The Java Tutorial", "0123456"); // 인스턴스 생성할 때 값을 전달
		System.out.println(myBook);
	}
}