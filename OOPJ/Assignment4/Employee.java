package Assignment4;

import java.util.Scanner;

public class Employee {

	private String EmpName;
	private int EmpId;
	private int Salary;
	private String city;
	
	public void acceptRecord()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Employee Name : ");
		this.EmpName= sc.nextLine();
		
		System.out.println("Employee ID : ");
		this.EmpId= sc.nextInt();
		
		System.out.println("Employee Salary : ");
		this.Salary= sc.nextInt();
		
		System.out.println("City :");
		this.city =sc.next();
		
		sc.close();
	}
	
	public void printRecord()
	{
		
		System.out.println(".......Display Employee Information....");
		
		System.out.println("Employee Name is:"+this.EmpName);
		System.out.println("Employee Id is:"+this.EmpId);
		System.out.println("Employee Salary is:"+this.Salary);
		System.out.println("Employee City is:"+this.city);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Employee e = new Employee();
       e.acceptRecord();
       e.printRecord();
	}	

}
