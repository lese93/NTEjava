package javaprac.problem7;

import java.util.ArrayList;
import java.util.List;

public class RichPerson {

	// 부자 소유의 주식리스트
	List<Stock> stockList = new ArrayList<Stock>();
	
	// 부자 소유의 부동산리스트
	List<RealEstate> realEstateList = new ArrayList<RealEstate>();
	

	
	public RichPerson() {

	}


	public RichPerson(List<Stock> stockList, List<RealEstate> realEstateList) {
		this.stockList = stockList;
		this.realEstateList = realEstateList;
	}
	
	
	
	
}
