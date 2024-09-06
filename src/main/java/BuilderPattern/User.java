package BuilderPattern;

public class User {

	public static void main(String[] args) {

		
		EcomApp eApp = new EcomApp();
		eApp.doLogin().doSearch("Shoe", 500, "Nike").addToCart().doPayment("4444555552556", "566")
		.orderDispatch();
		
		
		
		
	}

}
