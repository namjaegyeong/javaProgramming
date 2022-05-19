package week12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// �ҽ��� �Է��ϰ� Ctrl+Shift+O�� ������ �ʿ��� ������ �����Ѵ�. 

//����: ���� �Է��Ͽ� Ȯ��!
public class CopyLines {
    public static void main(String[] args) throws IOException {


//FileReader�� BufferedReader�� �����Ѵ�. 
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader("input.txt"));
            outputStream = new PrintWriter(new FileWriter("output.txt"));

//FileWriter�� ����� PrinterWriter�� �Է��� �ȴ�. 

            String l;
            while ((l = inputStream.readLine()) != null) {
                outputStream.println(l);
            }

//���� ������ ������� �� �ִ�. 
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