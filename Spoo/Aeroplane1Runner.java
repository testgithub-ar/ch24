class Aeroplane1Runner
{
	public static void main(String[] args)
	{
		System.out.println("starting main");
		
		Aeroplane1 aeroplane1=new Aeroplane1();
		
		String company=aeroplane1.company;
	    int noOfSeats=aeroplane1.noOfSeats;
	    double ticketPrice=aeroplane1.ticketPrice;
	    String source=aeroplane1.source;
	    String destination=aeroplane1.destination;
		
		aeroplane1.company="Airbus";
		aeroplane1.noOfSeats=100;
		aeroplane1.ticketPrice=50000;
		aeroplane1.source="India";
		aeroplane1.destination="Japan";
		
		System.out.println("company:"+aeroplane1.company);
	    System.out.println("noOfSeats:"+aeroplane1.noOfSeats);
	    System.out.println("ticketPrice:"+aeroplane1.ticketPrice);
		System.out.println("source:"+aeroplane1.source);
	    System.out.println("destination:"+aeroplane1.destination);
		
		Aeroplane1 aeroplane2=new Aeroplane1("Safron","Bangaluru","Delhi");
		System.out.println("company:"+aeroplane2.company);
		System.out.println("source:"+aeroplane2.source);
	    System.out.println("destination:"+aeroplane2.destination);
		
		Aeroplane1 aeroplane3=new Aeroplane1("Air India",80000,"Bangaluru","USA");
		System.out.println("company:"+aeroplane3.company);  
	    System.out.println("ticketPrice:"+aeroplane3.ticketPrice);
		System.out.println("source:"+aeroplane3.source);
	    System.out.println("destination:"+aeroplane3.destination);
	}
}