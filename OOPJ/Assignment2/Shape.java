package Assignment2;

import java.util.Scanner;

public class Shape {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("Select a shape to calculate the area:");
      System.out.println("1. Circle");
      System.out.println("2. Square");
      System.out.println("3. Rectangle");
      System.out.println("4. Triangle");
      System.out.print("Enter your choice:");
      
      int choice= sc.nextInt();
      double Area=0;
      
      switch(choice)
      { 
          case 1:
        	   System.out.println("Enter the radius of  circle:");
      		   double radius = sc.nextDouble();
      		   Area = Math.PI * radius * radius;
      		   System.out.println("The area of the circle is: " + Area);
      		   break;
      		   
          case 2:
        	  System.out.println("Enter sides of square:");
        	  double side = sc.nextDouble();
        	  Area= side * side;
        	  System.out.println("Enter the Area of square:" +Area);
        	  
          case 3: 
              System.out.print("Enter the length of the rectangle: ");
              double length = sc.nextDouble();
              System.out.print("Enter the width of the rectangle: ");
              double width = sc.nextDouble();
              Area = length * width;
              System.out.println("The area of the rectangle is: " + Area);
              break;

          case 4: 
              System.out.print("Enter the base of the triangle: ");
              double base = sc.nextDouble();
              System.out.print("Enter the height of the triangle: ");
              double height = sc.nextDouble();
              Area = 0.5 * base * height;
              System.out.println("The area of the triangle is: " + Area);
              break;

          default:
              System.out.println("Invalid choice. Please select a valid shape (1-4).");
              break;
      }

      }
}
