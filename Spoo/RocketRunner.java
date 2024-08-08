class RocketRunner
{
	public static void main(String[] args){
		Rocket rocket=new Rocket();
		String country=rocket.country;
		rocket.country="India";
		System.out.println("country:"+rocket.country);
		
		Rocket rocket1=new Rocket(3800);
		System.out.println("speed:"+rocket1.speed);
		
		Rocket rocket2=new Rocket();
		rocket2.setnoOfThrusters(2500);
		System.out.println("noOfThrusters:"+rocket2.noOfThrusters);
		System.out.println("fuelCapacity:"+rocket2.fuelCapacity);
		
		rocket.country="USA";
		System.out.println("country:"+rocket.country);
		
		Rocket rocket3=new Rocket(2400);
		System.out.println("speed:"+rocket3.speed);
		
		Rocket rocket4=new Rocket();
		rocket4.setnoOfThrusters(1200);
		System.out.println("noOfThrusters:"+rocket4.noOfThrusters);
		System.out.println("fuelCapacity:"+rocket.fuelCapacity);
		
		rocket.country="Japan";
		System.out.println("country:"+rocket.country);
		
		Rocket rocket5=new Rocket(2800);
		System.out.println("speed:"+rocket5.speed);
		
		Rocket rocket6=new Rocket();
		rocket6.setnoOfThrusters(1300);
		System.out.println("noOfThrusters:"+rocket6.noOfThrusters);
		System.out.println("fuelCapacity:"+rocket.fuelCapacity);
		
		
	}
}