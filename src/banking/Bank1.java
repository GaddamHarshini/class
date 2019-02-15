package banking;

import java.util.Scanner;

public class Bank1 {
	static double balance=1000;
	public static void transaction(long amount)
	{
		balance=balance+amount;
		System.out.println(balance);
	}
	public static void transaction(long amount,long accno)
	{
		if(balance>=amount)
		{
			balance=balance-amount;
			System.out.println(balance);
		}
		else
		{
			System.out.println("insufficient balance to continue");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=0;
		do
		{
		System.out.println("enter 0 to credit     "+"enter 1 to debit   ");
		int num=sc.nextInt();
		switch (num) {
		case 0:
			System.out.println("enter the amount to be credited");
			long num1=sc.nextLong();
			transaction(num1);
			break;
		case 1:
			System.out.println("enter the amount to be debited");
			long num2=sc.nextLong();
			System.out.println("enter the account number");
			long acno=sc.nextLong();
			
			transaction(num2,acno);
			break;

		default: System.out.println("Enter a valid option");
			break;
		}
		a=sc.nextInt();
		}while(a==1);
		}

	}


