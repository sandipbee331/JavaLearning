package OOPs_Abstract;

public class PageTest {

	public static void main(String[] args) {

		LoginPage lp = new LoginPage(10);
		lp.launchURL();
		lp.resetPass();
		lp.getTitle();
		lp.getLogo();
		lp.pageLoadingTime();
		LoginPage.pageCycle();
		Page.pageCycle();
		lp.privacyPolice();
		
		
		
		
		
		
	}

	

}
