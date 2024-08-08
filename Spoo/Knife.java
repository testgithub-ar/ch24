class Knife{
	float weight;
	int height;
	public Knife(float weight,int height){
		this.weight=weight;
		this.height=height;
	}
	
	public void details(){
		System.out.println("weight"+weight);
		System.out.println("height"+height);
		
	}
	
}
class Ananya{
     long mobileNo;
	 Knife knife;
	 public Ananya(long mobileNo,Knife knife){
		 this.mobileNo=mobileNo;
		 this.knife=knife;
	 }
	 
	 public void details(){
		 System.out.println("mobileNo"+mobileNo);
		 knife.details();
	 }
}