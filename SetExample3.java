package Set;
import java.util.HashSet;
import java.util.Scanner;
public class SetExample3 {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in); 
		HashSet<String> a= new HashSet<String>();
		System.out.println("Is popular cities set Empty? : " +a.isEmpty());
		a.add("London");
		a.add("New York");
		a.add("Paris");
		a.add("Dubai");
		System.out.println("Number of cities in the hashset : " +a.size());
		if(a.contains("Paris"))
		{
			System.out.println("Paries is in the popular cites set.");
		}

	}

}
