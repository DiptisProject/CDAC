package Day2;
public class PrgShort {

	public static void main(String[] args) {
		// question b Size of Short
		System.out.println("Display Short Size:"+Short.BYTES);
		
		//question c Minimum and Maximum value of Short 
		System.out.println("Minimum and Maximum Value of Short: " +Short.MIN_VALUE+ " to " +Short.MAX_VALUE);
		
		//question d convert short to string
		short number =32566;
		String s =Short.toString(number);
		System.out.println("Number is :"+s);
		
        //question e convert string to short
		String strNumber ="32345";
        short s1=Short.parseShort(strNumber);		
        System.out.println("String Number:"+s1);
        
        /*
         
        // question f   error= NumberFormatException
        String strNumber1 ="Ab12Cd3";
        short s2=Short.parseShort(strNumber1);		
        System.out.println("String Number:"+s2);
        
        */
        
      //question g 
        short number1= 14567;
        short s3=Short.valueOf(number1);
        System.out.println("value is:"+s3);
        
        //question h
        String strNumber2="23450";
        short str1=Short.valueOf(strNumber2);
        System.out.println("value of String:"+str1);
        
        //question i
        short num3=25647;
        int i2=(int)num3;
        System.out.println("Conversion of Short to int:"+i2);
        
        float f=345.8f;
        short sh=(short)f;
        System.out.println("Conversion of float to Short:" +sh);    
        
	}

}
