package Encapsulation;

public class TestEmployees {

		public static void main(String[] args) {
			Employees em1 = new Employees(null, 0, null);
			em1.setEmName("Sarah");
			em1.setEmID(4567);
			em1.setEmDOB("12/1/1990");
			System.out.println(em1.getEmName()+" "+em1.getEmID()+" "+ em1.getEmDOB());
		
			
			Employees em2 = new Employees(null, 0, null);
			em2.setEmName("Dola");
			em2.setEmID(3677);
			em2.setEmDOB("1/1/1990");
			System.out.println(em2.getEmName()+" "+em2.getEmID()+" "+ em2.getEmDOB());
			
			Employees em3 = new Employees("mamoud",103, "12-31-1985");
	System.out.println(em3.getEmName()+" "+em3.getEmID()+" "+ em3.getEmDOB());

		}
		
	}
	


