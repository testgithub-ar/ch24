class Tap
{
	public static void main(String[] forestInfo)
	{
		System.out.println("starting method");
		if(forestInfo.length==4)
		{
			
		
		String name=forestInfo[0];
		String area=forestInfo[1];
		String establishedYear=forestInfo[2];
		String state=forestInfo[3];
		System.out.println("Taken 4 references");
		
		}
		else
		{
			System.out.println("not enough refernces");
		}
		System.out.println("ending method");
		
	}
}