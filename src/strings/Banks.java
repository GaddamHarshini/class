package strings;

import java.util.Scanner;

public class Banks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		long kotak[]=new long[4];
		long customerDetails[]= new long[4];
		long cd[]=new long[4];
		for (int i = 0; i < kotak.length; i++) {
			
			for (int j = 0; j < cd.length; j++) {
			
			for (int k = 0; k < customerDetails.length; k++) {
				
				System.out.println("enter account number");
				long accno=sc.nextLong();
				customerDetails[0]=accno;
				
				System.out.println("enter aadhar number");
				long aadharno=sc.nextLong();
				customerDetails[1]=aadharno;
				
				System.out.println("enter the balane");
				long balance=sc.nextLong();
				customerDetails[2]=balance;
				
				System.out.println("enter mobile number");
				long mobileno=sc.nextLong();
				customerDetails[3]=mobileno;
				

			}
	
			}
		}
		
		
		
			
		
	}

}
