class Job implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}		
}


