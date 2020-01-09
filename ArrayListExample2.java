package Collections;
import java.util.*;
public class ArrayListExample2
{

	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int i;
		ArrayList<String> stationary= new ArrayList<String>(); // Array list declaration with string
		for(i=0;i<n;i++)
		{
			stationary.add(s.next()); //to add the value
		}
		System.out.println(stationary);
		for(i=n-1; i>=0; i--)
		{
			System.out.print(stationary.get(i)+" "); //to print the reverse order
		}
	}
}