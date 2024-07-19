class Window{
	public static String open(int key)
	{
		System.out.println("Running open in Window");
		System.out.println("key:"+key);
		
		if(key==5){
		return "modulus operator";
		}
		else if(key==7) {
		return "and operator";
		}
		return "no oerator";
	}
	
	public static void main(String [] args)
	{
		System.out.println("Running open in Window");
		String output=Window.open(7);
		System.out.println("output:"+output);
		
		 output=Window.open(9);
		System.out.println("output:"+output);
		
		
	}
	
}