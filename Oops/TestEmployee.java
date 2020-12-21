class TestEmployee
{
	public static void main(String[] args)
	{
		Employee e1; // int a;
		e1 = new TeamLead();
		e1.getSalary();
		TeamLead tl = (TeamLead)e1; //typecasting
		tl.getSalary(50000);
		e1 = new Developer();
		e1.getSalary();
		Developer d = (Developer)e1;
		d.developApps();
	}
}