package inherit;

public class Calculator implements Operations {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c= new Calculator();
		c.add(10,20);
		c.sub(10,5);
		c.div(10,2);

	}

	@Override
	public void add(double a, double b) {
		// TODO Auto-generated method stub
		System.out.println("addition of the numbers=  "+(a+b));
		
	}

	@Override
	public void sub(double a, double b) {
		// TODO Auto-generated method stub
		System.out.println("subtraction of the numbers=  "  +(a-b));
		
	}

	@Override
	public void div(double a, double b) {
		// TODO Auto-generated method stub
		System.out.println("Division of two numbers=  " +(a/b));
		
	}

}
