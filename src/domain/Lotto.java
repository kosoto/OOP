package domain;
/**
 * 로또볼 추첨
 * 1~45까지 랜덤숫자
 * 볼갯수는 총 6개
 * 중복 허용
 * 출력은 [5, 23, 24, 40,19,22]
 * */
public class Lotto {
	int[] ball = new int[6];
	int money;
	String result;
	public void setBall() {
		for(int i=0;i<6;i++) {
			ball[i]=(int)(Math.random()*45+1);	
			for(int j=0;j<i;j++) {
				if(ball[i]==ball[j]) {
					i--;break;
				}
			}
		}
	}
	public void setMoney(int money) {
		this.money=money;
	}
	public void setResult() {
		result = "얼마 어치를 구입합니까?\n"+money+"\n";
		for(int j=0;j<money/1000;j++) {
			setBall();
				result+=
						String.format("%d   %d   %d   %d   %d   %d\n",
								ball[0],ball[1],ball[2],ball[3],ball[4],ball[5]);
		}		
	}
	
	public int[] getBall() {
		return ball;
	}
	public int getMoney() {
		return money;
	}
	public String getResult() {
		return result;
	}
	
	
}
