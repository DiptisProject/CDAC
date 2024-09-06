package Day2;

public class PrgFloat {

	public static void main(String[] args) {
		
		       //question b Size of Float
               System.out.println("Bytes required for float"+Float.BYTES);
		       
               //question c Maximum and Minimum Value of Float
                System.out.println("Minimum and Maximum Value of Float: " +Float.MIN_VALUE+ " to " +	Float.MAX_VALUE);
		
		        //d convert Float to string
				float n1=345.6f;
				String str=Float.toString(n1);
				System.out.println("Convert Float to String:"+str);
				
				//e convert string to Float
				String strNumber="678.6";
				float n2=Float.parseFloat(strNumber);
				System.out.println("Convert String to int:"+n2);
				
				//f convert string to int
				/*String strNumber1="Ab12Cd3";
				float n3=Float.parseFloat(strNumber1);
				System.out.println("Convert String to int:"+n3);  //NumberFormat Exeption
				*/
				
				//g 
				float i3=3456.67f;
				Float it=Float.valueOf(i3);
				System.out.println("convert Float to corresponding wrapper class:"+it);
				
				//h 
				String str3="456.56";
				Float it1=Float.valueOf(str3);
				System.out.println("convert String to corresponding wrapper class:"+it1);
				
				//i 
				float a1=112.3f;
				float a2=984.5f;
				float result=Float.sum(a1, a2);
				System.out.println("Addition is:"+result);
				
				//j 
				System.out.println("Min value is:"+Float.min(a1,a2));
				System.out.println("Max value is:"+Float.max(a1,a2));
				
				//k 
				float f=-25.0f;
				System.out.println("Square root is:"+Math.sqrt(f));

				// l 
				float n3 =0.0f;
				float n4=0.0f;
				System.out.println("Divisoin of float:"+n3/n4);
				
				//m 
				float num1=567.8f;
				int f2=(int)num1;
				System.out.println("Convert float to int:"+f2);



	}

}
