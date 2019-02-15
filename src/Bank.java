
public class Bank {
int accno;
int balance;
public Bank()
{
	System.out.println("constructor called");
}
public Bank(int i, int j)
{
	accno=i;
	balance=j;
	System.out.println(accno+"  "+balance);
}

public static void main(String args[])
{
	Bank b1=new Bank();
	Bank b2=new Bank(25,100);
	Bank b3=new Bank();
	
}
}
