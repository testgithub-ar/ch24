class Fibonacci
{
	public static void main(String[] args)
	{
		int num=15;
		int a=0,b=1;
		System.out.println(a+b);
		int next;
		for(int i=0;i<num;i++){
			next=a+b;
			a=b;
			b=next;
			System.out.println(next);
			
		}
	}
}