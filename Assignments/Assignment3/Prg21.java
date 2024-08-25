/*
1 
1*3 
1*3*5 
1*3*5*7 
1*3*5*7*9 
*/
class Prg21
{
	public static void main(String[] args)
	{
		int i,j,n=1;
		for(i=1;i<=9;i+=2)
		{

			{
			  for(j=1;j<=i;j+=2)
			 {
				System.out.print(j);
				if(j<i)
					System.out.print("*");
				
			 }
			} 
			 System.out.print("\n");
			
			
		}
	}
}