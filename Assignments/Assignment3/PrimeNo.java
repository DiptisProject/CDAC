class PrimeNo
{
  public static void main(String args[])
  {
	  int n=2,count=0;
	  while(count<5)
	  {
		  boolean isPrime=true;
		  for(int i=2;i<n;i++)
		  {
		     if(n%i==0)
			 {
				 isPrime=false;
				 break;
		     }		 
		  }
		   if (isPrime) 
		    {
                System.out.println(n);
                count++;
            }

            n++;
	  }
	  
  }
}