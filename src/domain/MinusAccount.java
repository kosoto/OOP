package domain;

public class MinusAccount extends Account {
	public final static String ACCOUNT_TYPE="마이너스통장";
	protected int limit; // 대출금,대출한도
	//대출여부 물어보기
	public MinusAccount(
			String name,String uid, String pass
			) {
		super(name,uid,pass);
		setAccountType(ACCOUNT_TYPE); 
	}
	
	public void setLimit(int limit) {
		this.limit = -limit;
	}
	
	public int getLimit() {
		return limit;
	}
	
	public String toString() {
		return String.format(
				"%s \n %s \n 계좌번호 : %s \n 이름 : %s \n 생성일 : %s \n 대출 : %s 원",
				BANK_NAME,accountType,
				accountNo,name,
				createDate,money 
				);
	}
}
