package condition;

import java.util.Scanner;

public class Greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int num1=sc.nextInt();
		System.out.println("enter second number");
		int num2=sc.nextInt();
		System.out.println("enter third number");
		int num3=sc.nextInt();
        
		if(num1>num2&& num1>num3)
		{
			System.out.println(num1+"is greater");
		}
		else if(num2>num3&& num2>num1)
		{
			System.out.println(num2+"is greater");
		}
		else if(num3>num1&&num3>num2)
		{
			System.out.println(num3+"is greater");
		}
		else if(num1==num2&& num2==num3)
		{
			System.out.println("all the three numbers are equal");
		}
	}

}
