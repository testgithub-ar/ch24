class ChargerRunner
{
public static void main(String[] args)
{
	System.out.println("starting main");
	Charger charger=new Charger();
	 String brand= charger.brand;
	 int warranty=charger.warranty;
	 double price=charger.price;
	 
	 charger.brand="samsung";
	 charger.warranty=10;
	    System.out.println("brand: "+charger.brand);
		System.out.println("warranty: "+charger.warranty);
		System.out.println("price: "+charger.price);


    Claw claw=new Claw();
	String animal=claw.animal;
	String shape=claw.shape;
	int noOfNails=claw.noOfNails;
	claw.animal="cat";
	claw.noOfNails=4;
	System.out.println("animal: "+claw.animal);
	System.out.println("shape: "+claw.shape);
	System.out.println("noOfNails: "+claw.noOfNails);
		
	Crow crow=new Crow();
	String colour=crow.colour;
	String consume=crow.consume;
	crow.consume="rice grains";
	boolean good=true;
	System.out.println("colour: "+crow.colour);
	System.out.println("consume: "+crow.consume);
	System.out.println("good: "+crow.good);
	
	
	Clock clock=new Clock();
	String shape1=clock.shape1;
	int noOfdigits=clock.noOfdigits;
	double cost=clock.cost;
	clock.shape1="circle";
	clock.cost=1000;
	System.out.println("shape1: "+clock.shape1);
	System.out.println("noOfdigits: "+clock.noOfdigits);
	System.out.println("cost: "+clock.cost);
	
	Lolipop lolipop=new Lolipop();
	String shapeOfLolipop=lolipop.shapeOfLolipop;
	double priceForEach=lolipop.priceForEach;
    boolean tasteGood=lolipop.tasteGood;
	lolipop.shapeOfLolipop="heart";
	lolipop.tasteGood=true;
	System.out.println("shape1: "+lolipop.shapeOfLolipop);
	System.out.println("noOfdigits: "+lolipop.priceForEach);
	System.out.println("cost: "+lolipop.tasteGood);
	
	Jean jean=new Jean();
	String brand1=jean.brand1;
	double priceOfJean=jean.priceOfJean;
    String type=jean.type;
	jean.brand1="ck";
	jean.type="skinny";
	
	System.out.println("brand: "+jean.brand1);
	System.out.println("priceOfJean: "+jean.priceOfJean);
	System.out.println("type: "+jean.type);
	
	Keyboard keyboard=new Keyboard();
	String colour2=keyboard.colour2;
	double keyboardPrice=keyboard.keyboardPrice;
    String type_ofKeyboard=keyboard.typeOfKeyboard;
	keyboard.keyboardPrice=300;
	keyboard.typeOfKeyboard="wireless";
	System.out.println("colour2: "+keyboard.colour2);
	System.out.println("keyboardPrice: "+keyboard.keyboardPrice);
	System.out.println("type_ofKeyboard: "+keyboard.typeOfKeyboard);
	
	
	Mountain mountain=new Mountain();
	String country=mountain.country;
	double height=mountain.height;
    int mountainFeet=mountain.mountainFeet;
	mountain.country="India";
	mountain.height=7120;
	System.out.println("brand: "+mountain.country);
	System.out.println("priceOfJean: "+mountain.height);
	System.out.println("type: "+mountain.mountainFeet);
	
	Stadium stadium=new Stadium();
	String name=stadium.name;
	String location=stadium.location;
    int quantity=stadium.quantity;
	stadium.name="chinnaswami";
	stadium.location="bangaluru";
	System.out.println("name: "+stadium.name);
	System.out.println("location: "+stadium.location);
	System.out.println("quantity: "+stadium.quantity);
    
	Spray spray=new Spray();
	String nameOfSpray=spray.nameOfSpray;
	String colour1=spray.colour1;
    double amount=spray.amount;
    spray.nameOfSpray="orial paris";
    spray.amount=256;
	System.out.println("nameOfSpray: "+spray.nameOfSpray);
	System.out.println("colour1: "+spray.colour1);
	System.out.println("amount: "+spray.amount);
}
}



	
	
	
	