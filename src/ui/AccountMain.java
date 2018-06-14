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
	enum Butt{EXIT,ACCOUNT,MINUS_ACCOUNT,DEPOSIT,WITHDRAW};
	public static void main(String[] args) {
		Butt[] button = {
				Butt.EXIT,Butt.ACCOUNT,Butt.MINUS_ACCOUNT,
				Butt.DEPOSIT,Butt.WITHDRAW
		};
		Account ac = null;
		while(true) {
			Butt select = (Butt)JOptionPane.showInputDialog(
					null,
					"Choice of Account Type",
					"Select Menu",
					JOptionPane.QUESTION_MESSAGE,
					null,
					button,
					button[1]);
			switch(select) {
			case EXIT : return;
			case ACCOUNT : 
				ac = new Account(
						JOptionPane.showInputDialog("이름은?"),
						JOptionPane.showInputDialog("아이디 입력"),
						JOptionPane.showInputDialog("비밀번호 입력")
						);
				ac.setMoney(Integer.parseInt(JOptionPane.showInputDialog("입금하시겠습니까?")));
				JOptionPane.showMessageDialog(null, ac.toString());
				break;
			case MINUS_ACCOUNT : 
				ac = new MinusAccount(
						JOptionPane.showInputDialog("이름은?"),
						JOptionPane.showInputDialog("아이디 입력"),
						JOptionPane.showInputDialog("비밀번호 입력")
						);
				((MinusAccount) ac).setLimit(Integer.parseInt(JOptionPane.showInputDialog("대출한도 설정")));
				JOptionPane.showMessageDialog(null, ac.toString());
				break;
			case DEPOSIT :
				ac.setDeposit(Integer.parseInt(JOptionPane.showInputDialog("얼마 입금하시겠어요?")));
				JOptionPane.showMessageDialog(null, "잔액 : "+ac.getMoney());
				
				break;
			case WITHDRAW : 
				int money=0;
				if(((MinusAccount) ac).getLimit()!=0) {
					money = Integer.parseInt(JOptionPane.showInputDialog("얼마를 출금하시겠습니까?"));
					if(money>((MinusAccount) ac).getLimit()) {
						//출금성공
						ac.setWithdraw(money);
					}else {
						//출금불가
						JOptionPane.showInternalMessageDialog(null, "출금 불가");break;
					}
				}else {
					if(money>((MinusAccount) ac).getMoney()) {
						//출금성공
						ac.setDeposit(money);
					}else {
						//출금불가
						JOptionPane.showMessageDialog(null, "출금 불가");break;
					}
						
				}
				JOptionPane.showMessageDialog(null, "잔액 : "+ac.getMoney());
				break;
		
			}
			
		}
	}
}
