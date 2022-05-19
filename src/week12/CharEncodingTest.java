package week12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharEncodingTest {
	public static void main(String[] args) throws IOException {
		File fileDir = new File("input.txt");
		BufferedReader in = new BufferedReader(new InputStreamReader( // BufferedReader는 엔터만 경계로 인식하고 받은 데이터가 String으로 고정
			new FileInputStream(fileDir), "UTF8")); 

		String str;

		while ((str = in.readLine()) != null) { // 반복문을 통해 파일의 줄을 읽는다.
			System.out.println(str);
		}
	}
}
