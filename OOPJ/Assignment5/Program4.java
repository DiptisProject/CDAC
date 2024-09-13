package Assignment5;
// question 4
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);

        System.out.print("Enter student name: ");
        String sname = sc.nextLine();
        System.out.print("Enter student ID: ");
        int sid = sc.nextInt();
        System.out.print("Enter student Age: ");
        int age = sc.nextInt();
        System.out.print("Enter course: ");
        String course = sc.next();
        
        Student s=new Student(sname, sid, age, course);
        s.displayDetails();
        
        sc.close();

	}

}
