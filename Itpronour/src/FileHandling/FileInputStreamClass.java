package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamClass {
	public static void main(String[] args) throws IOException {
		try {
			FileInputStream fin=new FileInputStream("output.txt");
			int i=0;
			while((i=fin.read())!=-1) {
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
