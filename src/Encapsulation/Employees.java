package Encapsulation;

public class Employees {

	private String stName;
	private int emID;
	private String emDOB;
	private String emName;

	public void Employees() {
		System.out.println("This is one of our Employees");
	}

	public Employees(String emName, int emID, String emDOB) {
		super();
		this.emName = emName;
		this.emID =emID;
		this.emDOB = emDOB;
	}

	public String getEmName() {
		return emName;
	}
	public void setEmName(String emName) {
		this.emName = emName;
	}
	public int getEmID() {
		return emID;
	}
	public void setEmID(int emID) {
		this.emID = emID;
	}
	public String getEmDOB() {
		return emDOB;
	}
	public void setEmDOB(String emDOB) {
		this.emDOB = emDOB;
	
}
}