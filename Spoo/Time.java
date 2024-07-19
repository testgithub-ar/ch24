class Time{
	public static double price(String medicineName){
		System.out.println("running price in Time");
		System.out.println("medicineName:"+medicineName);
		if(medicineName=="dolo650"){
			return 30;
		}
		else if(medicineName=="paracetmol"){
		return 110;
		}
		else if(medicineName=="Chesten Cold"){
			return 32;
		}
		return 0;
		
		
	}
	
	public static String check(String symptoms){
		System.out.println("running check in Time");
		System.out.println("symptoms:"+symptoms);
		
		if(symptoms=="fever"){
			return "paracetmol";
		}
		else if(symptoms=="headache"){
		return "gabapentin";
		}
		else if(symptoms=="Itching"){
			return "Betnovate Cream";
		}
		return "no Medicine";
		
		
	}
	
	public static String look(String doctorName){
		System.out.println("running check in Time");
		System.out.println("doctorName:"+doctorName);
		
		if(doctorName=="Spoorti"){
			return "available";
		}
		else if(doctorName=="Rohit"){
		return "available";
		}
		else if(doctorName=="Nikhil"){
			return " available";
		}
		return "not available";
	}
	
}