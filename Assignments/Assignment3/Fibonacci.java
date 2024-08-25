class Fibonacci
{
	public static void main(String args[])
	{
		int n=21, a=0,b=1,c;
		System.out.println("Fibonacci Sequence up to the number " +n);
		for(int i=1;i<=n;i++)
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
			
		}
	}
}	
			