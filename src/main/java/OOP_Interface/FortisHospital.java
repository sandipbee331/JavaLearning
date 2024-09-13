package OOP_Interface;

public class FortisHospital implements USMedical,UKMedical, IndiaMedical {
	
	
	public static void main(String [] args)
	{
		USMedical us1 = new FortisHospital();
		us1.cardioService();
		us1.covidVacination();
		us1.dentalService();
		us1.ENTService();
		System.out.println("===================");
		WHO who = new FortisHospital();
		who.covidVacination();
		who.pandemicRule();
		
	}
	
	@Override
	public void userRegistration()
	{
		System.out.println("FH===userRegistration");
	}
		
	
	
	//US
	@Override
	public void cardioService() {
		System.out.println("FH=== cardio service");
	}

	@Override
	public void ENTService() {
		System.out.println("FH=== ENTService");		
	}

	@Override
	public void dentalService() {
		System.out.println("FH=== dentalService");
		
	}
	//UK
	@Override
	public void orthoService() {
		System.out.println("FH=== orthoService");
		
	}

	@Override
	public  void gynoService() {
		System.out.println("FH=== gynoService");
		
	}

	@Override
	public void eyeService() {
		System.out.println("FH=== eyeService");
		
	}
	
	//india
	@Override
	public void BurnService() {
		System.out.println("FH=== eyeService");
		
	}

	@Override
	public void nuroService() {
		System.out.println("FH=== nuroService");
		
	}

	@Override
	public void phramacyService() {
		
		System.out.println("FH=== phramacyService");
	}
	//common
	@Override
	public void emergencyService() {
		System.out.println("FH=== emergencyService");
		
	}
	
	//individual
	
	public void insuranceService()
	{
		System.out.println("FH=== insuranceService");
	}

	//USMedical us = new FortisHospital();

	//WHO
	@Override
	public void covidVacination() {
		System.out.println("FH=== covidVacination");
		
	}

	@Override
	public void pandemicRule() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
