class Bus
{
	public static String transport(String location)
	{
		System.out.println("running transport in Bus");
	    System.out.println("location "+location);
		if(location=="Bengaluru")
		{
		return "karnataka";
		}
		else
		{
		return "other state";
		}
		
	}
}