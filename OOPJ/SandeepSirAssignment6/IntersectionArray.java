package org.java.day6;
//question 5
public class IntersectionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]array= {1,2,3,4,5};
		int[]array1= {3,4,5,6,7};
		System.out.println("1st Array Element:");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");		
		}
		System.out.println(" ");
		System.out.println("\n2nd Array Element");
		for(int i=0;i<array1.length;++i)
		{
			System.out.print(array1[i]+" ");
			
		}
		System.out.println(" ");
		System.out.println("");
		System.out.println("Intersection Array");
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array1.length;j++)
			{   
				if(array[i]==array1[j])
				{
					System.out.print(array[i]+" ");
				}
			}
		}
	}
}
