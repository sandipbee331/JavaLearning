package JavaExample;

 interface IinkInterface {
	
	int i = 10;
	
	abstract void add(int b);
	default void multiple(int y)
	{
		int m = i*y;
		System.out.println("this default mehtod" +i +m);
	}
	public static void addt(int r)
	{
		System.out.println("this is a static method"+ r);
	}
	

}
 
 




