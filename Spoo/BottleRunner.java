class BottleRunner
{
	public static void main(String[] values)
	{

		if(values.length==4){
		String name= values[0];
		String manfdate= values[1];
		String price= values[2];
		String quantity= values[3];

		double convertedPrice=Double.parseDouble(price);
		int convertedQuantity=Integer.parseInt(quantity);
		Bottle.medicineIfo(name,manfdate,convertedPrice,convertedQuantity);
			
		}
		else
		{
			System.out.println("required 4 references");
		}
	}
}