
package com.java.day4_5;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TollBoothRevenueManagerUtil dc=new TollBoothRevenueManagerUtil();
		int choice=0;
		
		do {
			switch(choice)
			{
			case 1:
				dc.setTroll();
				break;
			case 2:
				dc.acceptRecord();
				break;
			case 3:
				dc.printRecord();
			case 0:
				System.out.println("Exit Programming");
				break;
			}
		}while((choice=TollBoothRevenueManagerUtil.menuList())!=0);
	}
}
