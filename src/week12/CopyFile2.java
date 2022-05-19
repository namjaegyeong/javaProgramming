package week12;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile2 {

    public static void main(String[] args) throws IOException {

        FileReader inputStream = null; // FileReader와 FileWriter는 문자 단위로 각각 입력, 출력
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("input.txt");
            outputStream = new FileWriter("output.txt");

            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}