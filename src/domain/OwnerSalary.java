package domain;

public class OwnerSalary extends StaffSalary{
	public static final String DEPT = "이사";
	protected int share; //(sal+bonus) * 10
	public OwnerSalary(String name,int sal){
		super(name, sal);
		this.dept=DEPT;
		this.name=name.substring(0, 1)+dept;
		this.share= (sal+bonus)*10;
		this.sal+=share;
	}
}
