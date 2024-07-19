class LampRunner
{
public static void main(String[] values)
	{

		if(values.length==5){
		String name= values[0];
		String brand= values[1];
		String flavour=values[2];
		String price= values[3];
		String quantity= values[4];

		double convertedPrice=Double.parseDouble(price);
		int convertedQuantity=Integer.parseInt(quantity);
		Lamp.juiceInfo(name,brand,flavour,convertedPrice,convertedQuantity);
		

		}
		else
		{
			System.out.println("required 4 references");
		}
	}
}