class ChocolateRunner
{
	public static void main(String[] args){
		Chocolate chocolate=new Chocolate();
		String brand=chocolate.brand;
		chocolate.brand="Dairy Milk";
		System.out.println("brand:"+chocolate.brand);
		
		Chocolate chocolate1=new Chocolate(180);
		System.out.println("price:"+chocolate1.price);
		
		Chocolate chocolate3=new Chocolate();
		chocolate3.setFlavour("oreo");
		System.out.println("flavour:"+chocolate3.flavour);
		System.out.println("size:"+chocolate.size);
		
		chocolate.brand="5 Star";
		System.out.println("brand:"+chocolate.brand);
		
		Chocolate chocolate4=new Chocolate(20);
		System.out.println("price:"+chocolate4.price);
		
		Chocolate chocolate5=new Chocolate();
		chocolate5.setFlavour("nuts");
		System.out.println("flavour:"+chocolate5.flavour);
		System.out.println("size:"+chocolate.size);
		
		chocolate.brand="Hershy's";
		System.out.println("brand:"+chocolate.brand);
		
		Chocolate chocolate6=new Chocolate(300);
		System.out.println("price:"+chocolate6.price);
		
		Chocolate chocolate7=new Chocolate();
		chocolate7.setFlavour("Strawberry");
		System.out.println("flavour:"+chocolate7.flavour);
		System.out.println("size:"+chocolate.size);
	}
}
