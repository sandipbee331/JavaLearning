package BuilderPattern;

public class EcomApp {
	
	
	public EcomApp doLogin()
	{
		System.out.println("Guest user login");
		return this;
	}
	
	public EcomApp doLogin(String un, String pass)
	{
		System.out.println("User login with : "+un+":"+pass);
		return this;
	}

	public EcomApp doSearch(String productName)
	{
		System.out.println("Search with the product name: "+productName);
		return this;
	}
	
	public EcomApp doSearch(String productName, int price )
	{
		System.out.println("Search product :"+productName + ":" +price);
		return this;
	}
	
	public EcomApp doSearch(String productName, int price, String brand)
	{
		System.out.println("Search product :"+productName+ ":"+price +":" +brand);
		return this;
	}
	
	public EcomApp addToCart()
	{
		System.out.println("Product added into the cart");
		return this;
	}
	
	public EcomApp doPayment()
	{
		System.out.println("Cash on Delivery");
		return this;
	}
	public EcomApp doPayment(String UPI)
	{
		System.out.println("Payment done by UPI"+UPI);
		return this;
	}
	public EcomApp doPayment(String CCNo, String CVV)
	{
		System.out.println("Credit Card details are : "+CCNo +":"+CVV);
		return this;
	}
	
	public EcomApp orderDispatch()
	{
		System.out.println("Order dispatched");
		return this;
	}
}
