package OOP_Constructor;

public class Application {
	
	String name;
	
	public void m1()
	{
		System.out.println("method m1");
		m2();
		name = "New user";
		System.out.println(name);
	}

	public void m2()
	{
		System.out.println("method m2");
		m3();
	}
	public void m3()
	{
		System.out.println("method m3");
		name = "user1";
		System.out.println(name);
		//s1();
	}
	
	
	public static void s1()
	{
		Application a1 = new Application();
		
		a1.m1();
		System.out.println("method s1");
		s2();
	}

	public static void s2()
	{
		System.out.println("method s2");
		s3();
	}
	public static void s3()
	{
		System.out.println("method s3");
	}
	
	
	public static void main(String[] args) {

		Application app = new Application();
		app.m1();
		s1();
	}

}
