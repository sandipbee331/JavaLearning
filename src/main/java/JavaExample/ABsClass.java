package JavaExample;

public abstract class ABsClass {
	
	 ABsClass()
	{
		System.out.println("constructor");
	}
	final int a=10;
	
	public void printnumber(int n)
	{
		for (int i=0; i<n; i++)
		{
			System.out.println(i);
		}
	}
	abstract void printVoid();
	

}
