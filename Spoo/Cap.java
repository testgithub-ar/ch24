class Cap
{
	String brand;
	String colour;
	double price;
	public Cap(String brandLocal,String colourLocal,double priceLocal)
 {
	    brand=brandLocal;
		colour=colourLocal;
		price=priceLocal;
		System.out.println("created cap brand,colour,price");
	}
}

class Gold
{
	String company;
	int carat;
	double pricePerGm;
	
	
	
	public Gold(String companyLocal,int caratLocal,double pricePerGmLocal)
	{
	company=companyLocal;
	carat=caratLocal;
	pricePerGm=pricePerGmLocal;
		System.out.println("created Gold company, carat,pricePerGm");
	}
}

class Board
{
	String type;
	double boardPrice;
	boolean good;
	
	
	public Board(String typeLocal,double boardPriceLocal,boolean goodLocal)
	{
	type=typeLocal;
	boardPrice=boardPriceLocal;
	good=goodLocal;
		System.out.println("created Board type,boardPrice,good");
	}
}

class Led
{
	String colour;
	int noOfLights;
	double cost;
	
	
	
	public Led(String colourLocal,int noOfLightsLocal,double costLocal)
	{
		
	colour=colourLocal;
	noOfLights=noOfLightsLocal;
	cost=costLocal;
		System.out.println("created Led colour,noOfLights,cost");
	}
}

class SimCard
{
	String network;
	String founder;
    double rechargePlan;
	
	
	public SimCard(String networkLocal,String founderLocal,double rechargePlanLocal)
	{
		
	network=networkLocal;
	founder=founderLocal;
	rechargePlan=rechargePlanLocal;
		System.out.println("created SimCard network,founder,rechargePlan");
	}
}

