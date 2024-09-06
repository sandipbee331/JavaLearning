package JavaExample;

public class subClass extends AccessModifier {
	
	subClass()
	{
		super();
		
		System.out.println("subclass conts...");
	}

	 public static void main(String[] args) {

		
		AccessModifier am = new AccessModifier(10);
		am.display();
		
		
	}

}
