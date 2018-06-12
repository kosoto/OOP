package domain;
//홍길동에게 010번호로 삼성 제품 6인치 갤럭시노트폰을 사용해서
// 이동가능한 상태로 안녕이라고 카톡를 전송했다.
// data를 오버라이딩
public class GalaxyPhone extends IPhone{
	private String size;
	public static final String BRAND = "삼성",KIND="갤럭시노트폰";
	
	public void setSize() {
		this.size="6";
	}
	
	public String getSize() {
		return size;
	}
	
	public void setData(String data) {
		super.data=data+"이라고 카톡했다.";
	}
	
	public String toString() {
		setSize();
		super.setPortable(true);
		return String.format("%s에게 %s번호로 %s제품 %s인치 %s을 사용해서 %s상태로 %s이라고 카톡을 전송했다",
				super.getName(),super.getPhoneNum(),BRAND,size,KIND,
				super.getMove(),super.getData());
		
	}
}
