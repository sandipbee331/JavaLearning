package JavaPattern;

import java.util.Scanner;

public class PracticeJava {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int arrarySize = sc.nextInt();
		int[] array = new int[arrarySize];
		System.out.println("Enter the "+arrarySize+ "values.");
		for(int i=0;i<arrarySize;i++)
		{
			array[i]=sc.nextInt();
		}
		sc.close();
		
		/*
		 * array[0] =5; array[1] =8; array[2] =7; array[3] =2; array[4] =1;
		 */
		//System.out.println(array);
		
		getlargeNumber(array);
		
	}
	
	public static int getlargeNumber(int arr[])
	{
		int a=0;
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+",");
			
			if(arr[i]>a)
			{
				a=arr[i];
			}
			
		}
		System.out.println("===========");
		System.out.println(a);
		return a;
	}

}
