package OOPs_Abstract;

public class LoginPage extends Page implements Web {

	public LoginPage() {
		System.out.println("LoginPage === Default constructor");
	}
	
	public LoginPage(int a) {
		System.out.println("LoginPage === Default constructor"+ a);
	}
	
	@Override
	public void launchURL() {
		System.out.println("LoginPage === launchURL");
	}

	@Override
	public void getTitle() {
		System.out.println("LoginPage === getTitle");
		
	}

	
	
	public void resetPass()
	{
		System.out.println("LoginPage === reset Pass");
	}
	@Override
	public void pageLoadingTime()
	{
		System.out.println("LoginPage == PageLoad time");
	}
	//@Override   >> Static method can not be override but child class can have same mehtod
	public static void pageCycle()
	{
		System.out.println("LoginPage === pageCycle");
	}

	@Override
	public void privacyPolice() {
		System.out.println("Login page =======privacyPolice");
		
	}
	
}
