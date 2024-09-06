
public class ThisConcept {

	public static void main(String[] args) {
		school sch = new school(10);
		
	}

}

class school {
	
	String str = "Hello this class has const";
	school()
	{
		//this();
		System.out.println("This default const");
	}
	
	school(int a)
	{
		//this();
		System.out.println("Number is : "+ a);
	}
	
}
