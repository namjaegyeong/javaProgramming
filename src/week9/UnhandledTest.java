package week9;

import java.io.IOException;

public class UnhandledTest {
	public static void main(String[] args) throws IOException {
		System.out.println(readString());
	}
	public static String readString() throws IOException {
		byte[] buf = new byte[100];
		System.out.println("문자열을 입력하시오:");
		System.in.read(buf);
		return new String(buf);
	}
}

