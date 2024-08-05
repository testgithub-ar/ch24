class MaskRunner
{
	public static void main(String[] args){
	System.out.println("starting main");
	Mask mask=new Mask();
	double cost=mask.cost;
	char size=mask.size;
	String material=mask.material;
	mask.cost=20;
	mask.size='M';
	mask.material="cotton";
	System.out.println("cost:"+mask.cost);
	System.out.println("size:"+mask.size);
	System.out.println("material:"+mask.material);
	
	
	Mask mask1=new Mask(90);
	System.out.println("cost:"+mask1.cost);
	
	Mask mask2=new Mask('S');
    System.out.println("size:"+mask2.size);
	
	Mask mask3=new Mask("Nylon");
	System.out.println("material:"+mask3.material);
	
	Mask mask4=new Mask(50,'m',"cotton");
	System.out.println("cost:"+mask4.cost);
	System.out.println("size:"+mask4.size);
	System.out.println("material:"+mask4.material);
	
	Mask mask10=new Mask(20,'S');
	System.out.println("cost:"+mask10.cost);
	System.out.println("size:"+mask10.size);
	
	System.out.println("end main");
	}
	
	
	
	
}