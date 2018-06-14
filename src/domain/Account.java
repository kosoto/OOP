package domain;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Account {
	public final static String BANK_NAME="비트뱅크";
	public final static String ACCOUNT_TYPE="기본통장";
	public final static String WITHDRAW_SUCCESS="출금성공";
	public final static String WITHDRAW_FAIL="잔액부족";
	public final static String DEPOSIT_SUCCESS="입금성공";
	public final static String DEPOSIT_FAIL="적합한 입력값이 아님";
	protected int money,deposit,withdraw;
	protected String name,uid,pass,accountNo,accountType,createDate,error;
	public Account(
			String name, String uid,String pass
			) {
		setAccountType(ACCOUNT_TYPE);
		setAccountNo();
		setCreateDate(); 
		this.name=name;
		this.uid=uid; 
		this.pass=pass;
		
	}
	public void setDeposit(int deposit) {
		this.money += deposit;
	}
	public void setWithdraw(int withdraw) {
		int money = this.money;
		if(money-withdraw>=0) {
			money -= withdraw;
		}else {
			this.error="잔액이 부족합니다.";
		}
		
		this.money = money;
	}
	public void setAccountType(String accountType) {
		this.accountType=accountType;
	}
	public void setPass(String pass) {
		this.pass=pass;
	}
	public void setCreateDate() {
		createDate = new SimpleDateFormat("yyyy년 MM월 dd일").format(new Date());
	}
	public void setAccountNo() {
		String accountNo="";
		for(int i=0;i<11;i++) {
			accountNo+=(i%4!=3)?(int)(Math.random()*10):"-";
		}
		this.accountNo=accountNo;
	}
	public void setMoney(int money) {
		this.money=money;
	}
	
	public int getDeposit() {
		return deposit;
	}
	public int getWithdraw() {
		return withdraw;
	}
	public String getAccountType() {
		return accountType;
	}
	public String getName() {
		return name;
	}
	public String getUid() {
		return uid;
	}
	public String getPass() {
		return pass;
	}
	public String getCreateDate() {
	
		return createDate;
	}
	public String getAccountNo() {
		
		return accountNo;
	}
	public int getMoney() {
		return money;
	}
	
	public String toString() {
		String result =String.format(
				"%s \n %s \n 계좌번호 : %s \n 이름 : %s \n 생성일 : %s \n 잔액 : %s 원 ",
				BANK_NAME,accountType,accountNo,name,createDate,money 
				); 
		return result;
		
	}
}
