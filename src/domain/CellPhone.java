package domain;

public class CellPhone extends Phone{
	public static final String BRAND = "NOKIA",
			KIND = "SELLPHONE";
	private boolean portable;
	private String move;
	
	public void setPortable(boolean portable) {
		setMove((portable)?"이동 가능":"이동 불가능");
		this.portable=portable;
	}
	public void setMove(String move) {
		this.move=move;
	}
	public boolean isPortable() {
		return portable;
	}
	public String getMove() {
		return move;
	}
	
	
	public String toString() {
		setPortable(true);
		return String.format("%s 에게 %s 번호로 %s %s 제품 %s 를  사용해서 %s 라고 통화했다 ",
				super.getName(),super.getPhoneNum(),move,BRAND,KIND,
				super.getCall());
	}
}
