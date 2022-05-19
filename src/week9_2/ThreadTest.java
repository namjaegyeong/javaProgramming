package week9_2;

/**
 * 
 * 참고 : https://makecodework.tistory.com/entry/Java-%EB%9E%8C%EB%8B%A4%EC%8B%9DLambda-%EC%9D%B5%ED%9E%88%EA%B8%B0
 *
 */

public class ThreadTest {
	public static void main(String args[]) {
		Runnable task = () -> {
			for (int i = 10; i >= 0; i--)
				System.out.print(i + " ");
		};
		new Thread(task).start();
	}
}