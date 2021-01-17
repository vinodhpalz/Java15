class Bus extends Vehicle implements MusicPlayer, GPSSystem
{
	public void drive()
	{
		System.out.println("Your driving a bus");
	}
	public void playMusic()
	{
		System.out.println("Playing Music in Bus");
	}
	public void findLocation()
	{
		System.out.println("Location of Bus Found");
	}
}