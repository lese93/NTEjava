package javaprac.problem7;

import java.util.ArrayList;
import java.util.List;

public class RichPerson {

	// ���� ������ �ֽĸ���Ʈ
	List<Stock> stockList = new ArrayList<Stock>();
	
	// ���� ������ �ε��긮��Ʈ
	List<RealEstate> realEstateList = new ArrayList<RealEstate>();
	

	
	public RichPerson() {

	}


	public RichPerson(List<Stock> stockList, List<RealEstate> realEstateList) {
		this.stockList = stockList;
		this.realEstateList = realEstateList;
	}
	
	
	
	
}
