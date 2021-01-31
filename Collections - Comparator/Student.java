import java.util.*;
class Student
{
	private String sName;
	private int sAge;
	public Student(String sName, int sAge)
	{
		this.sName = sName;
		this.sAge = sAge;	
	}
	public String getName()
	{
		return sName;
	}
	public int getAge()
	{
		return sAge;
	}
}