package Collections;
import java.util.*;
public class ArrayListExample1
{
	public static void main(String args[])
	{
		ArrayList<String> groceryList= new ArrayList<String>(); //array list declaration
		groceryList.add("Spice-Mixture"); //to add spice-mixture
		groceryList.add("Cumin"); //to add Cumin
		System.out.println(groceryList);
		groceryList.remove("Cumin"); //to remove Cumin
		groceryList.remove(0); //to remove 0th index value
		System.out.println(groceryList);
	}
}
