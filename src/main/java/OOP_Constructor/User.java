package OOP_Constructor;

public class User {

	String name;
	int age;
	String phoneNo;
	String email;
	
	public User(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	
	public User(String name, int age, String phoneNo) {
		this.name = name;
		this.age = age;
		this.phoneNo = phoneNo;
	}


	public static void main(String[] args) {
		
		User u1 = new User("wrer", 21);
		//u1.name = "QQQ";
		System.out.println(u1.name);
		System.out.println(u1.age);

	}

}
