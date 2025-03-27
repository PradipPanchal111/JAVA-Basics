package CollectionFramewokr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee{
	int id;
	String name;
	int salary;
	
	public Employee(int id, String name, int salary) {
		super();
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
}
class SalaryComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee o1,Employee o2) {
		if(o1.salary==o2.salary) {
			return 0;
		}
		else if( o1.salary >o2.salary) {
			return 1;
		}
		return -1;
	}
	
	
}
public class ComparatarInterface {
	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList<>();
		al.add(new Employee(11,"Pradip",15000));
		al.add(new Employee(12,"Sandip",13000));
		al.add(new Employee(13,"Priya",1200));
		al.add(new Employee(14,"Suman",41000));
		
		System.out.println("-------befor sorting-------");
		
		for(Employee st: al) {
			System.out.println(st.id+" "+st.name+" "+st.salary);
		}
		
		Collections.sort(al, new SalaryComparator());
		
System.out.println("-------after sorting-------");
		
		for(Employee st: al) {
			System.out.println(st.id+" "+st.name+" "+st.salary);
		}
	}
	
}
