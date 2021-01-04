package test;
import organization.Employee;
import organization.Manager;
class TestEmployee
{
	public static void main(String[] args)
	{
		/*Employee emp = new Employee();
		emp.empId = 100;
		emp.getEmpDetails(53000f);
		emp.getTaxDetails();*/

		Manager m1 = new Manager();
		m1.getEmpDetails();
	}
}