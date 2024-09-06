package BuilderPattern;

public class Employee {
	Employee emp1 = new Employee("Pune");
	String name;
	private int age;
	String city;
	
	static double salary;

	public Employee(String name, int age, String city) {
		//this(city);
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public Employee(String city2) {
		this.city = "Pune";
		
	}
	
	public static void login()
	{
		System.out.println("user login");
		
	}
	
	public void logout()
	{
		System.out.println("user logout");
		login();
	}
		
	public static void main(String [] args)
	{
		Employee emp = new Employee("Ram",20, "Kanpur");
		System.out.println(emp.city);
	}

}
