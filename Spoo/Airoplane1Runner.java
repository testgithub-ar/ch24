class Airoplane1Runner
{
	public static void main(String[] args)
	{
		System.out.println("starting main");
		
		Airoplane1 airoplane1=new Airoplane1();
		
		String company=airoplane1.company;
	    int noOfSeats=airoplane1.noOfSeats;
	    double ticketPrice=airoplane1.ticketPrice;
	    String source=airoplane1.source;
	    String destination=airoplane1.destination;
		
		airoplane1.company="Airbus";
		airoplane1.noOfSeats=100;
		airoplane1.ticketPrice=50000;
		airoplane1.source="India";
		airoplane1.destination="Japan";
		
		System.out.println("company:"+airoplane1.company);
	    System.out.println("noOfSeats:"+airoplane1.noOfSeats);
	    System.out.println("ticketPrice:"+airoplane1.ticketPrice);
		System.out.println("source:"+airoplane1.source);
	    System.out.println("destination:"+airoplane1.destination);
		
		Airoplane1 airoplane2=new Airoplane1("Safron","Bangaluru","Delhi");
		System.out.println("company:"+airoplane2.company);
		System.out.println("source:"+airoplane2.source);
	    System.out.println("destination:"+airoplane2.destination);
		
		Airoplane1 airoplane3=new Airoplane1("Air India",80000,"Bangaluru","USA");
		System.out.println("company:"+airoplane3.company);  
	    System.out.println("ticketPrice:"+airoplane3.ticketPrice);
		System.out.println("source:"+airoplane3.source);
	    System.out.println("destination:"+airoplane3.destination);
	}
}