package OOP_Encapsulation;

public class User {
	
	

	String name;
	String address;
	int age;
	private String DOB;

	
	public User(String name, String address, int age, String dOB) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
		DOB = dOB;
	}

	public void setDOB(String DOB) {
		this.DOB = DOB;
	}

	public String getDOB() {
		return DOB;
	}	
	
	

}
