package week12;

import java.io.*;
import java.util.Date;

public class ObjectStreamTest {
       public static void main(String[] args) throws IOException {
             ObjectInputStream in = null;
             ObjectOutputStream out = null;
             try {
                    int c;
                    out = new ObjectOutputStream(new FileOutputStream("object.dat"));  // 해당 파일에 Date 객체를 저장
                    out.writeObject(new Date()); // 현재 날짜
 
                    out.flush();
                    in = new ObjectInputStream(new FileInputStream("object.dat"));
                    Date d = (Date) in.readObject();  // 저장된 데이터를 읽기만 하면 객체로 역직렬화
                    System.out.println(d);
             } catch (ClassNotFoundException e) {

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

