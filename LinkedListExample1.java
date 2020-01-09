package Collections;
import java.util.*;
public class LinkedListExample1 {

	public static void main(String[] args) 
	{
		LinkedList<String> wo=new LinkedList<String>();
		wo.add("Competition");
		wo.add("Be positive");
		wo.add("Happy Day");
		//traversing using for
        for(String b:wo)
        {
            System.out.println(b);
        }
        //traversing using iterator
        Iterator itr=wo.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
	}
}





