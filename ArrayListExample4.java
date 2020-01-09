package Collections;
import java.util.ArrayList;
public class ArrayListExample4 {
	public static void main(String[] args) {
		// adding customers
		ArrayList<Customer> customers = new ArrayList<Customer>();
		Customer customer1 = new Customer("John" ,20000D);
		customer1.addTransaction(30000D);
		customer1.addTransaction(50000D);
		customers.add(customer1);
		Customer customer2 = new Customer("Tim" ,15000D);
		customer2.addTransaction(20000D);
		customers.add(customer2);
		//printing transactions
		for(int i=0; i<customers.size();i++)
		{
			Customer customer = customers.get(i);
			for(int k = 0;k<customer.getName().size();k++)
			{
				String customer_name = customer.getName().get(k);
				System.out.println(customer_name);
			}
			for(int j=0;j<customer.getTransactions().size();j++)
			{
				Double transaction = customer.getTransactions().get(j);
				System.out.println(transaction);
			}
		}
	}
}
class Customer
{
	private ArrayList<Double> transactions;
	private ArrayList<String> names;
	public Customer(String name,double initialAmount)
	{
		this.names = new ArrayList<String>();
		this.transactions = new ArrayList<Double>();
		addTransaction(initialAmount);
		addName(name);	
	}
	//staring the transaction in a seperate arrayList of type double
	public void addTransaction(double amount)
	{
		this.transactions.add(amount);
	}
	//staring the customer names in a seperate array list of type string
	public void addName(String c_name)
	{
		this.names.add(c_name);
	}
	public ArrayList<String> getName()
	{
		return names;
	}
	public ArrayList<Double> getTransactions()
	{
	    return transactions;	
	}
}





