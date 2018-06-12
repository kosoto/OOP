package domain;

public class BMI {
	String name,result;
	double height,weight;
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setResult() {
		double bmi= weight / (height * height);
		result = "3단계 비만";
		if (bmi < 18.5) {
			result = "저체중";
		} else if (bmi < 23) {
			result = "정상";
		} else if (bmi < 25) {
			result = "비만 전단계";
		} else if (bmi < 30) {
			result = "1단계 비만";
		} else if (bmi < 35) {
			result = "2단계 비만";
		}
	}
	public String getName() {
		return name;
	}
	public String getResult() {
		return result;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	public String toString() {
		return String.format("| %s | %f | %f | %s |", name,height,weight,result);
	}
}
