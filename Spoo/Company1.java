class Company1
{
	int id;
	String name;
	String location;
	SoftwareEngineer softwareEngineer=new SoftwareEngineer("Nikhil",4,"Developer",40000);
	
	public Company1(int id,String name,String location)
	{
		this.id=id;
		this.name=name;
		this.location=location;

	}
	
	public void display(){
		System.out.println("Name: " + name);
        System.out.println("id: " + id);
        System.out.println("location: " + location);
	
		softwareEngineer.display();
	}
}