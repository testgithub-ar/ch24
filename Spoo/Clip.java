class Clip{
	String colour;
	String type;
	public Clip(String colour,String type){
		this.colour=colour;
		this.type=type;
	}
	
	public void show(){
		System.out.println("colour:"+colour);
		System.out.println("type:"+type);
		
		
	}
	}
	
class Ganavi{
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
