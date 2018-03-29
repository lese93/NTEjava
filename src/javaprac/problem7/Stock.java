package javaprac.problem7;

public class Stock {

	String item; // 종목
	int code;  // 코드
	int currentPrice; // 현재가 
	int maxPrice;  // 최대가
	int minPrice;  // 최소가
	
	
	public Stock() {
	}


	public Stock(String item, int code, int currentPrice, int maxPrice, int minPrice) {
		this.item = item;
		this.code = code;
		this.currentPrice = currentPrice;
		this.maxPrice = maxPrice;
		this.minPrice = minPrice;
	}




	@Override
	public String toString() {
		return "종목: " + item + ", 코드:" + code 
				+ ", 현재가: " + currentPrice + "만, 최고가: " + maxPrice 
				+ "만, 최저가 :" + minPrice + "만";
	}
}
