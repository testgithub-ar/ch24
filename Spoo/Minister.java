class Minister{
	public static void serve()
	{
		System.out.println("running serve in minister");
		Assistent.help();
	}
}
class Assistent{
	public static void help()
	{
		System.out.println("running help in assistent");
		Driver.Drive();
	}
}
class Driver{
	public static void Drive()
	{
		System.out.println("running drive in driver");
		Vehicle.transport();
	}
}
class Vehicle{
	public static void transport()
	{
		System.out.println("running transport in vehicle");
		MusicSystem.play();
	}
}
class MusicSystem{
	public static void play()
	{
		System.out.println("running play in MusicSystem");
		Application.run();
	}
}
class Application{
	public static void run()
	{
		System.out.println("running run in application");
		Internet.stream();
		
	}
}
class Internet{
	public static void stream()
	{
		System.out.println("running stream in Internet");
		Server.connect();
	}
}
class Server{
	public static void connect()
	{
		System.out.println("running connect in server");
		Location.display();
	}
}
class Location{
	public static void display()
	{
	System.out.println("running location in display");
	Building.opengate();
	}
}
class Building{
	public static void opengate()
	{
		System.out.println("running opengate in building");
		Metal.strength();
	}
}
class Metal{
	public static void strength()
	{
		System.out.println("running strength in metal");
        Factory.make();
	}
}
class Factory{
	public static void make()
	{
		System.out.println("running make in factory");
		Machine.design();
	}
}
class Machine{
	public static void design()
	{
		System.out.println("running design in machine");
		Engineer.nothing();
	}
}
class Engineer
{
	public static void nothing()
	{
		System.out.println("running nothing in engineer");
	}
}