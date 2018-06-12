package domain;

public class Grade {
	int kor,eng,math,aver,total;
	String name,grade;
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng=eng;
	}
	public void setMath(int math) {
		this.math=math;
	}
	public void setAver() {
		aver=total/3;
	}
	public void setTotal() {
		total=kor+eng+math;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setGrade() {
		switch(aver/10) {
		case 10:case 9:	grade = "A";
			break;
		case 8:	grade = "B";
			break;
		case 7:	grade = "C";
			break;
		case 6:	grade = "D";
			break;
		case 5:	grade = "E";
			break;
		default:grade = "F";
			break;
		}
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public int getAver(){
		return aver;
	}
	public int getTotal() {
		return total;
	}
	public String getName() {
		return name;
	}
	public String getGrade() {
		return grade;
	}
	public String toString() {
		return String.format("| %s | %d | %d | %d | %d | %d | %s |",
				name,kor,eng,math,total,aver,grade);
	}
}

