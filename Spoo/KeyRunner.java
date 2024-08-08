class KeyRunner{
	public static void main(String[] args){
		
		Key key=new Key(2.5f,"yale");
		
		Keybunch keybunch=new Keybunch("Steel",key);
		
			keybunch.details();
			
			Key key1=new Key(1.8f,"philips");
			Keybunch keybunch1=new Keybunch("Bronze",key1);
			keybunch1.details();
			System.out.println("...................................................");
			
		Clip clip=new Clip("Green","plastic");
		
		Ganavi ganavi=new Ganavi("ganaviemail@gmail.com",clip);
		ganavi.show();
		
		Clip clip1=new Clip("white","wood");
		
		Ganavi ganavi1=new Ganavi("spoorti28@gmail.com",clip1);
		ganavi1.show();
		
		System.out.println("...................................................");
		
		Knife knife=new Knife(1.5f,4);
		
		Ananya ananya=new Ananya(8123648702L,knife);
		ananya.details();
		
		Knife knife1=new Knife(8.6f,6);
		
		Ananya ananya1=new Ananya(9611541211L,knife1);
		ananya1.details();
		
	}
}