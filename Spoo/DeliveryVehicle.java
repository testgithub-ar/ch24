class DeliveryVehicle
{
	public static void  deliver(String item,String location)
	{
		System.out.println("running deliver in  DeliveryVehicle");
		System.out.println("item"+item);
		System.out.println("Location"+location);
		 
		 Company.deliver(item,location);

	}
}