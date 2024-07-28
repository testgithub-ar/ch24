class RupeeRunner
{
	public static void main(String[] values)
	{
		System.out.println("starting main");
		
		Rupee rupee=new Rupee();
	   String type=rupee.type;
	   int quantity=rupee.quantity;
	   double price=rupee.price;
	   System.out.println("Rupee type is: "+type);
	   System.out.println("Rupee quantity is: "+quantity);
	   System.out.println("Rupee price is: "+price);
	   
	   AirConditioner airConditioner=new AirConditioner();
	   String company=airConditioner.company;
		int warranty=airConditioner.warranty;
		double acPrice=airConditioner.acPrice;
		 System.out.println("company: "+company);
	   System.out.println("warranty is: "+warranty);
	   System.out.println("acPrice: "+acPrice);
		
	   
	   AutoRikshaw autoRikshaw=new AutoRikshaw();
	   String companyName=autoRikshaw.companyName;
		int averagePerKm=autoRikshaw.averagePerKm;
		double pricePermeter=autoRikshaw.pricePermeter;
		System.out.println("companyName is: "+companyName);
	   System.out.println(" averagePerKm: "+averagePerKm);
	   System.out.println("pricePermeter is: "+pricePermeter);
	   
	   AutoDriver autoDriver=new AutoDriver();
	    String name=autoDriver.name;
		int age=autoDriver.age;
		double salary=autoDriver.salary;
		System.out.println("name: "+name);
	   System.out.println("age: "+age);
	   System.out.println("salary: "+salary);                                               
	   
	   Rapido rapido=new Rapido();
	    String brand=rapido.brand;
		String owner=rapido.owner;
		double cost=rapido.cost;
		System.out.println("brand: "+brand);
	   System.out.println("owner: "+owner);
	   System.out.println("cost: "+cost);
	   
	   CabCompany cabCompany=new CabCompany();
	   String Appname=cabCompany.Appname;
		String Ceo=cabCompany.Ceo;
		boolean goodAverage=cabCompany.goodAverage;
		System.out.println("Appname: "+Appname);
	   System.out.println("Ceo: "+Ceo);
	   System.out.println("goodAverage: "+goodAverage);
	   
	   BMTC bmtc=new BMTC();
	    String location=bmtc.location;
		int seats=bmtc.seats;
	    double ticketPrice=bmtc.ticketPrice;
		System.out.println("location: "+location);
	   System.out.println("seats: "+seats);
	   System.out.println("ticketPrice: "+ticketPrice);
	   
	   FoodDeliveryCompany foodDeliveryCompany=new FoodDeliveryCompany();
	   String item=foodDeliveryCompany.item;
		int rating=foodDeliveryCompany.rating;
	    double amount=foodDeliveryCompany.amount;
		System.out.println("item: "+item);
		System.out.println("rating: "+rating);
		System.out.println("amount: "+amount);
		
		
		
	   
	   
	   
	   System.out.println("end main");
	}
}
