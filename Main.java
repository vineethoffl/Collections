package Collections;
import java.util.*;
public class Main{

	public static void main(String[] args) 
	{
		ArrayList<Contact> contacts= new ArrayList<Contact>();
		Contact firstContact=new Contact("Tim", "9605845672");
		Contact secondContact=new Contact("John", "9605557678");
		contacts.add(firstContact);
		contacts.add(secondContact);
		for(int i=0; i<contacts.size();i++)
		{
			System.out.println(contacts.get(i).getName());
			System.out.println(contacts.get(i).getPhoneNumber());
		}
		
	}

}
class Contact
{
private String name;
private String PhoneNumber;
public Contact(String name,String PhoneNumber) 
     {
     this.name=name;
     this.PhoneNumber=PhoneNumber;
     }
	public String getName()
	{
		return(name);
	}
	public String getPhoneNumber()
	{
		return(PhoneNumber);
	}
}


