import java.io.*;
class TestFileToConsole
{
	public static void main(String[] args)
	{
		BufferedReader br = null;
		try
		{
			br = new BufferedReader(new FileReader("Day.java"));
			String s1 = br.readLine();
			while(s1 != null)
			{
				System.out.println(s1);
				s1 = br.readLine();
			}			

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
