class SoftwareEngineer
{
	String name;
	int experience;
	String designation;
	double salary;
	public SoftwareEngineer(String name,int experience,String designation,double salary)
	{
		this.name=name;
		this.experience=experience;
		this.designation=designation;
		this.salary=salary;
	}
	public void display()
	{
		System.out.println("Name: " + name);
        System.out.println("Experience: " + experience);
        System.out.println("designation: " + designation);
		System.out.println("salary: " + salary);
		
	}
}