package domain;

public class Salary {
	String dept,name;
	int sal,bonus,sumOfSales,sumOfGeneral,sumOfTotal,sum;
	public void setDept(String dept) {
		this.dept=dept;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setSal(int sal) {
		this.sal=sal;
	}
	public void setBonus(int bonus) {
		this.bonus=bonus;
	}
	public void setSum() {
		sum= sal+bonus;
	}
	public void setSumOfSalary() {
		if(dept.equals("영업")) {
			sumOfSales+=sum;
		}
	}
	public void setSumOfGeneral() {
		if(dept.equals("총무")) {
			sumOfSales+=sum;
		}
	}
	public void setSumOfTotal() {
		sumOfTotal+=sum;
	}
	
	public String getDept() {
		return dept;
	}
	public String getName() {
		return name;
	}
	public int getSal() {
		return sal;
	}
	public int getBonus() {
		return bonus;
	}
	public int getSum() {
		return sum;
	}
	public int getSumOfSales() {
		return sumOfSales;
	}
	public int getSumOfGeneral() {
		return sumOfGeneral;
	}
	public int getSumOfTotal() {
		return sumOfTotal;
	}
	public String toString() {
		return String.format(
				"| %s | %s | %d | %d | %d |",dept,name,sal,bonus,sum);
	}
}

