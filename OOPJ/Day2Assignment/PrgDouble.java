package Day2;

public class PrgDouble {

	public static void main(String[] args) {
		
		//question b Size of Double
        System.out.println("Size of Double:"+Double.BYTES);
        
        //question c Minimum and Maximum value of Double
      	System.out.println("Minimum and Maximum Value of Double: " +Double.MIN_VALUE+ " to " +Double.MAX_VALUE);
                                                                             
    	//question d convert Double to string
      	double number =54687.3897;
      	String s =Double.toString(number);
      	System.out.println("Number is :"+s);
        
        //question e convert string to Double
      	String strNumber ="6789.809430";
        double s1=Double.parseDouble(strNumber);		
        System.out.println("String Number:"+s1);
      	
        /*
        // question f   error= NumberFormatException
        String strNumber1 ="Ab12Cd3";
        double s2=Double.parseDouble(strNumber1);		
        System.out.println("String Number:"+s2);
        
        */
        
        
      //question g 
        double number1= 546.6347;
        double s3=Double.valueOf(number1);
        System.out.println("value is:"+s3);
        
        //question h
        String strNumber2="654.32144";
        double str1=Double.valueOf(strNumber2);
        System.out.println("value of String:"+str1);
        
        
        //question i
        double a=112.3;
        double b=984.5;
        System.out.println("Addtion of two numbers:"+Double.sum(a, b));
        
        //question j
        double c=112.2;
        double d=984.5;    
        System.out.println("Minimum Value:" +Double.min(c, d));
        System.out.println("Maximum Value:"+Double.max(c, d));
        
      //question k
        double d1= -25.0;
        System.out.println("Square root is:"+Math.sqrt(d1));
         
        
      //question l
        double d3=0.0;
        double d4=0.0;
        
        double result=d3/d4;
        System.out.println("Division is :" +result);
        
      //question m
        double d5=43.546;
        int i4=(int)d5;
        System.out.println("Conversion of Double to Int:"+i4); 	
      	
	}

}
