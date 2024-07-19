class DeliveryGuy
{
	public static void  deliver(String item)
	{
		System.out.println("running deliver in  DeliveryGuy");
		
		System.out.println("Item"+item);
		
		DeliveryVehicle.deliver(item," Rajaji Nagar");
		
		
	}
}