package inherit;

public class Child extends Parent {
	int age=20;
	String name="xyz";
	

	public Child() {
		// TODO Auto-generated constructor stub
		super.show();
		System.out.println(name);
		System.out.println(age);
		System.out.println(super.name);
		System.out.println(super.age);
		show();
	}
	public void show()
	{
		System.out.println("This is a child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Child ch=new Child();
        
        
	}

}
