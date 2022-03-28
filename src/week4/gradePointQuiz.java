package week4;


public class gradePointQuiz {
	
	/**
	 * 생성된 난수에 따라 switch case 문으로 학점을 출력하는 식으로 하였습니다. 
	 * case : 에 break; 를 넣지 않으면 switch case 문을 빠져나가지 않고 순차적으로 실행됩니다.
	 * 예시) case : 에 break;가 없다면 randomNum이 1일 때 학점 B 학점 C 학점 D 가 출력이 됩니다.
	 * Scanner input = new Scanner(System.in); 은 키보드로 입력 받는 기능을 담당하기 때문에 문제에 사용할 수 없습니다.
	 * Math.random() 설명 URL : https://mine-it-record.tistory.com/141
	 */
	
	public static void main(String[] args) {
		int randomNum = (int) (Math.random() * 4);
		
		System.out.println("생성된 수:" + randomNum); 
		
		switch (randomNum) { 
		case 0: 
			System.out.println("학점 A"); 
			break;
		case 1: 
			System.out.println("학점 B");
			break;
		case 2: 
			System.out.println("학점 C");
			break;
		case 3: 
			System.out.println("학점 D");
			break;
		}
	}
}
