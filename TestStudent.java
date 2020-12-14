class TestStudent
{
	public static void main(String[] args)
	{
		Student s1 = new Student();
		s1.setStudentAge(20);
		int age = s1.getStudentAge();
		if (age >= 18)
		{
			System.out.println("Eligible to Vote");
		}
		else
		{
			System.out.println("Not Eligible to Vote");
		}
	
	}
}