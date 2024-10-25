/* 
  Food.java
  
*/
public class Food 
{
	protected String str; 
	
	public Food ()
	{
		str = new String(""); //This line creates a new String stored in str
	}
	
	public Food (String prepMethod, String ingredient, String name)
	{	
		str = "At the sale: " + name + " " + prepMethod + " with " + ingredient;
	}

	public void printForSale()
	{
		System.out.println(str);
	}
}
