package org.java.day5;

public class InstanceCounter {
 
	private static int count=0;
	
	static {
		count=0;
	}
	
	public InstanceCounter(){
		count++;
	}
	
	public static int getInstanceCount() {
		return count;
	}
	
	public String toString() {
		return "InstanceCounter object: " + count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceCounter is=new InstanceCounter();
		System.out.println(is);
		
		InstanceCounter is2 = new InstanceCounter();
        System.out.println(is2);

        InstanceCounter is3 = new InstanceCounter();
        System.out.println(is3);
        System.out.println("...................................");
        System.out.println("Total Instance Created: "+InstanceCounter.getInstanceCount());
	}

}
