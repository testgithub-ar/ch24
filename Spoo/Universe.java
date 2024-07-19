class Universe
{
	public static String search(int code)
	{
		System.out.println("running search in Universe");
		System.out.println("code:"+code);
		    if(code==591201){
		        return "chikodi";
		    }
			else if(code==591237){
				return "Nipani";
			}
			else if(code==591222){
				return "Umarani";
			}
			else if(code==560002)
			{
				return "Bengaluru";
			}
			else if(code==590001){
				return "Belagavi";
			}
			return "not found";
		}
		
	public static double pay(String item)
	{
		System.out.println("running pay in Universe");
		System.out.println("item:"+item);
		    if(item=="cake"){
		        return 500;
		    }
			else if(item=="Mobile"){
				return 15000;
			}
			else if(item=="Shirt"){
				return 3000;
			}
			else if(item=="Pen")
			{
				return 25;
			}
			else if(item=="Bag"){
				return 1200;
			}
			return 0;
		}
		
		public static String theator(String movieName)
	{
		System.out.println("running theator in Universe");
		System.out.println("movieName:"+movieName);
		    if(movieName=="RRR"){
		        return "D.V.V.Danayya";
		    }
			else if(movieName=="KGF"){
				return "Vijay Kiragandur";
			}
			else if(movieName=="Kirik party"){
				return "G.S.Gupta and Rakshit Shetty";
			}
			else if(movieName=="Dangal")
			{
				return "Amir Khan and Kiran rao" ;
			}
			else if(movieName=="3 Idiots"){
				return "Vidhu Vinod Chopra";
			}
			return "no producer";
		}
		
	
}