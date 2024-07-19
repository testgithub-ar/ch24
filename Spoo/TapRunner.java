class Tap
{
	public static void main(String[] forestInfo)
	{
		System.out.println("starting method");
		if(forestInfo.length==4)
		{
			
		
		String name=forestInfo[0];
		System.out.println("Name:"+name);
		
		String area=forestInfo[1];
		System.out.println("area:"+area);
		
		String establishedYear=forestInfo[2];
		System.out.println("establishedYear:"+establishedYear);
		
		String state=forestInfo[3];
		System.out.println("state:"+state);
		
		System.out.println("Taken 4 references");
		
		}
		else
		{
			System.out.println("not enough refernces");
		}
		System.out.println("ending method");
		
	}
}