class Student
{
	private int studentAge;
		
	//setters and getters
	public void setStudentAge(int studAge)
	{
		if((studAge >= 18)&&(studAge <=100))
		{
			studentAge = studAge;
		}
		else
		{
			System.out.println("Invalid Age");
		}
	}
	public int getStudentAge()
	{
		return studentAge;
	}
}
	