import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {
		int failCount = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the grade for Subject 1: ");
        int sub1 = scanner.nextInt();

        System.out.print("Enter the grade for Subject 2: ");
        int sub2 = scanner.nextInt();

        System.out.print("Enter the grade for Subject 3: ");
        int sub3 = scanner.nextInt();
		
        if (sub1 <= 40) {
            failCount++;
        }
        if (sub2 <= 40) {
            failCount++;
        }
        if (sub3 <= 40) {
            failCount++;
        }

        if (failCount == 0) {
            System.out.println("The student passes.");
        } else {
            System.out.println("The student fails in " + failCount + " subjects.");
        }
    }
}
