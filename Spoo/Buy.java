class Buy
{
	public static void product(String brand,double price)
	{
		System.out.println("running product  in Buy");
		System.out.println("Brand: "+brand);
		System.out.println("price"+price);	
if(brand=="Gucci" && price>500.00)
				{
						System.out.println("product is valid");
				}
				
						else{
									System.out.println(" product is in-valid ");
						}
						
	}
	
	
	public static void product(String name,int quantity,String quality,double price)
	{
		System.out.println("name: "+name);
		System.out.println("quantity"+quantity);
		System.out.println("quality: "+quality);
		System.out.println("price"+price);
		if(name=="Samsung" && quantity<20 && quality=="Good" && price>10000)
				{
						System.out.println("product is valid");
				}
				
						else{
									System.out.println(" product is in-valid");
						}
		
		
	}
	
	public static void bookMovieTicket(String name,String theaterName,int quantity,double price)
	{
		System.out.println("name: "+name);
		System.out.println("theaterName: "+theaterName);
		System.out.println("quantity"+quantity);
		System.out.println("price"+price);
		if(name=="Kalki" && theaterName!="asia"  && quantity<800 && price>500.00)
				{
						System.out.println("product is valid");
				}
				
						else{
									System.out.println(" product is invalid");
						}
	}
	public static void buyEgg(int total,double PricePerEgg)
	{
		System.out.println("total: "+total);
		System.out.println("PricePerEgg"+PricePerEgg);
		if(total<20 && PricePerEgg<20)
				{
						System.out.println("product is valid");
				}
				
						else{
									System.out.println(" product is invalid");
						}
		
	}
	public static void buyShampoo(int quantityInMl,double price,String brand,String manfDate)
	{
		System.out.println("quantityInMl: "+quantityInMl);
		System.out.println("price: "+price);
		System.out.println("brand"+brand);
		System.out.println("manfDate"+manfDate);
		if(quantityInMl<=500 && price<1000 && brand=="Tresme"&& manfDate=="12/2/2024")
				{
						System.out.println("product is valid");
				}
				
						else{
									System.out.println(" product is invalid");
						}
		
		
	}
	public static void buyCake(char size,String type,String flavour,double cost,int quantity)
	{
		System.out.println("size: "+size);
		System.out.println("type: "+type);
		System.out.println("flavour"+flavour);
		System.out.println("cost"+cost);
		System.out.println("quantity"+quantity);
		if(size=='5' && type!="honey" && flavour=="RedVelvet" && cost>500 && quantity<20)
				{
						System.out.println("product is valid");
				}
				
						else{
									System.out.println(" product is invalid");
						}
		
		
	}
	public static void buyLaptop(String brand,int serialNo,double Price,int batteryCapacity,double screenSize,String os,int hardDisk,int ramSize)
	{
		System.out.println("brand: "+brand);
		System.out.println("serialNo: "+serialNo);
		System.out.println("Price"+Price);
		System.out.println("batteryCapacity"+batteryCapacity);
		System.out.println("screenSize: "+screenSize);
		System.out.println("os: "+os);
		System.out.println("hardDisk"+hardDisk);
		System.out.println("ramSize"+ramSize);
		if(brand=="Dell" && serialNo==5922022 && Price<=60000.00 && batteryCapacity>1500 && screenSize<20 && os!="linux" && hardDisk==32  && ramSize<=512 )
				{
						System.out.println("product is valid");
				}
				
						else{
									System.out.println(" product is invalid");
						}
	}
	public static void buySmartWatch(String brand,double Price,int color,char type,int mode)
	{
		System.out.println("brand: "+brand);
		System.out.println("Price: "+Price);
		System.out.println("color"+color);
		System.out.println("type"+type);
		System.out.println("mode"+mode);
		if(brand=="Firebolt" && Price<1500 && color<7 && type!='a' && mode<3)
				{
						System.out.println("product is valid");
				}
				
						else{
									System.out.println(" product is invalid");
						}
	}
	
	
	
}
