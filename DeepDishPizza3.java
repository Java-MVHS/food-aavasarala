/*
 * Abhi Avasarala
 * Period 5
 * DeepDishPizza3.java
 * 10/25
 * 
 * Today we are creating food3, deepdishpizza3, foodtester3, and pizza3 in order to run code that prints out a sale of items
 * at a certain cost.
*/

public class DeepDishPizza3 extends Pizza3 //making new class taht extends pizza3
{
	
	public DeepDishPizza3(String ingredientIn, int countIn, int costIn) //makes the overloaded constructor
	{
		super(ingredientIn, "deep dish pizza", countIn, costIn); //calls pizza3 constructor using these values
	}
}
