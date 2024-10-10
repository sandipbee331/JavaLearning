package exceptionConcept;

public class ThrowKeyword {

	public static void main(String[] args) {
		// Throw keyword is use to throw the custom exception
		
		String browserName = null;
		
		if(browserName==null)
		{
			try {
			throw new Exception("Browser name is null");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("Browser is launched....");
		}

	}

}
