package ATdev.std.admin.model;

public class Student {
	private int stdID;
	private String stdName;
	private int stdAge;
	private String dept;
	
	
	public Student(int stdID, String stdName, int stdAge, String dept) {
		super();
		this.stdID = stdID;
		this.stdName = stdName;
		this.stdAge = stdAge;
		this.dept = dept;
	}
	public int getStdID() {
		return stdID;
	}
	public void setStdID(int stdID) {
		this.stdID = stdID;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public int getStdAge() {
		return stdAge;
	}
	public void setStdAge(int stdAge) {
		this.stdAge = stdAge;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	

}