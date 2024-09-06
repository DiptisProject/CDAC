package Day2;
import java.lang.Byte;;
public class PrgByte {

	public static void main(String[] args) {
		
		//question b size of byte
		System.out.println("Display Byte Size:"+Byte.BYTES);
		
		//question c Minimum and Maximum value of byte
		System.out.println("Minimum and Maximum Byte Value: " +Byte.MIN_VALUE+ " to " +Byte.MAX_VALUE);
		
		//question d convert byte to string
		byte number = 126;
		String s =Byte.toString(number);
		System.out.println("Number:"+s);
		
		//question e convert string to byte
		String strNumber ="-125";
        byte b=Byte.parseByte(strNumber);		
        System.out.println("String Number:"+b);
        
        /* question f   error= NumberFormatException
        String strNumber1 ="Ab12Cd3";
        byte b1=Byte.parseByte(strNumber1);		
        System.out.println("String Number:"+b1);
        
       */
        
        //question g 
        byte number1= 112;
        byte b1=Byte.valueOf(number1);
        System.out.println("value is:"+b1);
        
        //question h
        String strNumber1="120";
        byte str=Byte.valueOf(strNumber1);
        System.out.println("value of String:"+str);
        
        //question i
        byte b2 =122;
        int i2=(int)b2;
        System.out.println("Byte to int conversion:"+i2);
        
        int i3=-128;
        byte b3=(byte)i3;
        System.out.println("Int to Byte conversion:"+b3);
        
	}
	

}
