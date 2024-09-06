package Day2;

public class PrgInteger {

	public static void main(String[] args) {
		//question b Integer Size
		System.out.println("Size of Int: "+Integer.BYTES);
		
		//question c Minimum and Maximum value of integer
		System.out.println("Minimum and Maximum Value of Integer: " +Integer.MIN_VALUE+ " to " +	Integer.MAX_VALUE);
				
		//question d convert integer to string
		int number =23;
		String s =Integer.toString(number);
		System.out.println("Number is :"+s);
				
		//question e convert string to integer
		String strNumber ="45673829";
		int i1=Integer.parseInt(strNumber);		
		System.out.println("String Number:"+i1);
		
		/*
		// question f   error= NumberFormatException
        String strNumber1 ="Ab12Cd3";
        int i2=Integer.parseInt(strNumber1);		
        System.out.println("String Number:"+i2);
        
        */
		
		//question g 
        int number2= 12;
        int i2=Integer.valueOf(number2);
        System.out.println("value is:"+i2);
        
        //question h
        String strNumber3="45637";
        int str1=Integer.valueOf(strNumber3);
        System.out.println("value of String:"+str1);
        
        //question i
        int a=10;
        int b=20;
        System.out.println("Addtion of two numbers:"+Integer.sum(a, b));
        
        //question j
        int c=10;
        int d=20;    
        System.out.println("Minimum Value:" +Integer.min(c, d));
        System.out.println("Maximum Value:"+Integer.max(c, d));
        
        //question k
        int e=7;
        System.out.println("Binary Value:" +Integer.toBinaryString(e));
        System.out.println("Octal Value:" +Integer.toOctalString(e));
        System.out.println("HexaDecimal Value:" +Integer.toHexString(e));
        
        //question l
        int i3=24;
        byte b4=(byte)i3;
        System.out.println("Conversion of Integer to Byte:"+b4);
	}

}
