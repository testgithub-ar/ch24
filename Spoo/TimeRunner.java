class TimeRunner
{
	public static void main(String[] args)
	{
		System.out.println("running main");
		
		double price=Time.price("dolo650");
		System.out.println("price:"+price);
		
		price=Time.price("dolo650");
		System.out.println("price:"+price);
		
		price=Time.price("paracetmol");
		System.out.println("price:"+price);
		
		price=Time.price("Chesten Cold");
		System.out.println("price:"+price);
		
		String medicineName=Time.check("fever");
		System.out.println("medicineName:"+medicineName);
		
		medicineName=Time.check("headache");
		System.out.println("medicineName:"+medicineName);
		
		medicineName=Time.check("Itching");
		System.out.println("medicineName:"+medicineName);
		
		medicineName=Time.check("nothing");
		System.out.println("medicineName:"+medicineName);
		
		String availability=Time.look("Spoorti");
		System.out.println("availability:"+availability);
		
		availability=Time.look("Rohit");
		System.out.println("availability:"+availability);
		
		availability=Time.look("Nikhil");
		System.out.println("availability:"+availability);
		
		availability=Time.look("Jk");
		System.out.println("availability:"+availability);
		
		
		
		
	}
}