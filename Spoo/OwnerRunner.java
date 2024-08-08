class OwnerRunner
{
	public static void main(String[] args)
	{
		System.out.println("starting main");
		Hotel1 hotel1=new Hotel1();
		hotel1.print();
		System.out.println("...........................................................");
	
	   Company1 company1=new Company1(17,"TCS","White Field");
	   company1.display();
	   System.out.println("...........................................................");
	   
	   Country2 country2=new Country2("India","Asia");
	   country2.show();
	}
}