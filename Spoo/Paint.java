class Paint
{
	public static void apply(String brand)
	{
	System.out.println("running string parameter in Paint");
	System.out.println("Brand: "+brand);
	}
	

    public static void add(String brand,String colour)
	{
	System.out.println("running two string parameter in Paint");
	System.out.println("Brand: "+brand);
	System.out.println("Colour: "+colour);
	}
	
	public static void brush(String brand,double price)
	{
	System.out.println("running one string and one int parameter in Paint");
	System.out.println("Brand: "+brand);
	System.out.println("Price: "+price);
	}
	
	public static void put(String colour, String type ,double price)
	{
	System.out.println("running two string and one int parameter in Paint");
	System.out.println("colour: "+colour);
	System.out.println("type: "+type);
	System.out.println("Price: "+price);
	}
	
	
}

