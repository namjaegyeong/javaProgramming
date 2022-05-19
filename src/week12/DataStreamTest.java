package week12;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {
	public static void main(String[] args) throws IOException {
		DataInputStream in = null;
		DataOutputStream out = null;
		try {
			int c;

			out = new DataOutputStream(new BufferedOutputStream(
					new FileOutputStream("data.bin"))); // FileOutputStream이 data.bin 파일에 출력
			
			out.writeDouble(3.14); 
			out.writeInt(100);
			out.writeUTF("자신의 생각을 바꾸지 못하는 사람은 결코 현실을 바꿀 수 없다."); // data.bin 파일에 차례대로 Double, Int, UTF 저장

			out.flush(); // flush()는 현재 버퍼에 저장되어 있는 내용을 전송하고 버퍼를 비운다.
			
			in = new DataInputStream(new BufferedInputStream(
					new FileInputStream("data.bin"))); // FileInputStream은 data.bin 파일로 부터 데이터를 읽어 들인다.

			System.out.println(in.readDouble());
			System.out.println(in.readInt());
			System.out.println(in.readUTF());

		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}
}