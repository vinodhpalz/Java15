import java.util.*;
class VotingSystem
{
	public static int casteVote = 0;
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		VotingSystem v1 = new VotingSystem();
		String vote = "Y";
		String day = null;

		while(vote.equals("Y"))
		{
			System.out.println("Enter the Vote Day:");
			day = sc.next();
			switch(day)
			{
				case "MON":
					v1.casteVote();
					break;
				case "TUE":
					System.out.println("Votes cannot be casted on Tuesday except Monday");
					break;
				case "WED":
					v1.casteVote();
					break;
				default:
					System.out.println("Votes cannot be casted on other days except Monday");
					break;
				
			}
			System.out.println("Do you want to vote again (Y/N): ");
			vote = sc.next();
		}
		v1.totalVotes();
		
	}
	public void casteVote()
	{
		int age = 19;
		boolean voterId = true;
		boolean aadharCard = false;
		if(age >= 18)
		{	
			if((voterId == true) || (aadharCard == true))
			{
				System.out.println("Your Eligible to Vote");
				casteVote++;
			}
			else
			{
				System.out.println("Please bring either Voter Id/ Aadhar Card");
			}		
		}
		else
		{
			System.out.println("Your not eligible to vote becos of age criteria");
		}
	}
	
	public void totalVotes()
	{
		for(int count = 1; count<=casteVote ; count++)
		{
			System.out.println("Vote Count"+" "+count);
		}
	}















	
}