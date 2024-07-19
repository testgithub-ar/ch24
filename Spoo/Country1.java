class Country1
{
	public static void search(String[] states)
	{
		System.out.println("starting method");
		
		for(int state=states.length-1; state>=0;state--)
		{
		System.out.println("State:"+states[state]);
		}
		System.out.println("ending method");
		}
		public static void find(int[] pincodes)
	{
		System.out.println("starting method");
		for(int pincode=pincodes.length-1;pincode>=0;pincode--)
		{
			System.out.println("pincode:"+ pincodes[ pincode]);
		}

         System.out.println("ending method");

}
public static void tell(String[] primeMinisters)
	{
		System.out.println("starting method");
		for(int minister=primeMinisters.length-1;minister>=0;minister--)
		{
			System.out.println("primeMinister:"+primeMinisters[minister]);
		}
		System.out.println("ending method");
	}
	
	public static void say(String[] cabinetMinisters)
	{
		System.out.println("starting method");
		for(int cabinet=cabinetMinisters.length-1;cabinet>=0;cabinet--)
		{
			System.out.println("cabinetMinister:"+cabinetMinisters[cabinet]);
		}
		
	}
	
	 public static void elect(String[] polticalparties)
	{
		System.out.println("starting method");
		for(int party =polticalparties.length-1;party>=0;party--)
		{
			System.out.println("poltical party:"+polticalparties[party]);
			System.out.println("ending method");
		}
	
	}
	
		
	
	
	
}