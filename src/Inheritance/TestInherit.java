package Inheritance;

public class TestInherit {

	public static void main(String[] args) {
		Student s = new Student ();
		s.Gpa();
		s.Id();
		
		
		Undergraduate u = new Undergraduate ();
		u.Gpa();
		u.Id();
		u.major();

	}

}
