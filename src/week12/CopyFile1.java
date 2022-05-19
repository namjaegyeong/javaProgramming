package week12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile1 {
	
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("input.txt");
            out = new FileOutputStream("output.txt");

            int c;

            while ((c = in.read()) != -1) { // read()가 -1을 반환할 때까지 반복문으로 파일을 입력
                out.write(c);
            }
        } finally { // FileInputStream,FileOutputStream 클래스의 인스턴스의 쓰임이 다했다면, close()로 클래스를 닫아 주어야 한다.
            if (in != null) 
                in.close();
            if (out != null) 
                out.close();
        }
    }
}