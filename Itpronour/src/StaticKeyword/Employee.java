package StaticKeyword;

public class Employee {
	
	private int Id;
	private String Name;
	private int Salary;
	
	static private String clg;
	static {
		clg="SVERI";
	}
	
	
	
	public Employee() {
		this.Id=101;	
		this.Name="Pradip";
		this.Salary=100000;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}
	
	@Override
	public String toString() {
		return(this.Id+" "+this.Name+ " "+this.Salary+ " "+clg);
	}
}
