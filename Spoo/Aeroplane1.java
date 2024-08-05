class Aeroplane1
{
	String company;
	int noOfSeats;
	double ticketPrice;
	String source;
	String destination;
	
	public Aeroplane1(){
		System.out.println("created Airoplane");
	}
	
	public Aeroplane1(String company,int noOfSeats,double ticketPrice,String source,String destination){
		this.company=company;
		this.noOfSeats=noOfSeats;
		this.ticketPrice=ticketPrice;
		this.source=source;
		this.destination=destination;
		System.out.println("created Airoplane with 3 String,double and int");
	}
	
		
		public Aeroplane1(String company,String source,String destination){
		this.company=company;
		this.source=source;
		this.destination=destination;
		System.out.println("created Airoplane with 3 String");
			
		}
		
		public Aeroplane1(String company,double ticketPrice,String source,String destination){
		this.company=company;
		this.ticketPrice=ticketPrice;
		this.source=source;
		this.destination=destination;
		System.out.println("created Airoplane with 3 String and double ");
}
}
