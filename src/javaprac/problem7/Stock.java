package javaprac.problem7;

public class Stock {

	String item; // ����
	int code;  // �ڵ�
	int currentPrice; // ���簡 
	int maxPrice;  // �ִ밡
	int minPrice;  // �ּҰ�
	
	
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
		return "����: " + item + ", �ڵ�:" + code 
				+ ", ���簡: " + currentPrice + "��, �ְ�: " + maxPrice 
				+ "��, ������ :" + minPrice + "��";
	}
}
