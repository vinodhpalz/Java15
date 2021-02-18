class ThreadJob
{
	public static void main(String[] args)
	{
		try
		{
			Job j = new Job();
			Thread t1 = new Thread(j);
			t1.setName("Score");
			Thread t2 = new Thread(j);
			t2.setName("Timer");
			Thread t3 = new Thread(j);
			t3.setName("Execute");
			
			t1.setPriority(10);
			t2.setPriority(5);
			t3.setPriority(1);
			t1.start();
			t2.start();
			t3.start();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}	
}