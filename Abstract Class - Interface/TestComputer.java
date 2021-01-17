class TestComputer
{
	public static void main(String[] args)
	{
		Computer obj = new Computer();
		float x = obj.getModel();	
		float y = x - 0.45f;
		System.out.println(y);
	}
}