package OOP_Encapsulation;

public class Application {

	public static void main(String[] args) {

		User user = new User("Pankaj", "Haridwar", 35, "20-11-1990");
		/*
		 * user.name = "Ravi"; user.address = "Mumbai"; user.age = 30;
		 * user.setDOB("20-12-1990");
		 */

	    System.out.println(user.name +" "+user.address+" "+user.age+" "+user.getDOB());
	    System.out.println("-----");
	}
		
		
		

}
