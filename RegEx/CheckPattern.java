import java.util.regex.*;

public class CheckPattern
{
	public static void main(String[] args)
	{
		try
		{
			String input = "abc";
			String regEx = "[A-z][A-z][A-z]";
			Pattern pa = Pattern.compile(regEx);
			Matcher ma = pa.matcher(input);
		
			if(ma.matches()) {
				System.out.println("Match Found");
			}
			else
			{
				System.out.println("Match Not Found");
			}
		}
		catch(PatternSyntaxException pe)
		{
			pe.printStackTrace();
		}
		
	}
}