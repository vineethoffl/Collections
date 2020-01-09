package Collections;
import java.util.*;
public class LinkedListexample2
{
	public static void main(String args[])
	{
		Scanner S= new Scanner(System.in);
		int n= S.nextInt();
		LinkedList<String> a= new LinkedList<String>();
		for(int i=0; i<n; i++)
		{
			a.add(S.next());
		}
		int m= S.nextInt();
		ArrayList<String> b= new ArrayList<String>();
		for(int j=0; j<n; j++)
		{
			b.add(S.next());
		}
		System.out.println("Actual LinkedList: "+a);
		a.addAll(b);
		System.out.println("After Copy: "+a);
	}
}
