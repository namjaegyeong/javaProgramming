package week1;

public class VectorTest {
	 public static void main(String args[]) {
		 
		 /**
		  * 자바 벡터 사용 방법 설명 : https://psychoria.tistory.com/775
		  * Vector는 내부에 배열을 가지고 있으며 순서대로 값들이 저장됩니다.
		  */
		 
		java.util.Vector<String> vector = new java.util.Vector<>();
		java.util.Vector<String> vector2 = vector;
		
        vector.add("Black");
        vector.add("White");
        vector.add("Red");
        
        System.out.println(vector);
        
        vector2.add("Red");
        vector2.add("Green");
        vector2.add("Blue");
        
        System.out.println(vector2);
	}
}
