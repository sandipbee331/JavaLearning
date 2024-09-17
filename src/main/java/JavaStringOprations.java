
public class JavaStringOprations {

	public static void main(String[] args) {

		//naveenquestion();
		//reverseString();
		reverseStringFromDots();
	}
	
	public static void reverseString()
	{
		String s = "i love programming very much";
		
		String [] s_array = s.split(" ");
		
		for(int i=s_array.length-1; i>=0;i--)
		{
			System.out.println(s_array[i]);
			System.out.println(i);
		}
	}
	
	public static void reverseStringFromDots()
	{
		String str = "i.like.this.program.very.much";
		String [] strArray = str.split("\\.");
		//System.out.println(strArray.length);
		int i=0;
		for( i=strArray.length-1; i>=0; i--)
		{
			//System.out.println("Heel1o");
			System.out.print(strArray[i]);
			if (i!=0)
			{
				System.out.print(".");
			}
		}
		
		//System.out.println("Heel1qqo");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void naveenquestion()
	{
		int a =10;
		System.out.println(a+=(a=5)*(a/5));
	}

}
