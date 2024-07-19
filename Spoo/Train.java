class Train
{
	public static void book(String source,String destination)
	{
	System.out.println("running two string parameter in Train");
	System.out.println("source: "+source);
	System.out.println("destination: "+destination);
	}
	
	public static void book(String source,String destination,int quantity)
	{
	System.out.println("running two string and one int parameter in Train");
	System.out.println("source: "+source);
	System.out.println("destination: "+destination);
	System.out.println("quantity: "+quantity);

	}
	
	public static void book(String source,String destination,int quantity,double price)
	{
		System.out.println("running two string ,one intand one double parameter in Train");
	System.out.println("source: "+source);
	System.out.println("destination: "+destination);
	System.out.println("quantity: "+quantity);
	System.out.println("price: "+price);


	}
	
		public static void cancel(long ticketNo)
	{
	System.out.println("running long parameter in Train");
	System.out.println("ticketNo: "+ticketNo);
	
	}
	public static void cancel(String source,String destination)
	{
	System.out.println("running two string parameter in Train");
	System.out.println("source: "+source);
	System.out.println("destination: "+destination);
	}
	
	
	
	
}
