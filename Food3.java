/*
 * Abhi Avasarala
 * Period 5
 * Food3.java
 * 10/25
*/


public class Food3
{
	protected String str; //declares and initilizes variables
	protected String revenue;
	
	public Food3 () //food3 default constructor
	{
		str = new String(""); //This line creates a new String stored in str
	}
	
	public Food3 (String prepMethod, String ingredient, String name, int countIn, double costIn) //overloads food3 constructor
	{	
		revenue = String.format("$%.2f", (double)costIn * countIn/100.0); //calculates revenue
		str = "At the sale: " + name + " " + prepMethod + " with " + ingredient + " " + "will be sold for " + countIn + " " + 
			"cents each. With " + costIn + " " + name + "(s), " + revenue + " " + "can be made."; // formats the information to be printed
	}
	public void printForSale() //creates method printForSale which prints str
	{
		System.out.println(str);
	}
}
