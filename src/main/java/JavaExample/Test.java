package JavaExample;

public class Test {
	{
		System.out.println("I am an instanse block");
	}
	public Test()
	{
		System.out.println("I am a constractor");
	}
	static
	{
		System.out.println("I am static block");
	}

	public static void main(String[] args) {

		/*
		 * int count =1; while(count<=15) { System.out.println(count%2==0?"***":"+++");
		 * count++; }
		 */
		
		System.out.println("this main method");
		Test test = new Test();
	}

}
