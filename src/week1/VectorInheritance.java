package week1;

import java.util.Vector;


/**
 * 
 * 원본을 수정하지 않고 그대로 사용한다면 import, 원본을 그대로 사용하거나 일부 수정한다면 extends를 사용합니다.
 * public class인 VectorInheritance는 import한 라이브러리를 extends로 상속합니다. 그렇게 하면 VectorInheritance class는 Vector 라이브러리의 내용 중 일부 수정하여 반영할 수 있습니다.
 * 해당 예제는 Vector 라이브러리 내용 중 일부 수정하여 반영하지 않았고, 단순히 인스턴스를 생성하고 .add를 이용하여 문자열을 추가하고 출력을 해본 것입니다. Vector는 배열과 비슷한 역할을 합니다.
 * 
 */

@SuppressWarnings("serial") 
// 부모 클래스에 implements Serializable 객체가 있기 때문에 오류를 없애기 위해 어노테이션을 선언했습니다.
// 관련 주소 : https://zzznara2.tistory.com/186
public class VectorInheritance extends Vector<String> {
	public static void main(String[] args) {	
	    Vector<String> vector = new Vector<>();
		
		vector.add("Black");
	    vector.add("White");
	    vector.add("Red");	
	    
	    System.out.println(vector);
	}
}
