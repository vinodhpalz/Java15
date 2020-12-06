class TestOperators
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = 0;
		b = a++ + ++a;
		System.out.println(a); //12
		System.out.println(b); //22
		System.out.println(b++);//22
		System.out.println(++b);//24
		
		a += 10; // a = a + 20;
		int c = 34;
		System.out.println(a);
		//22, 24, 34

		System.out.println(a==b);

		if((a>b)&&(a>c))
		{
			System.out.println("a is a bigger number");
		}
		else if(b>c)
		{
			System.out.println("b is a bigger number");
		}
		else
		{
			System.out.println("c is a bigger number");
		}

		System.out.println(8>>1);
		// 0 -> 0000, 1-> 0001, 2-> 0010, 3->0011, 4->0100, 5->0101, 6->0110, 7->0111, 8->1000
		// 5 -> 0101, 0101 ^ 0001 -> 0100
		// ~5 -> 1010 = 10




		
		
	}
}