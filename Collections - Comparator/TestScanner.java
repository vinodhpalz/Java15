// Scanner class can be used to accept input from a user at runtime
import java.util.*;

class TestScanner
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int age = sc.nextInt();
		float weight = sc.nextFloat();
		
		System.out.println(name+" "+age+" "+weight);
	}
}