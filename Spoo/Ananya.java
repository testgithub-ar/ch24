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