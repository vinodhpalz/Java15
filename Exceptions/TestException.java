//Exceptions

//throw and throws

//throw keyword is used for throwing an exception
//throws keyword is used for declaring an exception
class TestExceptions
{
	public void divide(int x, int y)throws Exception
	{
		if(y == 0)
		{
			throw new ArithmeticException();
		}
		else
		{
			int a = x;
			int b = y;
			int c = a/b;
			System.out.println(c);
		}
	}
	public static void main(String[] args)
	{
		boolean b1 = false;
		TestExceptions te = new TestExceptions();
		try
		{
			te.divide(9,0);
				
		}
		catch(Exception e)
		{
			b1 = true;
			e.printStackTrace();
		}
		finally
		{
			if(b1)
			{
				return;
			}
		}
		System.out.println("Code Execution Continues...");
	}
}