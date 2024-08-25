//Write a program to print all even numbers between 1 and 50.
class EvenNum
{
	public static void main(String[] args)
	{
		System.out.println("Even Numbers between 1 to 50 are:");
		for(int i=1;i<=50;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
		}
	}
}