package condition;

public class Student {
int rollno;
String name;
public Student() {
	// TODO Auto-generated constructor stub
	System.out.println("constructor called");
}
public Student(int rollno, String name)
{
	this();
	this.rollno=rollno;
	this.name=name;
	System.out.println(rollno+"  "+name);
	new Student();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Student a =new Student(1,"abcd");
          new Student();
          new Student();
          
	}

}
