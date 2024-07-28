class JuiceRunner
{
public static void main(String[] args)
{
	System.out.println("starting main");
	Matrimony matrimony=new Matrimony();
	 String appliation= matrimony.appliation;
	 int ratingOfApp=matrimony.ratingOfApp;
	 int appSize= matrimony.appSize;
	 matrimony.appliation="Jeevan Sathi";
	 matrimony. ratingOfApp=4;
	 matrimony. appSize= 60;
	    System.out.println("appliation: "+matrimony.appliation);
		System.out.println("ratingOfApp: "+matrimony.ratingOfApp);
		System.out.println("appSize: "+matrimony.appSize);
		
		Application application=new Application();
		
	    String appName=application.appName;
		int Stars=application.Stars;
		String mode=application.mode;
		application.appName="temple Run";
		application.Stars=5;
		application.mode="game";
		 System.out.println("appName: "+application.appName);
		System.out.println("Stars: "+application.Stars);
		System.out.println("mode: "+application.mode);
		
		Fruit fruit=new Fruit();
		String nameOfFruit=fruit.nameOfFruit;
		int total=fruit.total;
		double rate=fruit. rate;
		fruit.nameOfFruit="banana";
		fruit.total=12;
		fruit. rate=70;
		 System.out.println("nameOfFruit: "+fruit.nameOfFruit);
		System.out.println("total: "+fruit.total);
		System.out.println("rate: "+fruit. rate);
		
		
		
		Juice juice=new Juice();
		
	    String juiceName=juice.juiceName;
		int quantityInMl=juice.quantityInMl;
		double pricePerGlass=juice.pricePerGlass;
		juice.juiceName="mango";
		juice.quantityInMl=250;
		juice.pricePerGlass=60;
		System.out.println("juiceName: "+juice.juiceName);
		System.out.println("quantityInMl: "+juice.quantityInMl);
		System.out.println("pricePerGlass: "+juice.pricePerGlass);
		
		Place place=new Place();
		String nameOfPlace=place.nameOfPlace;
		String location=place.location;
		double ratingOfPlace=place.ratingOfPlace;
		place.nameOfPlace="Iscan Temple";
		place.location="Mahalakshmi Layout";
		place.ratingOfPlace=5;
		System.out.println("nameOfPlace: "+place.nameOfPlace);
		System.out.println("location: "+place.location);
		System.out.println("ratingOfPlace: "+place.ratingOfPlace);
		
		AlcoholBrand alcoholBrand=new AlcoholBrand();
		String brand=alcoholBrand.brand;
		String brandOwner=alcoholBrand.brandOwner;
		boolean good=alcoholBrand.good;
		alcoholBrand.brand="King Fisher";
		alcoholBrand.brandOwner="UBHL";
		alcoholBrand.good=true;
		System.out.println("nameOfPlace: "+alcoholBrand.brand);
		System.out.println("location: "+alcoholBrand.brandOwner);
		System.out.println("ratingOfPlace: "+alcoholBrand.good);
		
		Medicine medicine=new Medicine();
		String nameOfMedicine=medicine.nameOfMedicine;
		int totalTablets=medicine.totalTablets;
	    double costPerPack=medicine.costPerPack	;
		medicine.nameOfMedicine="paracetmol";
		medicine.totalTablets=10;
		medicine.costPerPack=30;
		System.out.println("nameOfPlace: "+medicine.nameOfMedicine);
		System.out.println("location: "+medicine.totalTablets);
		System.out.println("ratingOfPlace: "+medicine.costPerPack);
		
		Food food=new Food();
		String nameOfFood=food.nameOfFood;
		int ratingGiven=food.ratingGiven;
	    double pricePerItem=food.pricePerItem;
		food.nameOfFood="paneer";
		food.ratingGiven=5;
		food.pricePerItem=290;
		System.out.println("nameOfPlace: "+food.nameOfFood);
		System.out.println("location: "+food.ratingGiven);
		System.out.println("ratingOfPlace: "+food.pricePerItem);
		
		
		
		
}
}