class PaperRunner
{
	public static void main(String[] args){
		Paper paper=new Paper();
		String colour=paper.colour;
		paper.colour="white";
		System.out.println("colour:"+paper.colour);
		
		Paper paper1=new Paper("A4");
		System.out.println("type:"+paper1.size);
		
		Paper paper2=new Paper();
		paper2.setQuality(true);
		System.out.println("colour:"+paper2.quality);
		System.out.println("weight:"+paper.thickness);
		
		paper.colour="red";
		System.out.println("colour:"+paper.colour);
		
		Paper paper3=new Paper("A3");
		System.out.println("type:"+paper3.size);
		
		Paper paper4=new Paper();
		paper4.setQuality(true);
		System.out.println("colour:"+paper4.quality);
		System.out.println("weight:"+paper.thickness);
		
		paper.colour="Blue";
		System.out.println("colour:"+paper.colour);
		
		Paper paper5=new Paper("A5");
		System.out.println("type:"+paper5.size);
		
		Paper paper6=new Paper();
		paper6.setQuality(true);
		System.out.println("colour:"+paper6.quality);
		System.out.println("weight:"+paper.thickness);
	}
}
