package OOP_Inheritance;

public class BMW extends Car{
	
	
	@Override
	public void start()
	{
		System.out.println("BMW Car start....");
	}
	
	@Override
	public void stop()
	{
		System.out.println("BMW Car Stop....");
	}
	
	public void autoParking()
	{
		System.out.println("BMW auto parking .....");
	}
	
	
	public static void display()
	{
		System.out.println("BMW---- Display");
	}

}
