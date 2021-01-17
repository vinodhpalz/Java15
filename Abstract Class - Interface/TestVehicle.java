class TestVehicle
{
	public static void main(String[] args)
	{
		Vehicle c1;
		c1 = new Car();
		c1.drive();
		Car car = (Car)c1;
		car.playMusic();
		car.findLocation();
		
		c1 = new Bus();
		c1.drive();
		Bus bus = (Bus)c1;
		bus.playMusic();
		bus.findLocation();

		Mobile m1 = new Mobile();
		m1.playMusic();
		m1.findLocation();
	}
}