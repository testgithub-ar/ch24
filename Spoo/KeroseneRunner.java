class KeroseneRunner
{
	public static void main(String[] args)
	{
		System.out.println("starting main");
		Kerosene kerosene=new Kerosene();
		double price=kerosene.price;
	    int quantity=kerosene.quantity;
	    boolean quality=kerosene.quality;
		kerosene.price=300;
		kerosene.quantity=500;
		kerosene.quality=true;
	   System.out.println("price:"+kerosene.price);
	   System.out.println("quantity:"+kerosene.quantity);
	   System.out.println("quality:"+kerosene.quality);
	   
	   Kerosene kerosene1=new Kerosene(false);
	   System.out.println("quality:"+kerosene1.quality);
	   
	   Kerosene kerosene2=new Kerosene(500);
	   System.out.println("price:"+kerosene2.price);
	   System.out.println("end main");
	}
}