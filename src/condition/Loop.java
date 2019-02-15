package condition;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num1=sc.nextInt();
		int i=1;
		int s;
		while(i<=10)
		{
			s=num1*i;
			System.out.println(num1+" * "+ i +" = "+s);
			i++;
		}

	}

}
