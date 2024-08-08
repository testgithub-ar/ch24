class CapitalCity
{
	String name;
	long population;
	public CapitalCity(String name, long population)
	{
		this.name=name;
		this.population=population;
	}
	
	public void show()
	{
		System.out.println("Name: " + name);
		System.out.println("population: " + population);
	}
}