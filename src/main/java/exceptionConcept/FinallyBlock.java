package exceptionConcept;

public class FinallyBlock {

	public static void main(String[] args) {

		System.out.println("Hi");
		
		try {
			int a = 9/0;
			System.out.println(a);
		}
		catch(ArithmeticException e){
			System.out.println("AE is coming.....");
			//e.printStackTrace();
		}

		finally {
			System.out.println("Finally block....");
		}
		
		
		
		
		
		
		
	}

}
