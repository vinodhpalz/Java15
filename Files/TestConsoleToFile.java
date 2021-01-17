import java.io.*;
import java.util.*;
class TestConsoleToFile
{
	public static void main(String[] args)
	{
		BufferedReader br = null;
		PrintWriter pw = null;
		PrintWriter pw1 = null;
		try
		{
			br = new BufferedReader(new InputStreamReader(System.in));
			pw = new PrintWriter(new FileWriter("output.txt"));
			pw1 = new PrintWriter(new FileWriter("ExceptionLogs.txt"));
			System.out.println("Enter your Name: ");
			String name = br.readLine();
			System.out.println("Enter your Age: ");
			int age = Integer.parseInt(br.readLine());
			
			pw.println(name);
			pw.println(age);
			
			pw.flush();
			pw.close();	


		}
		catch(Exception e)
		{
			pw1.println(new Date());
			pw1.println(e.getMessage());
			pw1.flush();
			pw1.close();	
		}
	}
}
