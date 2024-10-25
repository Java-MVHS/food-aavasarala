/*
 * Abhi Avasarala
 * Period 5
 * Pizza3.java
 * 10/25
*/

public class Pizza3 extends Food3  //making new class that extends Food3
{
	public Pizza3(String IngredientIn, int countIn, int costIn) //makes the overloaded constructor with 3 parameters
	{
		super("baked", IngredientIn,"pizza", countIn, costIn); //calling super constructor with these values
	}
	
	public Pizza3(String IngredientIn, String nameIn, int countIn, int costIn) //overloaded constructoer with 4 parameters
	{
		super("baked", IngredientIn, nameIn, countIn, costIn); // calling constructor of super with these values
	}
	
}

