package StringClass;

public class StringPatterns {

	public static void main(String[] args) {

		String str = "Software Testing";
		String str1 = "";
		String[] sArray	= str.split("");
		System.out.println(sArray.length);
		for(int i=sArray.length-1;i>=0;i--)
		{
			str1 = str1 + sArray[i];
			
		}
		System.out.println(str1);
		
		String[] sArray1	= str.split(" ");
		
	}
	
	public void occuranceOfAlphabate(String str)
	{
		String[] sArray1 = str.split(" ");
		System.out.println(sArray1.length);
		/*
		 * for(int i=0; i<sArray1;i++) {
		 * 
		 * }
		 */
	}

}
