package dynamicArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StaticArray {

	public static void main(String[] args) {

		
		int[] a = new int[20];
		a[0] =1;
		a[1] =10;
		a[2] =100;
		a[3] =30;
		a[4] =40;
		a[100]=101;
		System.out.println(Arrays.toString(a));
		
		//Arrays.sort(a);
		//System.out.println(Arrays.toString(a));
		
		
		String[] str = {"Hi", "Hello", "Good morning", "Good night"};
		System.out.println(Arrays.toString(str));
		//str.
		
		ArrayList<String>strList = new ArrayList<String>();
		
		for(String e : str)
		{
			strList.add(e);
		}
		System.out.println(strList);
		
		List<String>sList = Arrays.asList(str);
		System.out.println(sList);
		try {
		sList.add("ABC");// When user create or convert into ArrayList then user unable to add 
		//values in ArrayList, Exception occurs.
		}
		catch(UnsupportedOperationException e)
		{
			e.printStackTrace();
		}
		System.out.println(sList);
		
	}

}
