class VotingSystem
{
	public static void main(String[] args)
	{
		VotingSystem v1 = new VotingSystem();
		char vote = 'Y';
		String day = "THU";
		while(vote == 'Y')
		{
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
			vote = 'N';
		}
		
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
}