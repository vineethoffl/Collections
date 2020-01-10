package Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class SetExample2 {

	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int i;
		ArrayList<Integer> a= new ArrayList<Integer>(); 
		for(i=0;i<n;i++)
		{
			a.add(s.nextInt()); 
		}
		System.out.println("The list is: "+a);
		HashSet<Integer> b= new HashSet<Integer>();
		b.addAll(a);
		System.out.println("The set is: "+b);
	}
}
