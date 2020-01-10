package Set;
import java.util.*;
public class SetExample1 {

	public static void main(String args[])
	{
		Scanner S= new Scanner(System.in);
		int n1= S.nextInt();
		int x;
		HashSet<Integer> a= new HashSet<Integer>();
		for(int i=0; i<n1; i++)
		{
			x=S.nextInt();
			a.add(new Integer(x));
		}
		int n2= S.nextInt();
		HashSet<Integer> b= new HashSet<Integer>();
		for(int i=0; i<n2; i++)
		{
			x=S.nextInt();
			b.add(new Integer(x));
		}
		HashSet<Integer> c= new HashSet<Integer>(a);
		c.addAll(b);//Union
		HashSet<Integer> d= new HashSet<Integer>(a);
		d.retainAll(b); //Intersection
		System.out.println("Union: "+c);
		System.out.println("Intersection: "+d);
		HashSet<Integer> e= new HashSet<Integer>(a);
		e.removeAll(b); //Symmetric Difference
		System.out.println("Symmetric Difference: "+e);
	}
 

}
