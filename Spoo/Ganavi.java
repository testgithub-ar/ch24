lass Ganavi{
	String email;
	Clip clip;
	public Ganavi(String email,Clip clip){
		this.email=email;
		this.clip=clip;
	}
	
	public void show(){
		System.out.println("email:"+email);
		clip.show();
}
}
