package EntityClassAssignment1;

public class StudentDemo {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setAge(20);
		s1.setGrade("A");
		s1.setName("Swathi");
		System.out.println("Student Name is " + s1.getName());
		System.out.println("Student Age is " + s1.getAge());
		System.out.println("Student Grade is " + s1.getGrade());
		System.out.println("---------------------");
		
		
		Student s2=new Student();
		s1.setAge(21);
		s1.setGrade("S");
		s1.setName("Samu");
		System.out.println("Student Name is " + s1.getName());
		System.out.println("Student Age is " + s1.getAge());
		System.out.println("Student Grade is " + s1.getGrade());
		System.out.println("---------------------");
		
		Student s3=new Student();
		s1.setAge(21);
		s1.setGrade("B");
		s1.setName("Dharani");
		System.out.println("Student Name is " + s1.getName());
		System.out.println("Student Age is " + s1.getAge());
		System.out.println("Student Grade is " + s1.getGrade());	
		System.out.println("---------------------");
	}
}