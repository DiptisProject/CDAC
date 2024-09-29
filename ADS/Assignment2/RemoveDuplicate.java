package Assignment2;

import java.util.Scanner;
public class RemoveDuplicate {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        
        int[] nums = new int[n];
        System.out.print("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        int newLength = 1;
       
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[newLength - 1]) {
                nums[newLength] = nums[i];
                newLength++;
            }
        }
        
        System.out.println("Remove duplicates and Print Updated array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.println(nums[i] + " ");
        }
        
        System.out.print("");
        System.out.println("New length: " + newLength);
        sc.close();
    }
}
