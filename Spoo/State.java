class State{
	String name;
	String language;
	
	CapitalCity capitalCity=new CapitalCity("Bangaluru",14008000L);
	
	public State(String name,String language){
		this.name=name;
		this.language=language;
	}
	
	
	public void show()
	{
		System.out.println("Name: " + name);
		System.out.println("language: " +language);
		capitalCity.show();
		
	}
}