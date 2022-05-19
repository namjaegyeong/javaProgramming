package week12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipTest {
	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("test.zip");
		ZipInputStream zin = new ZipInputStream(fin);
		ZipEntry entry = null;
		while ((entry = zin.getNextEntry()) != null) { // 압축된 zip에 포함된 각 파일들은 ZipEntry 라는 객체로 저장 후 getNextEntry()로 zip에 포함된 파일 읽기
			System.out.println("압축 해제: " + entry.getName()); // getName() 메서드를 사용하면 압축 이전의 파일 이름을 알 수 있게 된다.
			FileOutputStream fout = new FileOutputStream(entry.getName());
			for (int c = zin.read(); c != -1; c = zin.read()) {
				fout.write(c); // zip 스트림에서 읽어서 출력 스트림에 쓴다.
			}
			zin.closeEntry();
			fout.close();
		}
		zin.close();
	}
}

