package condition;

public class Batch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Student1 s1=new Student1();
         s1.setName("riya");
         s1.setRollno(100);
         s1.setFees(10000);
         s1.setCollege("vjit");
        
         Student1 s2=new Student1();
         s2.setName("nithu");
         s2.setRollno(101);
         s2.setFees(10001);
         s2.setCollege("cbit");
        // System.out.println(s2.getCollege());
         Student1 s3=new Student1();
         s3.setName("nithu");
         s3.setRollno(101);
         s3.setFees(10001);
         System.out.println(s1.getCollege());
         System.out.println(s2.getCollege());
         System.out.println(s3.getCollege());
         
         
         
	}

}
