package dynamicArray;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListConcepts {

	public static void main(String[] args) {

		ArrayList<String> alist = new ArrayList<String>();
		alist.add("Ram");
		alist.add("Kabir");
		alist.add("Kamal");
		alist.add("Kamlesh");
		System.out.println(alist);
		Collections.reverse(alist);
		Collections.sort(alist);
		System.out.println(alist);
		
		
		
	}

}
