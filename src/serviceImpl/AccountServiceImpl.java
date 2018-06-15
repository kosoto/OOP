package serviceImpl;

import domain.Account;
import service.AccountService; //비지니스 로직
public class AccountServiceImpl implements AccountService{
	Account[] list;
	int count;
	
	public AccountServiceImpl() {
		list = new Account[100000];
		count = 0;
	}
	
	@Override
	public void addList(Account account) {
		list[count++]=account;
		
	}
	
	@Override
	public Account[] list() {
		return list;
	}
	
	@Override
	public Account createAccount(String name, String uid, String pass) {
		return new Account(name, uid, pass);
	}
	
	@Override
	public int deposit(int restMoney, String money) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int withdraw(int restMoney, String money) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String createAccountNum(String random) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createRandom(int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createDate() {
		return null;
	}

	@Override
	public String showResult() {
		String result = "";
		for(int i=0;i<count;i++) {
			result +=list()[i].toString();
		}
		return result;
	}

	


	}


