 class Contact
{
public static void text( int number)
{
System.out.println("running text in android");
System.out.println("number"+number);

if(number%2==0)
{
System.out.println("the given number is even");
}
else
{
System.out.println("the given number is odd");
}

}
 public static void main(String[] args)
{
System.out.println("running main in android");
Contact.text(5);

}

}
