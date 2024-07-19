class Elevator
{
	public static void up()
	{
		System.out.println("running up in elevator");
		Elevator.down();
	}
	public static void down(){
		System.out.println("running down in elevator");
		Elevator.up();
	}
	public static void main(String[]args)
	{
		
	System.out.println("running main in elevator");
	Elevator.down();
	Elevator.up();
	
	}
	


	
	
}