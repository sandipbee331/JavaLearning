package JavaExample;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class ListImplementation {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Mava");
		list.add("Java");
		list.add("Java");
		list.add("Java");
		list.add("Java");
		list.add("hjfds1");
		list.add("hjfds1");
		list.add("Mava");list.add("Kava");
		
		for(String str:list)
		{
			System.out.println(str);
		}
		
		Map map = new LinkedHashMap<>();
		for(int i=0; i<list.size()-1;i++)
		{
			int count =0;
			for(int j=i+1;j<=list.size()-1;j++)
			{
				count++;
			}
			if(!map.containsKey(list.get(i))&&count>1)
			{
				map.put(list.get(i),count);
				
			}
			System.out.println(map.keySet());
			System.out.println(map);
		}
		
	}

}
