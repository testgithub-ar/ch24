class ProjectorRunner
{
	public static void main(String[] args){
		Projector projector=new Projector();
		String company=projector.company;
		projector.company="Epson";
		System.out.println("company:"+projector.company);
		
		Projector projector1=new Projector("DLP");
		System.out.println("type:"+projector1.type);
		
		Projector projector2=new Projector();
		projector2.setColour("black");
		System.out.println("colour:"+projector2.colour);
		System.out.println("weight:"+projector.weight);
		
		projector.company="HP";
		System.out.println("company:"+projector.company);
		
		Projector projector3=new Projector("LCD");
		System.out.println("type:"+projector3.type);
		
		Projector projector4=new Projector();
		projector4.setColour("White");
		System.out.println("colour:"+projector4.colour);
		System.out.println("weight:"+projector.weight);
		
		projector.company="Samsung";
		System.out.println("company:"+projector.company);
		
		Projector projector5=new Projector("LCOS");
		System.out.println("type:"+projector5.type);
	
     	Projector projector6=new Projector();
		projector6.setColour("black");
		System.out.println("colour:"+projector6.colour);
		System.out.println("weight:"+projector.weight);
	}
}
