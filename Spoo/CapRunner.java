class CapRunner
{
public static void main(String[] args)
{
	System.out.println("starting main");
	Cap cap=new Cap("puma","black",400);
	System.out.println("brand:"+cap.brand);
	System.out.println("colour:"+cap.colour);
	System.out.println("price:"+cap.price);
	
	Gold gold=new Gold("tanishq",24,6983);
	System.out.println("company:"+gold.company);
	System.out.println("carat:"+gold.carat);
	System.out.println("pricePerGm:"+gold.pricePerGm);
	
	
	
	Board board=new Board("chess",279,true);
	System.out.println("type:"+board.type);
	System.out.println("boardprice:"+board.boardPrice);
	System.out.println("good:"+board.good);
	
	Led led =new Led ("blue",500,450);
	System.out.println("colour:"+led.colour);
	System.out.println("noOfLights:"+led.noOfLights);
	System.out.println("cost:"+led.cost);
	
	
	SimCard simCard=new SimCard("airtel","Sunil bharati Mittal",666);
	System.out.println("network:"+simCard.network);
	System.out.println("founder:"+simCard.founder);
	System.out.println("rechargePlan:"+simCard.rechargePlan);
	
	
	
	System.out.println("end main");
	
}
}
