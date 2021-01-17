class TestEmployee
{
	public static void main(String[] args)
	{
		Employee e;
		e = new Developer();
		e.getSalary();
		e.payTax();
		e = new TeamLead();
		e.getSalary();
		e.payTax();
	}
}