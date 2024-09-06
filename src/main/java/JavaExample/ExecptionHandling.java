package JavaExample;

public class ExecptionHandling {

	public static void main(String[] args) {

		int i =20;
		
		try
		{
			int c= i/0;
			System.out.println(c);
		}
		catch(ArithmeticException e){
			System.out.println("arithmeticException");
		}
		finally {
			System.out.println("System crashed");
		}
		
	}

}
