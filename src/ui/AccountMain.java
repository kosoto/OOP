package ui;
/**
 * 비트뱅크
 * 기본통장 
 * 계좌번호 : 123-456-789
 * 이름 : 홍길동
 * 생성일 : 2018년 6월 10일
 * 잔액(or 대출) : 10000원
 * -----------
 * 비트뱅크
 * 마이너스통장 
 * 계좌번호 : 123-456-789
 * 이름 : 홍길동
 * 생성일 : 2018년 6월 10일
 * 대출 : -10000원
 * */
import javax.swing.JOptionPane;
import domain.Account;
import domain.MinusAccount;
public class AccountMain {
	enum Butt{EXIT,ACCOUNT,MINUSACCOUNT};
	public static void main(String[] args) {
		Butt[] button = {Butt.EXIT,Butt.ACCOUNT,Butt.MINUSACCOUNT};
		Account ac = null;
		MinusAccount minusac = null;
		while(true) {
			Butt select = (Butt)JOptionPane.showInputDialog(
					null,
					"Main Menu",
					"Select Menu",
					JOptionPane.QUESTION_MESSAGE,
					null,
					button,
					button[1]);
			switch(select) {
			case EXIT : return;
			case ACCOUNT : 
				ac = new Account();
				ac.setName(JOptionPane.showInputDialog("이름은?"));
				ac.setUid(JOptionPane.showInputDialog("아이디 입력"));
				ac.setPass(JOptionPane.showInputDialog("비밀번호 입력"));
				ac.setAccountNo();
				ac.setCreateDate();
				ac.setMoney(Integer.parseInt(JOptionPane.showInputDialog("입금하시겠습니까?")));
				JOptionPane.showMessageDialog(null, ac.toString());
				break;
			case MINUSACCOUNT : 
				minusac = new MinusAccount();
				minusac.setName(JOptionPane.showInputDialog("이름은?"));
				minusac.setUid(JOptionPane.showInputDialog("아이디 입력"));
				minusac.setPass(JOptionPane.showInputDialog("비밀번호 입력"));
				minusac.setAccountNo();
				minusac.setCreateDate();
				minusac.setDebt(Integer.parseInt(JOptionPane.showInputDialog("대출하시겠습니까?")));
				JOptionPane.showMessageDialog(null, minusac.toString());
				break;
			}
			
		}
	}
}
