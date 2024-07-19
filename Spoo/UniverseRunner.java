class UniverseRunner{
	public static void main(String[] args)
	{
		System.out.println("running main");
		
		String name=Universe.search(591201);
		System.out.println("name:"+name);
		
		name=Universe.search(591222);
		System.out.println("name:"+name);
		
		name=Universe.search(591237);
		System.out.println("name:"+name);
		
		name=Universe.search(560002);
		System.out.println("name:"+name);
		
		name=Universe.search(590001);
		System.out.println("name:"+name);
		
		name=Universe.search(591208);
		System.out.println("name:"+name);
		System.out.println("======================");
		
		double price=Universe.pay("cake");
		System.out.println("price:"+price);
		
		 price=Universe.pay("Mobile");
		System.out.println("price:"+price);
		
		 price=Universe.pay("Shirt");
		System.out.println("price:"+price);
		
		 price=Universe.pay("Pen");
		System.out.println("price:"+price);
		
		 price=Universe.pay("Bag");
		System.out.println("price:"+price);
		
		 price=Universe.pay("switch");
		System.out.println("price:"+price);
		
		System.out.println("======================");
		
		String producerName=Universe.theator("RRR");
		System.out.println("producerName:"+producerName);
		
		producerName=Universe.theator("KGF");
		System.out.println("producerName:"+producerName);
		
		producerName=Universe.theator("Kirik party");
		System.out.println("producerName:"+producerName);
		
		producerName=Universe.theator("Dangal");
		System.out.println("producerName:"+producerName);
		
		producerName=Universe.theator("3 Idiots");
		System.out.println("producerName:"+producerName);
		
		producerName=Universe.theator("kantara");
		System.out.println("producerName:"+producerName);
		
		
		
		
		
	}
}