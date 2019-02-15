package strings;

import java.util.Scanner;

public class Stringexample {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	String s="Deforestation is the reason for increase in pollution";
		System.out.println(s.charAt(5));
		System.out.println(s.charAt(6));
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());*/
	/*	Scanner sc= new Scanner(System.in);
		int accNo[]=new int[5];
		for (int i = 0; i < accNo.length; i++) {
			System.out.println("enter the number");
			int num=sc.nextInt();
			accNo[i]=num;
			
		}
		for (int i = 0; i < accNo.length; i++) {
			System.out.println(accNo[i]);
			
		}*/
		int num;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter rows and columns");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int mat1[][]=new int[row][col];
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
                System.out.println("enter the elements");
                num=sc.nextInt();
                mat1[i][j]=num;
				
			}
			
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(mat1[i][j]);
				
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
