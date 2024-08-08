class Country2
{
  String name;
  String continent;
  State state=new State("Karnataka","kannada");
  
  public Country2(String name,String continent)
  {
  this.name=name;
  this.continent=continent;
  }
  
  public void show()
  {
  System.out.println("Name: " + name);
  System.out.println("continent: " +continent);
  state.show();
  }
}