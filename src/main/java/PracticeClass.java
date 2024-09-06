import org.apache.poi.util.SystemOutLogger;

public class PracticeClass {

	public static void main(String[] args) {

		System.out.println("Hello");
		
		//System.out.println(factorialItration(10));
	//	System.out.println(factorialrecurssion(10));
		System.out.println(fabonacciSeries(5));
		
		
		
		
		
	}

	
	public static long factorialItration(int num)
	{
		long fact = 1;
		for(int i=1;i<=num;i++)
		{
			fact *=i;
		}
		return fact;
	}
	
	public static long factorialrecurssion(int num)
	{
		if(num==0)
		{
			return 1;
		}
		else {
			System.out.println(num);
			return num*factorialrecurssion(num-1);
			
		}
	}
	
	public static int fabonacciSeries(int num)
	{
		if (num==0)
		{
			return 0;
		}
		if (num==1)
		{
			return 1;
		}
		return fabonacciSeries(num-1)+fabonacciSeries(num-2);
	}
}
