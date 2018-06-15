package domain;

public class StaffSalary extends Payment{
	public static final String DEPT = "직원";
	int bonus; //10%
	public StaffSalary(String name,int sal) {
		super(name,sal);
		setdept(DEPT);
		this.name=name.substring(0, 1)+dept;
		this.bonus=sal/10;
		this.sal+=bonus;
	}
}
