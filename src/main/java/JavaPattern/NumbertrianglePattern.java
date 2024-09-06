package JavaPattern;

public class NumbertrianglePattern {

	public static void main(String[] args) {
		
		numTrianglePattern(5);
	}
	
	public static void numTrianglePattern(int n)
	{
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n-i; j++)
			{
				System.out.print(" ");
			}
			for(int j=0; j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
