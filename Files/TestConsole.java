import java.io.*;
class TestConsole
{
	public static void main(String[] args)
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter your Name: ");
			String name = br.readLine();
			System.out.println("Enter your Age: ");
			int age = Integer.parseInt(br.readLine());
			System.out.println("Name is :"+ name);			
			System.out.println("age is :"+ age);

		}
		catch(Exception e)
		{
			e.printStackTrace();	
		}
	}
}
