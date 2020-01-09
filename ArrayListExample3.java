package Collections;
import java.util.*;
public class ArrayListExample3 {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		ArrayList<Integer> mark=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			mark.add(s.nextInt());
		}
		System.out.println(mark);
		Collections.sort(mark); //  to sort the ArrayList
		System.out.println(mark);

	}

}
