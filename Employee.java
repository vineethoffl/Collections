package Set;

public class Employee implements Comparable<Employee>
{
private String name;
private int age;
public String getName()
{
	return name;
}

public void setName(String name) 
{
	this.name=name;
}
public int getAge()
{
	return age;
}
public void setAge(int age)
{
	this.age=age;
}
@Override
public int compareTo(Employee e) {
	// TODO Auto-generated method stub
	return 1;
}
}
