package week4;

import javax.swing.JOptionPane;

public class StatementExampleErrorHandling {

	public static void main(String args[]) {
		
		/**
		 * Input Number에 아무 것도 입력하지 않거나 문자열을 입력하면 Error! 가 출력되게 try catch 문으로 작성하였습니다. 
		 * try catch 문은 자주 쓰이지는 않지만 프로그래밍을 할 때 이와 같은 에러 핸들링이 꼭 필요합니다.
		 * 관련 내용 URL : https://jamesdreaming.tistory.com/126
		 */
		
		try {
			String inString = JOptionPane.showInputDialog("Input number");
			int num = Integer.parseInt(inString);
			if ((num % 2) == 0) {
				System.out.println(num + ":Even number!!");
			}
				System.out.println("The end");
		} catch (NumberFormatException e) {
			System.out.println("Error!");
		}
	}
	
}
