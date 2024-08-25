import java.util.*;
class DisCalculation
{
	public static void main(String[] args)
	{
		double totalPurchase;
		double Discount=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Total Purchase:");
		totalPurchase=sc.nextDouble();
		System.out.print("Do you have a membership card? (yes/no): ");
        String membershipResponse = sc.next();

        boolean hasMembership = membershipResponse=="yes";
		if(totalPurchase>=1000)
		{
			Discount=0.20;
		}
		else if(totalPurchase>=500&&totalPurchase<=999)	
		{
			Discount=0.10;
		}
		else if(totalPurchase<500)
		{
			Discount=0.05;
			
		}
		
		if (hasMembership) {
            Discount+= 0.05;
        }
		
		double discountAmount = totalPurchase * Discount;
        double finalAmount = totalPurchase - discountAmount;
		
        System.out.println("Total Purchase Amount: Rs." + totalPurchase);
        System.out.println("Discount Amount: Rs." + discountAmount);
        System.out.println("Final Amount to Pay: Rs." + finalAmount);
	}
}