package JavaExample;

public class AccessModifier {

	AccessModifier()
	{
		System.out.println("Parent class contructor");
	}
	
	AccessModifier(int a)
	{
		//this();
		System.out.println("Parent class contructor" +a);
	}
	
	
	public void display()
	{
		System.out.println("Hello");
	}
	
	private int salary = 1000;
	
	public int getSalary()
	{
		return salary;
	}
	
	public void setSalary(int s)
	{
		this.salary = s;
		System.out.println(salary);
	}
	
	
	
	
	

}
