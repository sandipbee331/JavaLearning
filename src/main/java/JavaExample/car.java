package JavaExample;

public class car {

	String name;
	static int wheels;
	String color;
	int price;
	
	public static void main(String[] args) {
		
		car c1 = new car();
		c1.name = "Tata";
		c1.price = 5000;
		c1.color= "white";
		//c1.wheels = 4;
		
		car c2 = new car();
		c2.name = "BMW";
		c2.price = 10000;
		c2.color= "Red";
		//c2.wheels = 4;
		
		System.out.println(c1.name+" "+c1.price+" "+c1.color+" "+car.wheels);
		System.out.println(c2.name+" "+c2.price+" "+c2.color+" "+c2.wheels);

	}

}

class wheelsCompany extends car{
	
	
	public static void main(String [] args)
	{
		wheelsCompany wc = (wheelsCompany) new car();
		
	}
	
}
