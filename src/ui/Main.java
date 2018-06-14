package ui;
import javax.swing.JOptionPane;
import domain.BMI;
import domain.Grade;
import domain.Salary;
import domain.Lotto;
/**
 * 얼마치를 구입하십니까? (천원에 한줄)
 * 5200
 * 5	7	14	25	29	43
 * 3	24	33	37	39	43
 * 
 * */ 
public class Main {
	enum Butt{
		EXIT,INPUT_BMI,OUTPUT_BMI,
		INPUT_GRADE,OUTPUT_GRADE,
		INPUT_SALARY,OUTPUT_SALARY,
		INPUT_LOTTO,OUTPUT_LOTTO};
	public static void main(String[] args) {
		Butt[] buttons = {
				Butt.EXIT,Butt.INPUT_BMI,Butt.OUTPUT_BMI,
				Butt.INPUT_GRADE,Butt.OUTPUT_GRADE,
				Butt.INPUT_SALARY,Butt.OUTPUT_SALARY,
				Butt.INPUT_LOTTO,Butt.OUTPUT_LOTTO
				
		};
		BMI bmi = null;
		BMI[] arr = new BMI[2];
		Grade grade = null;
		Grade[] arrGrade = new Grade[10];
		Salary salary = null;
		Salary[] arrSalary = new Salary[10];
		Lotto lotto = null;
		String output="",outputGrade="",outputSalary="";
		int count =0,countGrade=0,countSalary=0;
		while(true) {
			Butt select = (Butt)JOptionPane.showInputDialog(
					null,
					"Main Menu",
					"Select Menu",
					JOptionPane.QUESTION_MESSAGE,
					null,
					buttons,
					buttons[5]);
			switch(select) {
			case EXIT : return;
			case INPUT_BMI : 
				bmi = new BMI();
				bmi.setName(JOptionPane.showInputDialog("이름은?"));
				bmi.setHeight(Double.parseDouble(JOptionPane.showInputDialog("키는 몇 M?")));
				bmi.setWeight(Double.parseDouble(JOptionPane.showInputDialog("몸무게는 몇 kg?")));
				bmi.setResult();
				arr[++count]=bmi;
				break;
			case OUTPUT_BMI :
				output=String.format("| %s | %s | %s | %s |", "이름","키","몸무게","결과");;
				for(int i=1;i<=arr.length;i++) {
					output+=arr[i].toString()+"\n";
				}
				JOptionPane.showMessageDialog(null,output);
				break;
			case INPUT_GRADE : 
				grade = new Grade();
				grade.setName(JOptionPane.showInputDialog("이름은?"));
				grade.setKor(Integer.parseInt(JOptionPane.showInputDialog("국어점수는?")));
				grade.setEng(Integer.parseInt(JOptionPane.showInputDialog("영어점수는?")));
				grade.setMath(Integer.parseInt(JOptionPane.showInputDialog("수학점수는?")));
				grade.setTotal();
				grade.setAver();
				grade.setGrade();
				arrGrade[++countGrade]=grade;
				break;
			case OUTPUT_GRADE :
				outputGrade=String.format("| %s | %s | %s | %s | %s | %s | %s |",
						"이름","국어","영어","수학","총점","평균","학점");
				for(int i=1;i<=countGrade;i++) {
					outputGrade+=arrGrade[i].toString()+"\n";
				}
				JOptionPane.showMessageDialog(null, outputGrade);
				break;
			case INPUT_SALARY :
				salary = new Salary();
				salary.setName(JOptionPane.showInputDialog("이름은?"));
				salary.setDept(JOptionPane.showInputDialog("부서는?"));
				salary.setSal(Integer.parseInt(JOptionPane.showInputDialog("본봉은?")));
				salary.setBonus(Integer.parseInt(JOptionPane.showInputDialog("수당은?")));
				salary.setSum();
				salary.setSumOfGeneral();
				salary.setSumOfSalary();
				salary.setSumOfTotal();
				arrSalary[++countSalary]=salary;
				break;
			case OUTPUT_SALARY : 
				outputSalary=String.format(
						"| %s | %s | %s | %s | %s |\n","부서","이름","본봉","수당","합계");
				for(int i=1;i<=countSalary;i++) {
					outputSalary+=arrSalary[i].toString()+"\n";
				}
				JOptionPane.showMessageDialog(null, outputSalary);
				break;
			case INPUT_LOTTO : 
				lotto = new Lotto();
				lotto.setMoney(Integer.parseInt(JOptionPane.showInputDialog("얼마 어치?")));
				lotto.setResult();
				break;
			case OUTPUT_LOTTO : 
				JOptionPane.showMessageDialog(null, lotto.getResult());
				break;
			
			}
		}
	}
}
