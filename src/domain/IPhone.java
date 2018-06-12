package domain;

public class IPhone extends CellPhone {
	protected String data;
	static public final String BRAND = "애플",KIND="아이폰"; 
	
	public void setData(String data) {
		this.data=data+"이라고 문자했다.";
	}
	
	public String getData() {
		return data;
	}
	
	public String toString() {
		// 홍길동에게 010번호로 애플 제품 아이폰을 사용해서
		// 이동가능한 상태로 안녕이라고 문자를 전송했다. 
		super.setPortable(true);
		return String.format("%s에게 %s번호로 %s제품 %s을 사용해서 %s상태로 %s",
				super.getName(),super.getPhoneNum(),BRAND,KIND,super.getMove(),data
				);
	}
}
