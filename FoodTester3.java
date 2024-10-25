/*
 * Abhi Avasarala
 * Period 5
 * FoodTester3.java
 * 10/25
*/

public class FoodTester3 //making new class foodtester3
{ 
	public static void main(String args[]) //making a main method which calls the other classes and runs
	{
		System.out.println("\n\n\n"); //3 new lines
		Food3 food1 = new Food3("baked",	"banana",	"muffins", 50, 12); //instantiating the object for food1
		food1.printForSale();
		Food3 food2 = new Food3("fried","yam",	"fritters", 100, 3);//instantiating the object for food2
		food2.printForSale();
		Pizza3 pizza = new Pizza3("pepperoni", 250, 8);//instantiating the object for pizza
		pizza.printForSale();
		DeepDishPizza3 ddpizza = new DeepDishPizza3("cheese", 300, 10);//instantiating the object for ddpizza
		ddpizza.printForSale();
		System.out.println("\n\n\n"); //3 new lines
	}
}

