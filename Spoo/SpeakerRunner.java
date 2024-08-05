class SpeakerRunner
{
	public static void main(String[] args){
		Speaker speaker=new Speaker();
		String brand=speaker.brand;
		speaker.brand="Boat Stone";
		System.out.println("brand:"+speaker.brand);
		
		Speaker speaker1=new Speaker("small");
		System.out.println("size:"+speaker1.size);
		
		Speaker speaker2=new Speaker();
		speaker2.setCost(700);
		System.out.println("cost:"+speaker2.cost);
		System.out.println("output:"+speaker.output);
		
		
		speaker.brand="philips";
		System.out.println("brand:"+speaker.brand);
		
		Speaker speaker3=new Speaker("medium");
		System.out.println("size:"+speaker3.size);
		
		Speaker speaker4=new Speaker();
		speaker4.setCost(800);
		System.out.println("cost:"+speaker4.cost);
		System.out.println("output:"+speaker.output);
		
		speaker.brand="Samsung";
		System.out.println("brand:"+speaker.brand);
		
		Speaker speaker5=new Speaker("large");
		System.out.println("size:"+speaker5.size);
		
		Speaker speaker6=new Speaker();
		speaker6.setCost(8000);
		System.out.println("cost:"+speaker6.cost);
		System.out.println("output:"+speaker.output);
		
	}
}