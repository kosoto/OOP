package ui;
import javax.swing.JOptionPane;

import domain.Payment;
import domain.StaffSalary;
import domain.OwnerSalary;
/**
 * 이름/본봉 입력
 * 성+직급/월급 출력 ex) 김인턴 100만원 지급
 * 김길동 -> 김인턴 
 * 김길동 -> 김직원
 * 김길동 -> 김이사 
 * */
public class SalaryMain {
	enum SalaryButt  {
		EXIT,
		INTERNSHIP,
		FULL_TIME_EMPLOYEE,
		DIRECTOR
		};
	public static void main(String[] args) {
		SalaryButt[] Buttons= {
				SalaryButt.EXIT, SalaryButt.INTERNSHIP, SalaryButt.FULL_TIME_EMPLOYEE,
				SalaryButt.DIRECTOR
		};
		Payment pay = null;
		while(true) {
			SalaryButt select = (SalaryButt)JOptionPane.showInputDialog(
					null,
					"Choice of Member Type",
					"Select Menu",
					JOptionPane.QUESTION_MESSAGE,
					null,
					Buttons,
					Buttons[1]);
			switch(select) {
			case EXIT : return;
			case INTERNSHIP :
				pay = new Payment(
						JOptionPane.showInputDialog("이름?"),
						Integer.parseInt(JOptionPane.showInputDialog("기본급은?"))
						);
				JOptionPane.showMessageDialog(null, pay.toString());
				break;
			case FULL_TIME_EMPLOYEE : 
				pay = new StaffSalary(
						JOptionPane.showInputDialog("이름?"),
						Integer.parseInt(JOptionPane.showInputDialog("기본급은?"))
						);
				JOptionPane.showMessageDialog(null, pay.toString());
				break;
			case DIRECTOR : 
				pay = new OwnerSalary(
						JOptionPane.showInputDialog("이름?"),
						Integer.parseInt(JOptionPane.showInputDialog("기본급은?"))
						);
				JOptionPane.showMessageDialog(null, pay.toString());break;
			
			
			}
			
		}
		
	}
}
