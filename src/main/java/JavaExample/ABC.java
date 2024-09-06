package JavaExample;

public class ABC extends ABsClass implements IinkInterface  {

	/*
	 * ABC(){
	 * 
	 * super(); System.out.println("ABC");
	 * 
	 * }
	 */
	public static void main(String[] args) {
		//IinkInterface iface = new ABC();
		ABsClass absclass = new ABC();
		ABC abc = new ABC();
		  System.out.println(i);
		 // iface.i = 20;
		//  iface.add(10);
		  addt(30);
		//  iface.multiple(10);
		  abc.printnumber(10);
		  System.out.println("=======");
		 absclass.printnumber(20);
		//  absclass.a=20;
		  //System.out.println(absclass.a);
		  
		  
	}

	
	 // public void printnumber(int a) { System.out.println(a); }
	 
	void printVoid()
	{
		System.out.println("Print void");
	}
	public void add(int b)
	{
		System.out.println("interface method is implemented in the class" +b +i);
	}
	public static void addt(int r)
	{
		System.out.println("this is a static method in class"+ r);
	}

}
