package JavaExample;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ObjectCreationTest {
	
	String name;
	int age;
	String city;

	public static void main(String[] args) {

		
		ObjectCreationTest oct1 = new ObjectCreationTest();
		oct1.name = "Ravi";
		oct1.age = 20;
		oct1.city ="LA";
		
		ObjectCreationTest oct2 = new ObjectCreationTest();
		oct2.name = "Pooja";
		oct2.age = 25;
		oct2.city ="London";
		
		ObjectCreationTest oct3 = new ObjectCreationTest();
		oct3.name = "Geeta";
		oct3.age = 30;
		oct3.city ="Delhi";
		
		ObjectCreationTest oct4 = new ObjectCreationTest();
		oct4.name = "Pankaj";
		oct4.age = 32;
		oct4.city ="Singapore";
		
		oct1 =oct2;
		oct2 = oct3;
		oct4 = oct1;
		
		System.out.println(oct1.name+""+oct1.age+""+oct1.city);
		System.out.println(oct2.name+""+oct2.age+""+oct2.city);
		System.out.println(oct3.name+""+oct3.age+""+oct3.city);
		System.out.println(oct4.name+""+oct4.age+""+oct4.city);
		
		String d[] = oct1.getEmployeeDevices("55");
		
		System.out.println(Arrays.toString(d));
		
	}
	
	public String[] getEmployeeDevices(String empName)
	{
		System.out.println("getting the device of the employee : " +empName);
	
		
		if(empName.trim().equalsIgnoreCase("Ravi"))
		{
			String device[] = {"Laptop HP", "iPhone12", "Tablet"};
			return device;
		}
		
		else if(empName.trim().equalsIgnoreCase("Mahesh"))
		{
			String device[] = {"iPhone12", "Tablet"};
			return device;
		}
		else if(empName.trim().equalsIgnoreCase("Deepti"))
		{
			String device[] = {"MAC book pro", "iPhone12", };
			return device;
		}
		else 
		{
			System.out.println("Employee name is not matched : " +empName);
			return null;
		}
		
	}
	
	public void getEmployeeDevicesWithSwitchCase(String empName)
	{
		System.out.println("getting the device of the employee : " +empName);
		
		switch(empName.trim())
		{
		case "Ravi":
			String device[] = {"Laptop HP", "iPhone12", "Tablet"};
			break;
		case "Om":
			//String device[] = {"Laptop HP", "iPhone12", "Tablet"};
			break;
		}
	}

}
