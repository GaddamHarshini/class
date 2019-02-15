package inherit;

public class Aeroplane extends Flyable {

	@Override
	void fly() {
		// TODO Auto-generated method stub
		System.out.println("plane is flying");
		
	}

	@Override
	void land() {
		// TODO Auto-generated method stub
		System.out.println("plane is about to land");
		
	}

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("plane is on te runway");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flyable a=new Aeroplane();
		a.fly();
		a.land();
		a.run();
		a.firstAid();

}
}
