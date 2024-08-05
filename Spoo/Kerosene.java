class Kerosene
{
	double price;
	int quantity;
	boolean quality;
	public Kerosene()
	{
		System.out.println("created kerosene");
	}
	
	public Kerosene(double price,int quantity,boolean quality)
	{
		this.price=price;
		this.quantity=quantity;
		this.quality=quality;
		System.out.println("created kerosene with double,int,boolean");
	}
	
	public Kerosene(boolean quality){
		this.quality=quality;
		System.out.println("created kerosene with boolean");
	}
	
	public Kerosene(double price){
		this.price=price;
		System.out.println("created kerosene with double");
	}
}