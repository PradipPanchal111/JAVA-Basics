package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class one {
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\pradi\\eclipse-workspace\\Basics\\output.txt");
		if(file.exists()) {
			System.out.println("------------The file is opened-------------\n"
					+ "The Name of file is: "+file.getName()+file.getPath()+
					"\nCan we write the file: "+file.canWrite()+
					"\nComplet path of File: "+file.getAbsolutePath()+
					"\nIs it a file: "+file.isFile()+
					"\nIt is a Directory: "+file.isDirectory()+
					"\nParent is: "+file.getParent()+
					"\nLength of file: "+file.length());
		}
		else {
			System.out.println("------------Sorry file dosen't exists-------------");
		}
		try {
			FileOutputStream fout=new FileOutputStream("output.txt");
			fout.write(66);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
