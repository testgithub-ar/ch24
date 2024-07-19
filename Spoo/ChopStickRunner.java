class ChopStick
{
	public static void main(String[] personInfo)
	{
		System.out.println("starting method");
		if(personInfo.length==4)
		{
			
		
		String name=personInfo[0];
		System.out.println("Name:"+name);
		String email=personInfo[1];
		System.out.println("email:"+email);
		String age=personInfo[2];
		System.out.println("age:"+age);
		String password=personInfo[3];
	    System.out.println("password:"+password);
		
		System.out.println("Taken 4 references");
		
		}
		else
		{
			System.out.println("not enough refernces");
		}
		System.out.println("ending method");
		
	}
	
	
	
}