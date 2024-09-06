package JavaPattern;

public class SquareHollowPattern {
	
	public static void main(String[] args)
	{
		hollowSquare(4, 4);
	}
	
	public static void hollowSquare(int row, int col)
	{
		for(int i = 0;i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				if(i==0 || i==row-1)
				{
				System.out.print("*");
				}
				else 
				{				
							
					  if(((i>0||i<row)&&j==0)||((i>0||i<row)&&j==col-1) )
					  { 
						  System.out.print("*");
					  }
					  else 
					  { 
						  System.out.print(" "); 
					  }
					 
				}
			}
			System.out.println();
		}
	}

}
