package Day2;

import java.util.Scanner;

public class Prg10CommandLineA {

	public static void main(String[] args) {
		 
     int num1=Integer.parseInt(args[0]);
     int num2=Integer.parseInt(args[1]);
     
     Scanner sc = new Scanner(System.in);
     System.out.println("1.Addition\n 2.Subtraction \n3.Multiplication \n 4.Division");
     System.out.println("Enter Your Choice:");
     int ch=sc.nextInt();
     
     switch(ch)
     {
     	case 1:
               int add=num1+num2;
     		   System.out.println("Addition is:"+add);
     		   break;
     	case 2:
                int sub=num1-num2;
		        System.out.println("Subtrication is:"+sub);
		        break;
		        
        case 3:
        	 	int mul=num1 * num2;
		        System.out.println("Multiplication is:"+mul);
	            break;
        case 4:
        	    if(num2!=0)
        	    {	
        		int div=num1/num2;
        		System.out.println("Division is:"+div);
        	    }
     		    break;
     	default:
     		   System.out.println("Invalid");
               
     }
     sc.close();
    }
}