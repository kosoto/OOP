package ui;
import javax.swing.JOptionPane;
import domain.*;
public class PhoneMain {
	//0. 통화종료
	//1. 집전화기
	enum CallButt {
			EXIT,TELLEPHONE,CELLPHONE,IPHONE,GALAXYPHONE
	};
	public static void main(String[] args) {
		CallButt[] callButt= {
				CallButt.EXIT, CallButt.TELLEPHONE, CallButt.CELLPHONE,
				CallButt.IPHONE, CallButt.GALAXYPHONE
		};
		Phone phone = null;
		CellPhone cellPhone = null;
		IPhone iPhone = null;
		GalaxyPhone galaxy = null;
		String[] result = new String[10];
		
		while(true){
			CallButt select =(CallButt)JOptionPane.showInputDialog(
					null,
					"MAIN MENU",
					"SELECT MENU",
					JOptionPane.QUESTION_MESSAGE,
					null,
					callButt,
					callButt[1]
					);
			switch(select) {
			case EXIT : return;
			case TELLEPHONE :
				phone = new Phone();
				phone.setName(JOptionPane.showInputDialog("이름은?"));
				phone.setPhoneNum(JOptionPane.showInputDialog("전화번호는?"));
				phone.setCall(JOptionPane.showInputDialog("통화 내용 입력"));
				JOptionPane.showMessageDialog(null, phone.toString());
				break;
			case CELLPHONE : 
				cellPhone = new CellPhone();
				cellPhone.setName(JOptionPane.showInputDialog("이름은?"));
				cellPhone.setPhoneNum(JOptionPane.showInputDialog("전화번호는?"));
				cellPhone.setCall(JOptionPane.showInputDialog("통화 내용 입력"));
				JOptionPane.showMessageDialog(null, cellPhone.toString());
				break;
			case IPHONE : 
				iPhone = new IPhone();
				iPhone.setName(JOptionPane.showInputDialog("이름은?"));
				iPhone.setPhoneNum(JOptionPane.showInputDialog("전화번호는?"));
				iPhone.setData(JOptionPane.showInputDialog("문자 내용 입력"));
				JOptionPane.showMessageDialog(null, iPhone.toString());
				
				break;
			case GALAXYPHONE :
				galaxy = new GalaxyPhone();
				galaxy.setName(JOptionPane.showInputDialog("이름은?"));
				galaxy.setPhoneNum(JOptionPane.showInputDialog("전화번호는?"));
				galaxy.setData(JOptionPane.showInputDialog("카톡 내용 입력"));
				JOptionPane.showMessageDialog(null, galaxy.toString());
				break;
			}	
			
			
					
			}
			
			
			
			
		}
		
		
	}
