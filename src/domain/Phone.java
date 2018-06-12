package domain;

public class Phone {
	private String name,phoneNum,call;
	public static final String BRAND="삼성",KIND="TELLEPHONE";
	
	public void setName(String name) {
		this.name=name;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum=phoneNum;
	}

	public void setCall(String call) {
		this.call=call;
	}
	
	public String getName() {
		return name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public String getCall() {
		return call;
	}
	public String toString() {
		return String.format("%s 에게 %s 번호로 %s 제품 %s 를  사용해서 %s 라고 통화했다 ",
				name,phoneNum,BRAND,KIND,call);
	}
}
