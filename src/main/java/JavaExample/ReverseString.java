package JavaExample;

import java.util.HashMap;
import java.util.Map;

public class ReverseString {
	
	static {
		System.out.println("=========You are here========");
	}

	public static void main(String[] args) {
		String str = "Hello I am Java";
		System.out.println(reverseString(str));
		reverseString1(str);
		charCount(str);
		AccessModifier am  = new AccessModifier();
		am.display();
		
	}
	
	public static StringBuilder  reverseString(String text)
	{
		System.out.println(text);
		StringBuilder reverseString = new StringBuilder();
		reverseString.append(text);
		return reverseString.reverse();
		
		
	}
	
	public static void reverseString1(String text)
	{
		char[] ch = text.toCharArray();
		for(int i=ch.length-1; i>=0;i--)
		{
			System.out.print(ch[i]);
		}
	}
	
	public static void charCount(String text)
	{
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		char[] charArray = text.toCharArray();
		for (char c : charArray)
		{
			if(charMap.containsKey(c))
			{
				charMap.put(c, charMap.get(c)+1);
			}
			else
			{
				charMap.put(c, 1);
			}
		}
		System.out.println(text+ ":" +charMap);
		
		
		
	}

}
