class BloodRunner
{
	public static void main(String[] args)
	{
		System.out.println("running main in BloodRunner");
		char group=Blood.group();
		System.out.println("returning group :"+group);
		
		String name=Blood.name();
		System.out.println("name :"+name);
		
		double cost=Blood.cost();
		System.out.println("cost :"+cost);
		
		boolean hospitalTested=Blood.hospitalTested();
		System.out.println("hospitalTested :"+hospitalTested);
		
		
		boolean sickOrNot=Blood.sickOrNot();
		System.out.println("sickOrNot:"+sickOrNot);
		
		boolean donateOrNot=Blood.donateOrNot();
		System.out.println("donateOrNot:"+donateOrNot);
		
		
		int carat=Chain.carat();
		System.out.println("carat :"+carat);
		
		
		double costPerGram=Chain.costPerGram();
		System.out.println("costPerGram :"+costPerGram);
		
		
		String type=Chain.type();
		System.out.println("type :"+type);
		
		
		String quality=Chain.quality();
		System.out.println("quality :"+quality);
		
		
		int quantity=Chain.quantity();
		System.out.println("quantity :"+quantity);
		
		
	     int wastage=Chain.wastage();
		System.out.println("wastage :"+wastage);
		
		
		double serviceCharge=Chain.serviceCharge();
		System.out.println("serviceCharge :"+serviceCharge);
		
		int gst=Chain.gst();
		System.out.println("gst:"+gst);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
