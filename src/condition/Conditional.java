package condition;

import java.util.Scanner;

public class Conditional {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num1=sc.nextInt();
		if(num1%2==0)
		{
			num1+=10;
  		}
		else
		{
			num1+=15;
		}
 System.out.println(num1);
	}

}
