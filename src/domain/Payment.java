package domain;

public class Payment {
	public static final String DEPT = "인턴";
	protected String dept,name;
	protected int sal;
	
	public Payment(String name,int sal){
		//this.dept=DEPT;
		setdept(DEPT);
		this.name=name.substring(0, 1)+dept;
		this.sal=sal;
	}
	
	public void setdept(String dept) {
		this.dept=dept;
	}
	
	public String getdept() {
		return dept;
	}
	
	public String toString() {
		return String.format("%s  %d만원",name,sal);
	}
}
