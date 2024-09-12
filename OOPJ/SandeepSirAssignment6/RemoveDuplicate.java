package org.java.day6;
//question 4
import java.util.Arrays;

public class RemoveDuplicate {

	private static int[] removeDuplicate(int []array) {
		int n=array.length;
		int[]temp=new int[n];
		int j=0;
		
		Arrays.sort(array);
		
		for (int i = 0; i < n - 1; i++) {
            if (array[i] != array[i + 1]) {
                temp[j++] = array[i];
            }
        }
        temp[j++] = array[n - 1]; 

        return Arrays.copyOf(temp, j);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[]array= {1,2,18,34,22,34,2,1,44};
        System.out.println("Array Element:");
        for(int i=0;i<array.length;++i)
        {
        System.out.print(array[i]+" ");
        }
        
        int[]result=removeDuplicate(array);
        System.out.println(" ");
        System.out.println("\nRemove Elements:"+Arrays.toString(result));
       
	}

}
