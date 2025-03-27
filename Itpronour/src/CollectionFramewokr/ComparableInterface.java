package CollectionFramewokr;
import java.util.ArrayList;
import java.util.Collections;
class Student implements Comparable<Student>{
	int rollNo;
	String name;
	int marks;
	
	Student(int rollNo,String name, int marks){
		this.rollNo=rollNo;
		this.name=name;
		this.marks=marks;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(this.rollNo==o.rollNo) {
			return 0;
		}
		else if(this.rollNo > o.rollNo) {
			return 1;
		}
		else {
			return -1;
		}
	}
}
public class ComparableInterface {
	public static void main(String[] args) {
		ArrayList<Student>  al=new ArrayList<>();
		al.add(new Student(103,"Pradip",85));
		al.add(new Student(101,"Sandip",89));
		al.add(new Student(102,"Supriy",83));
		al.add(new Student(105,"Suman",81));
		al.add(new Student(104,"Vijay",84));
		
		
		Collections.sort(al);
		for(Student st: al) {
			System.out.println(st.rollNo+" "+st.name+" "+st.marks);
		}
	}
}
