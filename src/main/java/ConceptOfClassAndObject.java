
public class ConceptOfClassAndObject {
	
	String name;
	int age;
	String city;
	String company;

	public static void main(String[] args) {

		ConceptOfClassAndObject obj = new ConceptOfClassAndObject();
		ConceptOfClassAndObject objone = new ConceptOfClassAndObject();
		ConceptOfClassAndObject objtwo = new ConceptOfClassAndObject();
		//Objects are stored on heap memory and reference variable stored in Stack memory
		obj.name = "Ankit";
		obj.age = 20;
		obj.city = "JPNagar";
		obj.company = "Delhi";
		
		objone.name = "Shiva";
		objone.age = 25;
		objone.city = "RamNagar";
		objone.company = "Lucknow";
		
		objtwo.name = "Puja";
		objtwo.age = 29;
		objtwo.city = "Pune";
		objtwo.company = "Delhi";
		
		System.out.println(obj.name+" "+ obj.age +" "+ obj.city+" "+obj.company);
		System.out.println(objone.name+" "+ objone.age +" "+ objone.city+" "+objone.company);
		System.out.println(objtwo.name+" "+ objtwo.age +" "+ objtwo.city+" "+objtwo.company);
		
	}

}
