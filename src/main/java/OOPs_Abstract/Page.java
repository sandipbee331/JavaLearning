package OOPs_Abstract;

public abstract class Page implements Web{
	
	public Page()
	{
		System.out.println("Page === Default constructor");
	}
	
	public Page(int a)
	{
		System.out.println("Page === Default constructor" + a);
	}
	
	public abstract void launchURL();
	
	public abstract void getTitle();
	
	public final void getLogo()
	{
		System.out.println("Page == logo");
	}
	
	public void pageLoadingTime()
	{
		System.out.println("Page == PageLoad time");
	}
	
	public static void pageCycle()
	{
		System.out.println("Page === pageCycle");
	}
	
	
	
	
	
	

}
