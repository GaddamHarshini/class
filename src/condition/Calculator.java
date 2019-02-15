package condition;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int num1=sc.nextInt();
System.out.println("enter second number");
int num2=sc.nextInt();
System.out.println("enter the operator");
String ch=sc.next();
    switch (ch) {
	case "+" :
		System.out.println("addition is "+(num1+num2));
		break;
	case "-" :
		System.out.println("subtraction is "+(num1-num2));
		break;
	case "*" :
		System.out.println("multiplication is "+(num1*num2));
		break;
	case "/" :
		System.out.println("division is "+(num1/num2));
		break;
	case "%" :
		System.out.println("modulus is "+(num1%num2));
		break;

	default:
		System.out.println("enter a valid operator");
		break;
	}
	
	}

}
