package week4;

import javax.swing.JOptionPane;


public class statementExample{
	
	public static void main(String args[]) {
		
		/**
		 * JOptionPane에 Ctrl + Shift + O 을 사용하시면 자동으로 javax.swing.JOptionPane 가 임포드 됩니다.
		 * run을 하고 Input Number에 숫자를 입력하시면 짝수이면 num::Even number!! The end 반환, 홀수이면 The end를 반환합니다.
		 * Input Number에 아무 것도 입력하지 않으면 NumberFormatException이 발생합니다. 이것을 해결한 예제는 statementExampleErrorHandling.java에 있습니다.
		 */
		
		String inString = JOptionPane.showInputDialog("Input number");
		int num = Integer.parseInt(inString);
		if ((num % 2) == 0) {
			System.out.println(num + ":Even number!!");
		}
			System.out.println("The end");
	}
}
