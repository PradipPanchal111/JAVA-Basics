package Serilization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
 ///Converting object to  Byte Stream
class Student implements Serializable{
	int id;
	String name;
}

public class demo {
	public static void main(String[] args){
		
		Student s=new Student();
		s.id=101;
		s.name="Pradip";
		
		try {
			ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("output.txt"));
			os.writeObject(s);
			
			os.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
