package javaprac.problem7;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
	
		List<Stock> stocks = new ArrayList<Stock>();
		List<RealEstate> realEstates = new ArrayList<RealEstate>();
		
		// 주식 데이터 추가
		stocks.add(new Stock("삼성전자",1,200,250,100));
		stocks.add(new Stock("셀트리온",2,8,15,5));
		
		
		// 부동산 데이터 추가
		realEstates.add(new RealEstate("주택", "서울 강남구", 0, 0, 10, 3, 20, 0, 0));
		realEstates.add(new RealEstate("오피스텔", "서울 동작구", 100, 0, 2, 0, 30, 0, 0));
		realEstates.add(new RealEstate("아파트", "서울 마포구", 0, 1, 5, 4, 0, 0, 0));
		realEstates.add(new RealEstate("빌라", "서울 강남구", 0, 0, 0, 2, 15, 0, 5));
		realEstates.add(new RealEstate("토지", "서울 종로구", 0, 0, 50, 0, 100, 50, 0));
	
		
		// 주식과 부동산을 가진 부자 생성
		RichPerson rp1 = new RichPerson(stocks, realEstates);
		
		// rp1의 주식 내역
		for(Stock st : rp1.stockList) {
			System.out.println(st.toString());
		}
		
		
		// rp1의 부동산 내역
		for (RealEstate re : rp1.realEstateList) {
			System.out.println(re.toString());
		}
		
		
	}
	
}
