package strings;

import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long cust1[]=new long[4];
		System.out.println("enter the account number");
		     cust1[0]=sc.nextLong();
		     System.out.println("enter aadhar number");
		     cust1[1]=sc.nextLong();
		     System.out.println("enter mobile number");
		     cust1[2]=sc.nextLong();
		     System.out.println("enter balance");
		     cust1[3]=sc.nextLong();
		 long cust2[]=new long[4]; 
			System.out.println("enter the account number");
			     cust2[0]=sc.nextLong();
			     System.out.println("enter aadhar number");
			     cust2[1]=sc.nextLong();
			     System.out.println("enter mobile number");
			     cust2[2]=sc.nextLong();
			     System.out.println("enter balance");
			     cust2[3]=sc.nextLong();
			     
			     long cust3[]=new long[4]; 
					System.out.println("enter the account number");
					     cust3[0]=sc.nextLong();
					     System.out.println("enter aadhar number");
					     cust3[1]=sc.nextLong();
					     System.out.println("enter mobile number");
					     cust3[2]=sc.nextLong();
					     System.out.println("enter balance");
					     cust3[3]=sc.nextLong();
					     long cust4[]=new long[4]; 
							System.out.println("enter the account number");
							     cust4[0]=sc.nextLong();
							     System.out.println("enter aadhar number");
							     cust4[1]=sc.nextLong();
							     System.out.println("enter mobile number");
							     cust4[2]=sc.nextLong();
							     System.out.println("enter balance");
							     cust4[3]=sc.nextLong();
					     
		long kotak[][]=new long[3][];
		kotak[0]=cust1;
		kotak[1]=cust2;
		kotak[2]=cust3;
		for (int i = 0; i < kotak.length; i++) {
			for (int j = 0; j < kotak[i].length; j++) {
				System.out.print(kotak[i][j]+"  ");
				
			}
			System.out.println();
		}

	}

}
