package organization;
public class Employee
{
	public int empId;
	private float empSalary;
	public float tax;
	public float taxPer;
	public Employee()
	{
		taxPer = 10;
		System.out.println("Constructor Invoked");
	}
	public Employee(float taxPer)
	{
		this.taxPer = taxPer;
	}
	
	public void getEmpDetails(float empSalary)
	{	
		tax = empSalary / taxPer;
		this.empSalary = empSalary - tax;
		System.out.println("Employee Details Received "+empId+" "+this.empSalary);
	}
	public void getTaxDetails()
	{
		System.out.println("Tax Details of employee "+ empId + " is "+tax);
	}
}