import java.io.*;
import java.util.*;
class TestFileToFile
{
	public static void main(String[] args)
	{
		BufferedReader br = null;
		PrintWriter pw = null;
		PrintWriter pw1 = null;
		try
		{
			br = new BufferedInputStream(new FileInputStream("Day.java"));
			pw = new PrintStream(new FileOutputStream("output.java"));
			pw1 = new PrintStream(new FileOutputStream("ExceptionLogs.txt"));
			
			String s1 = br.readLine();
			while(s1 != null)
			{
				pw.println(s1);
				s1 = br.readLine();
			}
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
