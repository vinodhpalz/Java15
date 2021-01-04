class Department
{
	public final int X = 45;
	public static int a;
	static
	{
		a = 10;
		System.out.println("Static Block Invoked");	
	}
	public static void accept()
	{
		a++;
		X++;
		System.out.println("Department accepts "+a);
	}
}