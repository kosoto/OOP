package domain;

public class MinusAccount extends Account {
	public final static String ACCOUNT_TYPE="마이너스통장";
	public int debt; // 대출금
	//대출여부 물어보기
	public void setDebt(int debt) {
		this.debt = -debt;
	}
	
	public int getDebt() {
		return debt;
	}
	
	public String toString() {
		return String.format(
				"%s \n %s \n 계좌번호 : %s \n 이름 : %s \n 생성일 : %s \n 대출 : %s ",
				super.BANK_NAME,ACCOUNT_TYPE,
				super.accountNo,super.name,
				super.createDate,debt 
				);
	}
	
}
