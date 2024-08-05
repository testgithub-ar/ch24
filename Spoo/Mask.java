class Mask {
	double cost;
	char size;
	String material;
	 
	 public Mask()
	 {
		 System.out.println("created Mask");
	 }
	 
	 public Mask(double cost)
	 {
		 this.cost=cost;
		 System.out.println("created Mask with double");
	 }
	 
	 public Mask(char size)
	 {
		 this.size=size;
		 System.out.println("created Mask with char");
	 }
	 
	  public Mask(String material)
	  {
		  this.material=material;
		 System.out.println("created Mask with String"); 
	  }
	  
	  public Mask(double cost,char size,String material)
	  {
		  this.cost=cost;
		  this.size=size;
		  this.material=material;
		  
		  System.out.println("created Mask with double,char,String");
	  }
	  
	  public Mask(double cost,char size)
	  {
		  
		  this.cost=cost;
		  this.size=size;
		  System.out.println("created Mask with double,char");
	  }
	  
	  
	 
	 
}
	
