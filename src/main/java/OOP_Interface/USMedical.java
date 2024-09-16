package OOP_Interface;

public interface USMedical extends WHO, IndiaMedical {
	
	int min_fee = 22;
	String name ="Tom";
	public  void cardioService();
	
	public void ENTService();
	
	public void dentalService();
	
	public void emergencyService();
	
	public void BurnService();
	
	//Interface : having static method with body
	public static void taxCalculation()
	{
		System.out.println("TAX == USMedical");
	}
	
	//Default method: not Static
	default void userRegistration()
	{
		System.out.println("US===userRegistration");
	}
	
}
