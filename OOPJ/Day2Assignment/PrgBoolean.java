package Day2;
import java.lang.Boolean;
public class PrgBoolean {

	public static void main(String[] args) {
	
		//question b convert boolean to string
		 boolean status = true;
         String s = Boolean.toString(status);
         System.out.println("String is: " +s);
         
         //question c convert string to boolean
         String strStatus="true";
         boolean b =Boolean.parseBoolean(strStatus);
         System.out.println("Boolean Value:" +b);
         
         //question d
         String strStatus1="0";
         boolean b1 = "1".equals(strStatus1);
         System.out.println(b1);
         
         //question e
         boolean status1=true;
         boolean a =Boolean.valueOf(status1);
         System.out.println("Value of a: "+a);
         
         //question f
         String strStatus2="true";
         String s1 =String.valueOf(strStatus2);
         System.out.println("String Value :"+s1);
         
         /*question g 
         boolean b2=true;
          int i1=b2;
         System.out.println(i1);
          
         ans = cannot convert boolean to int */
        	
         
         //by using typecasting we convert boolean to int
         boolean b2=true;
         int i1=(b2) ? 1 : 0;
         System.out.println(i1);
	}

}
