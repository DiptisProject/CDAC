package Day2;

public class PrgLong {

	public static void main(String[] args) {
		
		//question b Size of Long
        System.out.println("Size of long:"+Long.BYTES);
        
      //question c Minimum and Maximum value of Short 
      	System.out.println("Minimum and Maximum Value of Long: " +Long.MIN_VALUE+ " to " +Long.MAX_VALUE);
      		
      	//question d convert long to string
      	long number =257887666;
      	String s =Long.toString(number);
      	System.out.println("Number is :"+s);
        
        //question e convert string to long
      	String strNumber ="6789809430";
        long s1=Long.parseLong(strNumber);		
        System.out.println("String Number:"+s1);
           
       /*
        
        // question f   error= NumberFormatException
        String strNumber1 ="Ab12Cd3";
        long s2=Long.parseLong(strNumber1);		
        System.out.println("String Number:"+s2);
        
        */
        
      //question g 
        long number1= 546879822;
        long s3=Long.valueOf(number1);
        System.out.println("value is:"+s3);
        
        //question h
        String strNumber2="65783450";
        long str1=Long.valueOf(strNumber2);
        System.out.println("value of String:"+str1);
        
        //question i
        long a=1122;
        long b=9845;
        System.out.println("Addtion of two numbers:"+Long.sum(a, b));
        
        //question j
        long c=1122;
        long d=9845;    
        System.out.println("Minimum Value:" +Long.min(c, d));
        System.out.println("Maximum Value:"+Long.max(c, d));
        
      //question k
        long e=7;
        System.out.println("Binary Value:" +Long.toBinaryString(e));
        System.out.println("Octal Value:" +Long.toOctalString(e));
        System.out.println("HexaDecimal Value:" +Long.toHexString(e));     
        
        //question l
        long l3=657847;
        int i4=(int)l3;
        System.out.println("Conversion of Long to Int:"+i4);
        
        
	}

}
