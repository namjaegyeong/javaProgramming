package week9;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class writer {
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Item1");
		list.add("Item2");
		list.add("Item3");
		try(PrintWriter output = new PrintWriter("C:\\Users\\JaeGyeong\\Desktop\\myoutput.txt")){
			for(String s : list) {
				output.println(s.toLowerCase());
			}
		}
	}

}
