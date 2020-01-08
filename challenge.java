package Collections;
import java.util.*;
public class challenge
{
	public static void main(String args[])
	{
		ArrayList<String> groceryList= new ArrayList<String>();
		groceryList.add("Spice-Mixture");
		groceryList.add("Cumin");
		System.out.println(groceryList);
		groceryList.remove("Cumin");
		groceryList.remove(0);
		System.out.println(groceryList);
	}
}
