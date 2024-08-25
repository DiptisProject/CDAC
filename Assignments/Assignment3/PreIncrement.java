//Write a Java program to demonstrate the use of both pre-increment and post-decrement 
//operators in a single expression
import java.util.*;
class PreIncrement
{
    public static void main(String[] args) {
        int num1, num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value Of num1:");
		num1=sc.nextInt();
		System.out.println("Enter Value Of num2:");
		num2=sc.nextInt();
        int result = ++num1 + num2--;
        System.out.println("Result of the expression (++num1 + num2--): " + result);
        System.out.println("Value of a after the expression: " + num1);
        System.out.println("Value of b after the expression: " + num2);
    }

}