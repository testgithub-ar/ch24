class Netflix
{
public static void main(String[] args)
{
System.out.println("running main in Netflix");
Paint.apply("Nerolac");
 Paint.add("Asian Paints","Blue");
 Paint.brush("Indigo Paints",1392.70);
 Paint.put("Orange","Aluminium Paint",2929.00);
 
 Train.book("Belagavi","Bengaluru");
 Train.book("Belagavi","Pune",84863);
 Train.book("Mysuru","Shimoga",75000,505.00);
 Train.cancel(79964899L);
 Train.cancel("Goa","Pune");
 
}
}