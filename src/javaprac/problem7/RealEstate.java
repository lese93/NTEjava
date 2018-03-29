package javaprac.problem7;

public class RealEstate {

	String type; // 부동산 분류
	String address; // 주소
	int monthlyRent; // 월세 - 만단위
	int rent; // 전세 - 억단위
	int price; // 가격 - 억단위
	int rooms; // 방수
	int area; // 면적 - 평 단위
	int trees; // 나무 수
	int floors; // 층수

	public RealEstate() {
	}

	public RealEstate(String type, String address, int monthlyRent, int rent, int price, int rooms, int area, int trees,
			int floors) {

		this.type = type;
		this.address = address;
		this.monthlyRent = monthlyRent;
		this.rent = rent;
		this.price = price;
		this.rooms = rooms;
		this.area = area;
		this.trees = trees;
		this.floors = floors;
	}

	@Override
	public String toString() {

		// 입력된 전체 데이터를 출력하는 변수, '/'로 스플릿 할것 
		String str = "분류: " + type + "/, 가격: " + price + "억" + "/, 주소: " + address + "/, 방수: " + rooms + "개" + "/, 면적: "
				+ area + "평" + "/, 월세 : " + monthlyRent + "만" + "/, 전세 : " + rent + "억" + "/, 층: " + floors + "층"
				+ "/, 나무수: " + trees + "그루";
		
		// 전체 데이터(str)에서 0이거나 ""인 값에 해당하는 데이터를 제거한 후 저장할 변수
		String resultStr = "";
		
		// slash(/)로 구분하여 배열에 저장
		String[] strTypes = str.split("/");

		// 전체 데이터를 배열에 담음
		Object[] values = { type, price, address, rooms, area, monthlyRent, rent, floors, trees };

		/* 값이 0이거나 ""인 데이터는 넘기고 유의미한 데이터만 저장함 */
		for (int i = 0; i < values.length; i++) {

			if ((values[i] instanceof Integer && (int) values[i] == 0)
					|| values[i].equals("")) {
				continue;
			}
			resultStr += strTypes[i];

		}

		return resultStr;
	}

}
