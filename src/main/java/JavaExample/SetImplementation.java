package JavaExample;

import java.util.HashSet;
import java.util.Set;

public class SetImplementation {
	
	public static void main(String args[])
	{
		Set set = new HashSet<>();
		set.add("Ram");
		set.add("Ram");
		set.add(12);
		System.out.println(set.size());;
		
		for(Object obj: set)
		{
			System.out.println(obj);
		}
	}

}
