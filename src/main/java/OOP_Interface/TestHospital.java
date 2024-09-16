package OOP_Interface;

public class TestHospital {
	
	public static void main(String [] args)
	{
		FortisHospital fh = new FortisHospital();
		fh.BurnService();
		fh.cardioService();
		fh.ENTService();
		
		USMedical us  =new FortisHospital();
		us.covidVacination();
		us.dentalService();
		//us.min_fee =12;
		fh.userRegistration();
		
		
		
	}
	

}
